/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete10;

/**
 *
 * @author USUARIO 2020
 */
public class Principal2 {
    public static void main(String[] args) {
        String nombreArchivo = "GeneradoresPeli.data";

        APINetflix api = new APINetflix();
        api.establecerApiKey("123455");
        GeneradorPeliculas gp1 = new GeneradorPeliculas();
        gp1.establecerLlave(api);
        gp1.establecerUrl("http://api.movie?api=");
        System.out.println("Netflix");
        System.out.println(gp1.obtenerUrl());
        System.out.println("---------------------------");

        APIAmazonMovie api2 = new APIAmazonMovie();
        api2.establecerApiKey("65342");
        GeneradorPeliculas gp2 = new GeneradorPeliculas();
        gp2.establecerLlave(api2);
        gp2.establecerUrl("http://api.movie?api=");
        System.out.println("AmazonMovie");
        System.out.println(gp2.obtenerUrl());
        System.out.println("---------------------------");

        APIDirectvGo api3 = new APIDirectvGo();
        api3.establecerApiKey("634545");
        GeneradorPeliculas gp3 = new GeneradorPeliculas();
        gp3.establecerLlave(api3);
        gp3.establecerUrl("http://api.movie?api=");
        System.out.println("DirectvGo");
        System.out.println(gp3.obtenerUrl());
        System.out.println("---------------------------");

        APIStarPlus api4 = new APIStarPlus();
        api4.establecerApiKey("634234");
        GeneradorPeliculas gp4 = new GeneradorPeliculas();
        gp4.establecerLlave(api4);
        gp4.establecerUrl("http://api.movie?api=");
        System.out.println("StarPlus");
        System.out.println(gp4.obtenerUrl());

        ArchivoEscritura archivo = new ArchivoEscritura(nombreArchivo);
        archivo.establecerGeneradorPeliculas(gp1);
        archivo.establecerSalida();
        archivo.establecerGeneradorPeliculas(gp2);
        archivo.establecerSalida();
        archivo.establecerGeneradorPeliculas(gp3);
        archivo.establecerSalida();
        archivo.establecerGeneradorPeliculas(gp4);
        archivo.establecerSalida();
        archivo.CerrarArchivo();
    }  
}