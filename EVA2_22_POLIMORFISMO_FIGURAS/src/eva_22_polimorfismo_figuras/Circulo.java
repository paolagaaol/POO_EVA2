package eva_22_polimorfismo_figuras;




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author galle
 */
public class Circulo implements Figuras, MostrarDatos {
    private double radio;

    public Circulo (){
        this.radio = 0;
    }
    
    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularPerim() {
         return Math.PI * (radio*2);
    }
    
    @Override
     public void imprimirDatos (){
        System.out.println("Circulo: ");
        System.out.println("Radio: "+radio);
        System.out.println("Area: "+calcularArea());
        System.out.println("Perimetro: "+calcularPerim());
        System.out.println("---------");
}
}