/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_9_super_2;

/**
 *
 * @author galle
 */
// proveedore is a Persona
public class Proveedor extends Persona {
    private String rfc;

    public Proveedor() {
    }

    public Proveedor(String name, String lastName, int age, String rfc) {
        super(name, lastName, age);
        this.rfc = "---";
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    
    @Override
    public void imprimirDatos (){
         super.imprimirDatos();
        System.out.println("proveedor");
    }
}
