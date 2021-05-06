/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.fcys.programacion2.conversionfx.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import ni.edu.uni.fcys.programacion2.conversionfx.core.TemperatureConversion;

/**
 * FXML Controller class
 *
 * @author Sistemas-05
 */
public class TemperatureFXMLController implements Initializable {
    //botones
    @FXML
    public Button btnCompute; 
    @FXML
    public Button btnClean;
    
    //text fields
    @FXML
    public TextField txtCelsius;
    @FXML 
    public TextField txtFah;
    @FXML
    public TextField txtResult;
    
    //rbtn
    @FXML
    public RadioButton rbtnCelsius;
    @FXML
    public RadioButton rbtnFah;
    
    //actions
    @FXML
    public void btnComputeAction(){
        float c=0, f=0;
        if(rbtnCelsius.isSelected()){
            c = Float.parseFloat(txtCelsius.getText());
            f =  TemperatureConversion.fromCelsiusToFahrenheit(c);
            
        }
        else if(rbtnFah.isSelected()){
            c = Float.parseFloat(txtFah.getText());
            f = TemperatureConversion.fromFahrenheitToCelsius(c);
            
        }
        txtResult.setText(String.valueOf(f));
    }
    
    @FXML
    public void btnCleanAction(){
        cleanTextFields();
    }
    @FXML
    public void rbtnCelsiusAction(){
        activateTextField();
    }
    
    @FXML
    public void rbtnFahAction(){
        activateTextField();
    }
    
    private void activateTextField(){
        if(rbtnCelsius.isSelected()){
            txtCelsius.setEditable(true);
            txtCelsius.requestFocus();
            txtFah.setEditable(false);
        }
        else if(rbtnFah.isSelected()){
            txtFah.setEditable(true);
            txtFah.requestFocus();
            txtCelsius.setEditable(false);
        }
        cleanTextFields();
    }
    
    private void cleanTextFields(){
        txtCelsius.setText("");
        txtFah.setText("");
        txtResult.setText("");
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
