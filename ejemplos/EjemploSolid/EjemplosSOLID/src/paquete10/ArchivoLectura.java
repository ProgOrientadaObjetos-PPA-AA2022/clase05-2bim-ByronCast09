/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete10;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
/**
 *
 * @author USUARIO 2020
 */
public class ArchivoLectura {
    private ObjectInputStream entrada;
    private ArrayList<GeneradorPeliculas> generadores;
    private String nombreArchivo;

    public ArchivoLectura(String n) {
        nombreArchivo = n;
        File f = new File(nombreArchivo);
        if (f.exists()) {
            try {
                entrada = new ObjectInputStream(
                        new FileInputStream(n));
            } catch (IOException ioException) {
                System.out.println("Error al abrir el archivo" + ioException);
            }
        }
    }
    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }
    public void establecerGeneradores() {
        generadores = new ArrayList<>();
        File f = new File(nombreArchivo);
        if (f.exists()) {
            while (true) {
                try {
                    GeneradorPeliculas generador =(GeneradorPeliculas) entrada.readObject();
                    generadores.add(generador);

                } catch (EOFException endOfFileException) {
                    return;
                } catch (IOException ex) {
                    System.out.println("Error al leer el archivo");
                } catch (ClassNotFoundException ex) {
                    System.out.println("No se pudo crear el objeto" + ex);
                    
                }
            }
        }
    }
    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }
    public ArrayList<GeneradorPeliculas> obtenerGeneradores() {
        return generadores;
    }
    @Override
    public String toString() {
        String cadena = "Lista de Generador de Peliculas\n";
        for (int i = 0; i < obtenerGeneradores().size(); i++) {
            GeneradorPeliculas p = obtenerGeneradores().get(i);
            cadena = String.format("%s(%d) %s\n", cadena,i + 1,
                    p.obtenerUrl());
        }
        return cadena;
    }
    public void CerrarArchivo() {
        try {
            if (entrada != null) {
                entrada.close();
            }
        } catch (IOException ioException) {
            System.out.println("Error al cerrar el archivo");
        }
    }
}
