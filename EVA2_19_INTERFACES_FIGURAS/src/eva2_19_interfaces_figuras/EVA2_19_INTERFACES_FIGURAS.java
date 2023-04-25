/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_19_interfaces_figuras;

/**
 *
 * @author galle
 */
public class EVA2_19_INTERFACES_FIGURAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // NO SE PUEDEM CREAR INSTANCIAS DE INTERFACES
        Circulo cir = new Circulo (20);
       cir.imprimirDatos();
       
         System.out.println("--------------------------");
       Triangulo tri = new Triangulo ();
       tri.setBase(20);
       tri.setAltura(20);
       tri.imprimirDatos();
       
        System.out.println("--------------------------");
     
    }
    
}
