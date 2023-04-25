/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_22_polimorfismo_figuras;

import java.util.Scanner;

/**
 *
 * @author galle
 */
public class EVA_22_POLIMORFISMO_FIGURAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code applicacition logic here
        
       /* ARREGLOS.- Circulo [] circulos = new Circulo [10];
    // un arreglo en java va de la posicion 0 a n-1 (N es la cantidad del arreglo)
    for (int i = 0; i < circulos.length; i++) { //length propiedad de arreglo que tu pusiste
         circulos[i] = new Circulo (5); // creamos cada uno de los objetos 
         circulos[i].imprimirDatos();
         System.out.println("------");
    circulos [0] = new Circulo ();
    circulos[0].calcularArea();
}*/
       Figuras[] figuras; //declarar arreglo sin crear
       Scanner input = new Scanner (System.in); // con el scanner capturar la cantidad de figuras a utilizar
        System.out.println("Figuras a capturar: ");
        int cant = input.nextInt (); // nos permite capturar
        figuras = new Figuras[cant]; // crear el arreglo con la cantidad de figuras que querramos.
        for (int i = 0; i < cant; i++) {
            System.out.println("Captura el tipo de figura");
            System.out.println("1. Circulo, 2. Triangulo");
            int figu= input.nextInt();
           if (figu==1){ // circulo
               Circulo circu = new Circulo();
               System.out.println("Radio?: ");
               circu.setRadio(input.nextDouble());
               figuras[i] = circu;
           } else {// triangulo
               Triangulo trian = new Triangulo();
               System.out.println("Base?: ");
               trian.setBase(input.nextDouble());
               System.out.println("Altura?: ");
               trian.setAltura(input.nextDouble());
                 figuras[i] = trian;
        
    }
    
}
        for (int i = 0; i < figuras.length; i++) {
            if (figuras[i] instanceof Circulo){
                //System.out.println("Circulo");
            Circulo circu = (Circulo)figuras [i]; //casting
            circu.imprimirDatos();
        }else{
                //System.out.println("Triangulo");
                Triangulo trian = (Triangulo) figuras[i];
                trian.imprimirDatos();
            }
            /*
            System.out.println("FIGURA "+ i);
            System.out.println("Area: "+figuras[i].calcularArea());
            System.out.println("Perimetro: "+figuras[i].calcularPerim());
            System.out.println("---------------");
            */
        }
    }
}
