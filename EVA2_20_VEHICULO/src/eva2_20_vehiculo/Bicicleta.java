/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_20_vehiculo;

/**
 *
 * @author galle
 */
public class Bicicleta extends Vehiculo implements Control_Velocidad {
    private String tipo;

    public Bicicleta() {
        this.tipo = "";
    }

    public Bicicleta(String tipo, int velocidad, String marca) {
        super(velocidad, marca);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public int acelerar (){
        if (velocidad<200)
            velocidad ++;
        return velocidad;
    }
    
   
    
    @Override
    public void imprimirVel(){
        System.out.println("Velocidad: "+velocidad);
    }

    @Override
    public int detener (){
        if (velocidad>0)
            velocidad--;
        return velocidad;
    }
    
}
