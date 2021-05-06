/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.fcys.programacion2.conversionfx.core;

/**
 *
 * @author JADPA02
 */
public class CurrencyConversion {
    public static float fromDolarsToCordobas(float temp){
        
        return temp*35;
    }
    
    public static float fromCordobasToDolar(float temp){
        
        return temp/35;
    }
}
