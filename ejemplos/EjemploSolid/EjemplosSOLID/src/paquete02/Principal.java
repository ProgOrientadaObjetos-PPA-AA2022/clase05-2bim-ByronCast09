/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {
        //1.CREAR 3 ESTUDIANTES
        Persona est1 = new Persona("Jose",20);
        Persona est2 = new Persona("Sebastian",21);
        Persona est3 = new Persona("Sofia",22);
        //2. AGREGAR A UN ARRAYLIST
        ArrayList<Persona> listaEst = new ArrayList<>();
        listaEst.add(est1);
        listaEst.add(est2);
        listaEst.add(est3);  
        //3. gENERAR EL OBJETO DE TIPO OPERACIONES ESTUDIANTE
        OperacionesEstudiantes opE = new OperacionesEstudiantes();
        opE.establecerEstudiante(listaEst);
        opE.establecerPromedioEdades();
        opE.establecerPromedioEdadesCualitativo();
        //4. PRESENTA EL TOSTRING DE OPERACIONES ESTUDIANTE
       
        System.out.printf("%s\n",opE);
    }
}
