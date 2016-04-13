package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ModelloRuzzle {
	private char[][] griglia;
	private List<Character> alfabeto;

	public ModelloRuzzle() {
		alfabeto= new ArrayList<Character>();
		for(int i=0;i<26;i++){
			char e=(char) (97+i);
			alfabeto.add(e);
			}
	}
	
	public char[][] genera(int lato){
		this.griglia = new char[lato][lato];
		Random r= new Random();
		for(int i=0;i<griglia.length;i++){
			for(int j=0;j<griglia[i].length;j++){
				double indice= Math.random()*26;
				//System.out.println(indice);
				griglia[i][j]= alfabeto.get((int)indice);
			}
		}
		
		return this.griglia;
	}
	public List<String> risolvi(){
		ModelloRuzzleDAO m=new ModelloRuzzleDAO(this.griglia);
		return m.risolvi();
	}
	
	/*public static void main(String[] args){
		ModelloRuzzle m= new ModelloRuzzle();
		char [][] matrice=m.genera(3);
		for(int i=0;i<matrice.length;i++){
			for(int j=0;j<matrice[i].length;j++){
				System.out.println(matrice[i][j]);
			}
	
		}
	}*/
}
