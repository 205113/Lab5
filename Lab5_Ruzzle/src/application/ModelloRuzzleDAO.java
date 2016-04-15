package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ModelloRuzzleDAO {
	private char[][] griglia;
	private List<String> soluzioni;

	public ModelloRuzzleDAO(char[][] griglia) {
		this.griglia = griglia;
		soluzioni= new ArrayList<String>();
	}
	
	public List<String> risolvi(){
		boolean [][] possibili= new boolean [griglia.length][griglia[0].length];
		for(int i=0;i<possibili.length;i++){
			for (int j=0;j<possibili[i].length;j++)
				possibili[i][j]=false;
		}
		for(int i=0;i<griglia.length;i++){
			for(int j=0;j<griglia[i].length;j++){
				possibili[i][j]=true;
				risolviRicorsivo(possibili,i,j,"");
				possibili[i][j]=false;
			}
				
		}
		
		return soluzioni;
	}
	public void risolviRicorsivo(boolean[][] possibili,int riga,int colonna,String parola){
	if(esiste(parola)&&parola.length()>1&&!soluzioni.contains(parola)){
		soluzioni.add(parola);
	}
		else{
			if(riga>0)
			{
				if(!possibili[riga-1][colonna]){
					possibili[riga-1][colonna]=true;
					parola+=griglia[riga][colonna];
					risolviRicorsivo(possibili,riga-1,colonna,parola);
					parola=parola.substring(0, parola.length()-1);
					possibili[riga-1][colonna]=false;
				}
			}
		if(riga<griglia[0].length-1)
		{
			if(!possibili[riga+1][colonna]){
				possibili[riga+1][colonna]=true;
				parola+=griglia[riga][colonna];
				risolviRicorsivo(possibili,riga+1,colonna,parola);
				parola=parola.substring(0, parola.length()-1);
				possibili[riga+1][colonna]=false;
			}
		}
		if(colonna>0)
		{
			if(!possibili[riga][colonna-1]){
				possibili[riga][colonna-1]=true;
				parola+=griglia[riga][colonna];
				risolviRicorsivo(possibili,riga,colonna-1,parola);
				parola=parola.substring(0, parola.length()-1);
				possibili[riga][colonna-1]=false;
			}
		}
		if(colonna<griglia[0].length-1)
		{
			if(!possibili[riga][colonna+1]){
				possibili[riga][colonna+1]=true;
				parola+=griglia[riga][colonna];
				risolviRicorsivo(possibili,riga,colonna+1,parola);
				parola=parola.substring(0, parola.length()-1);
				possibili[riga][colonna+1]=false;
			}
		}
		
	}	
	}
	public boolean esiste(String parola){
		// si connette a Db e verifica se parola esista gia o meno
		Connessione c= new Connessione("jdbc:mysql://localhost/dizionario?user=root");
		Connection conn= c.connetti();
		String sql="";
		boolean esiste;
		try {
				sql="SELECT nome FROM parola WHERE nome = ?";
				PreparedStatement s= conn.prepareStatement(sql);
				s.setString(1, parola);
				ResultSet rs= s.executeQuery();
				if(rs.next())
					esiste=true;
				else
					esiste=false;
			conn.close();
			rs.close();
			return esiste;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
