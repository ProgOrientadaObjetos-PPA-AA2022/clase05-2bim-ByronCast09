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
        // Transporte Bus : $3.22
        //Promedio de Tarijas
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Transporte> lista1 = new ArrayList<>();

        int r;
        do {
            System.out.println("Ingrese cuantos numeros desea en trasnporte: ");
            int num = sc.nextInt();
            for (int i = 0; i < num; i++) {
                int programa;
                System.out.println("Seleciona una de las opciones\n");
                int opc;
                System.out.println("1) Bus\n"
                        + "2) Taxi\n"
                        + "3) Aereo\n"
                        + "4) Maritimo\n");
                opc = sc.nextInt();
                switch (opc) {
                    case 1:
                        TransporteBus bus = new TransporteBus();
                        bus.establecerCooperativaBus("24 Mayo");
                        bus.establecerTarifa();

                        lista1.add(bus);

                        break;
                    case 2:
                        TransporteTaxi taxi = new TransporteTaxi();
                        taxi.establecerCooperativaTaxi("Yahuarcuna");
                        taxi.establecerTarifa();

                        lista1.add(taxi);

                        
                        break;
                    case 3:
                        TransporteAereo aereo = new TransporteAereo();
                        aereo.establecerCooperativaAereo("AereoLine");
                        aereo.establecerTarifa();

                        lista1.add(aereo);

                        break;
                    case 4:
                        TransporteMaritimo marit = new TransporteMaritimo();
                        marit.establecerCooperativaMaritimo("AereLine");
                        marit.establecerTarifa();

                        lista1.add(marit);

                        break;
                }

            }
            System.out.println("Si desea reiniciar el programa pulse 5, en caso"
                    + " contrario pulso 6");
            r = sc.nextInt();

        } while (r == 5);
        TiposTransporte tipos = new TiposTransporte();
        tipos.establecerTransportes(lista1);
        tipos.establecerPromedioTarifas();
        System.out.print(tipos);
        System.out.println("¡Gracias por usar el Programa!");

    }
}
