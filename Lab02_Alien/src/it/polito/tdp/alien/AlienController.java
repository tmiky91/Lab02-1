package it.polito.tdp.alien;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.alien.model.AlienDictionary;
import it.polito.tdp.alien.model.Parola;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AlienController {
	
	AlienDictionary model;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;

    @FXML
    private Button btnTranslate;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnReset;

    @FXML
    void doReset(ActionEvent event) {
    	model.resettaDizionario();
    	txtResult.clear();
    	txtParola.clear();
    }

    @FXML
    void doTranslate(ActionEvent event) {
    	
    	String[] split=txtParola.getText().toLowerCase().split(" ");
    	
    	
    	if(split.length==2) {
    		if(!split[0].matches("[a-zA-Z]*") && !split[1].matches("[a-zA-Z]*")) { //matches serve per cercare corrispondenze con il format indicato in questo caso [a-zA-Z]*
        		txtResult.setText("Stringa non valida");
        	}
    		else {
    			model.addWord(split[0], split[1]);
    			txtResult.setText("Parola aggiunta al dizionario");
    			txtParola.clear();
    		}
    	}
    	else {
    		if(!split[0].matches("[a-zA-Z]*")) {
        		txtResult.setText("Stringa non valida");
        	}
    		else {
    			txtResult.setText(model.translateWord(txtParola.getText()));
    		}
    	}

    }

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Alien.fxml'.";
        assert btnTranslate != null : "fx:id=\"btnTranslate\" was not injected: check your FXML file 'Alien.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Alien.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Alien.fxml'.";
        
        model= new AlienDictionary();

    }
}
