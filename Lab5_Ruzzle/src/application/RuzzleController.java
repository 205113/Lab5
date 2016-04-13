package application;

import java.net.URL;
import java.util.ResourceBundle;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class RuzzleController {
	private ModelloRuzzle model;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button genera;
    
    @FXML
    private ListView<?> parole;

    @FXML
    private Label lbl11;

    @FXML
    private Label lbl12;

    @FXML
    private Label lbl13;

    @FXML
    private Label lbl14;

    @FXML
    private Label lbl21;

    @FXML
    private Label lbl31;

    @FXML
    private Label lbl41;

    @FXML
    private Label lbl22;

    @FXML
    private Label lbl24;

    @FXML
    private Label lbl23;

    @FXML
    private Label lbl32;

    @FXML
    private Label lbl42;

    @FXML
    private Label lbl33;

    @FXML
    private Label lbl34;

    @FXML
    private Label lbl43;

    @FXML
    private Label lbl44;

    public void setModel(ModelloRuzzle m){
    	this.model=m;
    }
    @FXML
    void doGenera(ActionEvent event) {
    	char[] []griglia= model.genera(4);
    	lbl11.setText(griglia[0][0]+"");
    	lbl12.setText(griglia[0][1]+"");
    	lbl13.setText(griglia[0][2]+"");
    	lbl14.setText(griglia[0][3]+"");
    	lbl21.setText(griglia[1][0]+"");
    	lbl22.setText(griglia[1][1]+"");
    	lbl23.setText(griglia[1][2]+"");
    	lbl24.setText(griglia[1][3]+"");
    	lbl31.setText(griglia[2][0]+"");
    	lbl32.setText(griglia[2][1]+"");
    	lbl33.setText(griglia[2][2]+"");
    	lbl34.setText(griglia[2][3]+"");
    	lbl41.setText(griglia[3][0]+"");
    	lbl42.setText(griglia[3][1]+"");
    	lbl43.setText(griglia[3][2]+"");
    	lbl44.setText(griglia[3][3]+"");
    	
    }

    @FXML
    void initialize() {
        assert genera != null : "fx:id=\"genera\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert lbl11 != null : "fx:id=\"lbl11\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert lbl12 != null : "fx:id=\"lbl12\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert lbl13 != null : "fx:id=\"lbl13\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert lbl14 != null : "fx:id=\"lbl14\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert lbl21 != null : "fx:id=\"lbl21\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert lbl31 != null : "fx:id=\"lbl31\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert lbl41 != null : "fx:id=\"lbl41\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert lbl22 != null : "fx:id=\"lbl22\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert lbl24 != null : "fx:id=\"lbl24\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert lbl23 != null : "fx:id=\"lbl23\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert lbl32 != null : "fx:id=\"lbl32\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert lbl42 != null : "fx:id=\"lbl42\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert lbl33 != null : "fx:id=\"lbl33\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert lbl34 != null : "fx:id=\"lbl34\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert lbl43 != null : "fx:id=\"lbl43\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert lbl44 != null : "fx:id=\"lbl44\" was not injected: check your FXML file 'Ruzzle.fxml'.";

    }
}
