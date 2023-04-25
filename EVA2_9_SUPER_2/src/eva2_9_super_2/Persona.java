/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_9_super_2;

/**
 *
 * @author galle
 */
public class Persona {
    private String name;
    private String lastName;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Persona() {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public Persona(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }
    
    public void imprimirDatos(){
        System.out.println("-----DATOS-----");
        System.out.println("Nombre: "+this.name);
        System.out.println("Apellidos: "+this.lastName);
        System.out.println("Edad: "+this.age);
    }
    
}
