/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

/**
 *
 * @author SALA I
 */
class TransporteAereo {
    private String cooperativaAvion;
    public double tarifaAereo;
    
    public void establecerCooperativaAvion(String n){
        cooperativaAvion = n;
    }
    
    public void establecerTarifaAvion(){
        tarifaAereo = 100.00 + 0.30;
    }
    
    public String obtenerCooperativaAvion(){
        return cooperativaAvion;
    }
    
    public double obtenerTarifaAvion(){
        return tarifaAereo;
    }
}
