/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_override;

/**
 *
 * @author galle
 */
public class EVA2_10_OVERRIDE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona perso = new Persona();
        Persona perso2 = new Persona ("Mike Ross", 30);
        System.out.println(perso);
        System.out.println(perso2);
        
    }
    
}

class Persona {
    private String nombre;
    private int edad;
    
    public Persona (){
        this.nombre = "--";
        this.edad=0;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    @Override
    public String toString (){
        // NO SE ESTA INVOCANDO EL METODO SOBREESCRITA DE LA SUPER CLASE
        // SE ESTA REEMPLAZANDO TOTALMENTE A toString DE LA SUPER CLASE
      String cade = "Datos: \n" +
                    "Nombre: "+nombre +"\n"+
                    "Edad: "+edad;
      return cade;
    }
}
