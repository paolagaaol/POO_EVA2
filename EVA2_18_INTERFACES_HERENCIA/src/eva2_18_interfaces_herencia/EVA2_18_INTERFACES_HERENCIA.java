/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_18_interfaces_herencia;

/**
 *
 * @author galle
 */
public class EVA2_18_INTERFACES_HERENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    
}

interface intA{
    void A (); //incluido el public abstract
}

interface intB{
    void B ();
}

interface intC extends intA, intB {
    void C ();
}

class Prueba implements intC{

    @Override
    public void C() {
        
    }

    @Override
    public void A() {
        
    }

    @Override
    public void B() {
       
    }
    
}