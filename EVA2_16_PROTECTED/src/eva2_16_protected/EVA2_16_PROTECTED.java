/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_16_protected;

/**
 *
 * @author galle
 */
public class EVA2_16_PROTECTED {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    SuperClase objS = new SuperClase ();
    objS.dato= 100;
    }
    
}

class SuperClase {
    protected int dato;
}

class SubClase extends SuperClase {
    public void imprimirDato (){
        System.out.println("Dato: "+dato);
    }
}
