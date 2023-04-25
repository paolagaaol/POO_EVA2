/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_9_super_2;

/**
 *
 * @author galle
 */

// Estudiante is a Persona
public class Estudiante extends Persona {

    public Estudiante() {
        super();
        this.numControl = "---";
    }

    public Estudiante(String name, String lastName, int age, String numControl) {
        super(name, lastName, age);
        this.numControl = "---";
    }
    private String numControl;
      
    
    public String getNumControl() {
        return numControl;
    }

    public void setNumControl(String numControl) {
        this.numControl = numControl;
    }
    
    // override: oculta el metodo (con la misma firma) en la superclase
    // en este caso, reemplaza a imprimirDatos(); de Persona
    @Override
    public void imprimirDatos(){
      /*  System.out.println("Nombre: "+ getName());
        System.out.println("Apellido: "+ getLastName());
        System.out.println("Edad: "+getAge());
        System.out.println("No Control: "+ getNumControl()); */
      super.imprimirDatos();
        System.out.println("estudiante");
    }
    
}
