/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import java.util.ArrayList;


/**
 *
 * @author reroes
 */
public class TiposTransporte {
    private double promedioTarifas;
    private ArrayList<Transporte> transportes; // puedo tener muchos tipos de Transporte
    
    
    public void establecerTransportes(ArrayList<Transporte> t){
        transportes = t;
    }
    
    public ArrayList<Transporte> obtenerTransportes(){
        return transportes;
    }
    
    public void establecerPromedioTarifas(){
        double suma = 0;
        for (int i = 0; i < obtenerTransportes().size(); i++) {
            suma = suma + obtenerTransportes().get(i).obtenerTarifa();
        }
        promedioTarifas = suma / obtenerTransportes().size();
        
    }
    
    public double obtenerPromedioTarifas(){
        return promedioTarifas;
    }
    
    @Override
    public String toString() {
        String cadenafinal = String.format("Reporte");
        for (Transporte e : obtenerTransportes()) {
            cadenafinal = String.format("Transporte Bus: %.2f\n"
                    +"Transporte Maritimo: %.2f\n"
                    +"Transporte Bus: %.2f\n",cadenafinal, e.obtenerTarifa(),
                    e.obtenerTarifa(),e.obtenerTarifa());
        }
        cadenafinal = String.format("%sPromedio de edades: %.2f\n",cadenafinal,
                promedioTarifas);
        return cadenafinal;
    }
}
