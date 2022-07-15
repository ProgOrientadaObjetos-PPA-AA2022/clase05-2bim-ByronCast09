/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete10;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
/**
 *
 * @author USUARIO 2020
 */
public class ArchivoEscritura {
    private String nombreArchivo;
    private ObjectOutputStream salida;
    private GeneradorPeliculas registro;
    private ArrayList<GeneradorPeliculas> generadores;

    public ArchivoEscritura(String n) {
        nombreArchivo = n;
        establecerListaGeneradorPeliculas();
        try {
            salida = new ObjectOutputStream(
                    new FileOutputStream(nombreArchivo));
            if (obtenerListaGeneradorPeliculas().size() > 0) {
                for (int i = 0; i < obtenerListaGeneradorPeliculas().size(); i++) {
                    establecerGeneradorPeliculas(obtenerListaGeneradorPeliculas().get(i));
                    establecerSalida();
                }
            }
        } catch (IOException IOexception) {
            System.out.println("Error al abrir el archivo");
        }
    }
    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public void establecerGeneradorPeliculas(GeneradorPeliculas g) {
        registro = g;
    }
    public void establecerSalida() {
        try {
            salida.writeObject(registro);
        } catch (IOException ex) {
            System.out.println("Error al escribir en el archivo");
        }
    }
    public void establecerListaGeneradorPeliculas() {
        ArchivoLectura lectura = new ArchivoLectura(obtenerNombreArchivo());
        lectura.establecerGeneradores();
        generadores = lectura.obtenerGeneradores();
    }
    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }
    public ArrayList<GeneradorPeliculas> obtenerListaGeneradorPeliculas() {
        return generadores;
    }
    public ObjectOutputStream obtenerSalida() {
        return salida;
    }
    public void CerrarArchivo() {
        try {
            if (salida != null) {
                salida.close();
            }
        } catch (IOException ioException) {
            System.out.println("Error al cerrar el archivo");
        }
    }

}
