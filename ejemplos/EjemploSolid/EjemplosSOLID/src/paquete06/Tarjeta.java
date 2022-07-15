/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;

/**
 *
 * @author USUARIO 2020
 */
public class Tarjeta {

    private String nombreBanco;
    private double cupoMaximo;

    public Tarjeta(String nombreBanco, double cupoMaximo) {
        this.nombreBanco = nombreBanco;
        this.cupoMaximo = cupoMaximo;
    }

    public void establecerNombreBanco(String n){
        nombreBanco = n;
    }
    public void establecerCupoMaximo(double c){
        cupoMaximo = c;
    }
    public String obtenerNombreBanco(){
        return nombreBanco;
    }
    public double obtenerCupoMaximo(){
        return cupoMaximo;
    }
    @Override
    public String toString() {
        String cadena = String.format("Nombre del Banco: %s\n"
                , obtenerNombreBanco()
      );
        return cadena;
    }
}

