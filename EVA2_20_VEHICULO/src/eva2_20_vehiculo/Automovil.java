/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_20_vehiculo;

/**
 *
 * @author galle
 */
public class Automovil extends Vehiculo implements Control_Velocidad{
    private String motor;
    private String placas;

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }
    
    ///////////////////////////////////////////
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
    public int detener() {
       if (velocidad>0)
            velocidad--;
        return velocidad;
    }
    }

    
     

