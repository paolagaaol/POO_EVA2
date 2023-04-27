/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_20_vehiculo;

/**
 *
 * @author galle
 */
public class EVA2_20_VEHICULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bicicleta bike = new Bicicleta ("g",0,"e");
        bike.acelerar();
        bike.acelerar();
        bike.imprimirVel();
        bike.detener();
        bike.imprimirVel();
        
        System.out.println("-----------AUTO-----------");
        Automovil auto = new Automovil();
        auto.setMarca("Audi");
        auto.setMotor("V6");
        auto.setPlacas("EPN-985");
        auto.acelerar();
        auto.acelerar();
        auto.acelerar();
        auto.imprimirVel();
                
               

    }
    
}
