/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;

/**
 *
 * @author reroes
 */
public class MayorEdad extends Persona{
    private Tarjeta tarje;
    
    public MayorEdad(String n, Tarjeta tar){
        super(n);
        tarje= tar;
    }
    public void establecerTarjeta(Tarjeta n){
        tarje = n;
    }
    
    public Tarjeta obtenerTarjeta(){
        return tarje;
    }

    
}
