/*
S — Single responsibility principle 
    Principio de responsabilidad única
 */
package paquete02;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class OperacionesEstudiantes {

    private ArrayList<Persona> estudiantes;
    private double promedioEdades;
    private String promedioEdadesCualitativo;
    // private double edadminima;
    
    //promedioEdadesCualitativo:
    //promedio jovenes: mayor igual a 0 y menor igual a 21
    //promedio adulto : mayor a 21
    public void establecerEstudiante(ArrayList<Persona> lista) {
        estudiantes = lista;
    }

    public ArrayList<Persona> obtenerEstudiante() {
        return estudiantes;
    }
    public void establecerPromedioEdadesCualitativo(){
        
            if(promedioEdades >= 0 && promedioEdades <=21){
                promedioEdadesCualitativo = "promedio jovenes";
            }else{
                if (promedioEdades >21) {
                    promedioEdadesCualitativo = "promedio adulto";
                }
            }
        }
    
    public void establecerPromedioEdades() {
        double suma = 0;
        for (Persona e : obtenerEstudiante()) {
            suma = suma + e.obtenerEdad();
        }
        promedioEdades = suma / obtenerEstudiante().size();
    }

    public double obtenerPromedioEdades() {
        return promedioEdades;
    }
    public String obtenerPromedioEdadesCualitativo(){
        return promedioEdadesCualitativo;
    }

    @Override
    public String toString() {
        String cadenafinal = String.format("");
        for (Persona e : obtenerEstudiante()) {
            cadenafinal = String.format("%sNombre: %s\n",cadenafinal, e.obtenerNombre());
        }
        cadenafinal = String.format("%sPromedio de edades: %.2f\n"
                + "Promedio Cualitativo: %s\n", cadenafinal,
                promedioEdades,promedioEdadesCualitativo);
        return cadenafinal;
    }
    
}
        