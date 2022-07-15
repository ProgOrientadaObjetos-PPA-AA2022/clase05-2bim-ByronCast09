/*
 * L — Liskov substitution principle (Principio de sustitución de Liskov) 
 */
package paquete06;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        
        Tarjeta tc = new Tarjeta("Banco de Loja",500.3);
        
        MayorEdad representante = new MayorEdad("José",tc);
        
        MenorEdad menor = new MenorEdad("Felipe", representante);
        
        
        System.out.printf("Nombre:%s - Tarjeta:%s\nCupo Maximo: %.2f",
                menor.obtenerRepresentante().obtenerNombre(),
                menor.obtenerRepresentante().obtenerTarjeta(),
                menor.obtenerRepresentante().obtenerTarjeta().obtenerCupoMaximo());
        
    }
}
