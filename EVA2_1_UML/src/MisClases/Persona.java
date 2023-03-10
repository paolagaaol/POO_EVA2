/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MisClases;

/**
 *
 * @author galle
 */
public class Persona {
    private String nombre;
    private int edad;
    private int id;
    
    //metodos get
    public String getNombre(){
        return nombre;
}
    public int getEdad(){
        return edad;
}
    public int getId(){
        return id;
}
    
    // metodos set
    public void setNombre(String valor){
        nombre = valor; 
    }
    public void setEdad (int valor){
        edad = valor; 
    }
    public void setId (int valor){
        id = valor; 
    }
    
    public void imprimirDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("id: "+id);
    }
}
