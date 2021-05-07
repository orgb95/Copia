/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.fcys.programacion2.conversionfx.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import ni.edu.uni.fcys.programacion2.conversionfx.core.CurrencyConversion;

/**
 * FXML Controller class
 *
 * @author Sistemas-05
 */
public class CurrencyFXMLController implements Initializable {
    @FXML
    public ComboBox cmbFrom;
    @FXML
    public ComboBox cmbTo;
    @FXML
    public TextField txtFrom;
    @FXML
    public TextField txtResult;
    @FXML
    public Button btnCompute;
    private ObservableList<String> items;
    @FXML
    public Button btnClear;
    @FXML
    public void btnComputeAction(){
        float from = 0,result=0;
        if(cmbFrom.getValue().equals("Cordobas")){
            from = Float.parseFloat(txtFrom.getText());
            if(cmbTo.getValue().equals("Dolares")){
                from = Float.parseFloat(txtFrom.getText());
                result =  CurrencyConversion.fromCordobasToDolar(from);
            }else if(cmbTo.getValue().equals("Euro")){
                from = Float.parseFloat(txtFrom.getText());
                result =  CurrencyConversion.fromCordobasToEuros(from);
            }else {
                result = from;
            }
        }else if(cmbFrom.getValue().equals("Dolares")){
            from = Float.parseFloat(txtFrom.getText());
            if(cmbTo.getValue().equals("Cordobas")){
                from = Float.parseFloat(txtFrom.getText());
                result =  CurrencyConversion.fromDolarsToCordobas(from);
            }else if(cmbTo.getValue().equals("Euro")){
                from = Float.parseFloat(txtFrom.getText());
                result =  CurrencyConversion.fromDolarsToEuros(from);
            }else {
                result = from;
            }
        }else if(cmbFrom.getValue().equals("Euros")){
            from = Float.parseFloat(txtFrom.getText());
            if(cmbTo.getValue().equals("Cordobas")){
                from = Float.parseFloat(txtFrom.getText());
                result =  CurrencyConversion.fromEurosToCordobas(from);
            }else if(cmbTo.getValue().equals("Dolar")){
                from = Float.parseFloat(txtFrom.getText());
                result =  CurrencyConversion.fromEurosToDolars(from);
            }else {
                result = from;
            }
        }
        
        txtResult.setText(String.valueOf(result));
        
    }
    
    public void btnClearAction(){
        cleanTextFields();
    }
    
    private void cleanTextFields(){
        txtFrom.setText("");
        txtResult.setText("");
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        items = FXCollections.observableArrayList("Cordobas","Dolar","Euro");
        cmbFrom.setItems(items);
        cmbTo.setItems(items);
    }    
    
}
