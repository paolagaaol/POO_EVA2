/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_8_super;

/**
 *
 * @author galle
 */
public class EVA2_8_SUPER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Animal animal = new Animal(":))",10);
    Mamifero mamifero = new Mamifero ("juan", "verde", 10);
     
    }
    
}


class Animal{
    private String nombre;
    private int peso;

    public Animal(String nombre, int peso) {
        this.nombre = nombre;
        this.peso = peso;
          System.out.println("ITS ALIVE!! c2");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public Animal(){
        System.out.println("ITS ALIVE!!");
    }
    public void respirar (){
        System.out.println("Estoy respirando");
    }
}

class Mamifero extends Animal {

    private String colorPelo;

    public Mamifero(String colorPelo, String nombre, int peso) {
        super(nombre, peso);  // llamada al construtor de la super clase
        this.colorPelo = colorPelo;
         System.out.println("Soy un mamifero!! c2 ");
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }
      public Mamifero(){
    // super --> apuntador a la superclase
    // lo primero a llamar en un constructor es llamar al constructor super clase
         super(); // llamada al constructor default
          System.out.println("Soy un mamifero!! ");
      }
      
 
      
  
}