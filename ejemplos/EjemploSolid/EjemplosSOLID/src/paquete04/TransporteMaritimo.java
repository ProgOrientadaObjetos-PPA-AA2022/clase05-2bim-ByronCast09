/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

/**
 *
 * @author reroes
 */
public class TransporteMaritimo extends Transporte {

    private String cooperativaMaritimo;

    public void establecerCooperativaMaritimo(String n) {
        cooperativaMaritimo = n;
    }

    @Override
    public void establecerTarifa() {
        tarifa = 1000.00 + 0.01;
    }

    public String obtenerCooperativaAereo() {
        return cooperativaMaritimo;
    }

    @Override
    public String toString() {
        String cadena = String.format("Trasnporte Maritimo: %.2f", tarifa);
        return cadena;
    }
}
