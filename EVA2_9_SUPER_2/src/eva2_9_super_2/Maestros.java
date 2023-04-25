/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_9_super_2;

/**
 *
 * @author galle
 */
//Maestro is a Persona
public class Maestros extends Persona {
    private String plaza;

    public Maestros() {
    }

    public Maestros(String name, String lastName, int age, String plaza) {
        super(name, lastName, age);
        this.plaza = "----";
             
    }

    public String getPlaza() {
        return plaza;
    }

    public void setPlaza(String plaza) {
        this.plaza = plaza;
    }
    
    @Override
    public void imprimirDatos (){
 
     super.imprimirDatos();
        System.out.println("maestro");
    }
}
