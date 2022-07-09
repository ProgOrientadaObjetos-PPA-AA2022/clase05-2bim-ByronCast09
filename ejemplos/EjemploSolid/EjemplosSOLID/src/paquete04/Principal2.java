/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class Principal2 {

    public static void main(String[] args) {
        //1.Agregar por teclado n numeros de trasnporte (el usuario decide finalizar)
        //Bus.Taxi.Aereo.Maritimo
        //Presentar reporte de Transporte
        // Reporte
        // Transporte Bus: $1.00
        // Transporte Maritimo: $1000.1
        // Trasnporte Bus : $3.22
        //Promedio de Tarijas
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese cuantos numeros desea en trasnporte: ");
        int num = sc.nextInt();
        int opc = 1;
        do {
            switch (opc) {
            case 1:
                TransporteBus bus = new TransporteBus();
                bus.establecerCooperativaBus("24 Mayo");
                bus.establecerTarifa();

                TransporteTaxi taxi = new TransporteTaxi();
                taxi.establecerCooperativaTaxi("Yahuarcuna");
                taxi.establecerTarifa();

                TransporteAereo aereo = new TransporteAereo();
                aereo.establecerCooperativaAereo("AereLine");
                aereo.establecerTarifa();

                ArrayList<Transporte> lista = new ArrayList<>();
                lista.add(bus);
                lista.add(taxi);
                lista.add(aereo);

                TiposTransporte tipos = new TiposTransporte();
                tipos.establecerTransportes(lista);
                tipos.establecerPromedioTarifas();
                
                System.out.printf("Promedio de Tarifas: %.2f\n", 
                tipos.obtenerPromedioTarifas());
            case 2:
                
        }
        } while (true);
        
        
    }
}
