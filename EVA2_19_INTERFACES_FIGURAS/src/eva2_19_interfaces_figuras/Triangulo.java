/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_19_interfaces_figuras;

/**
 *
 * @author galle
 */
public class Triangulo implements Figuras, MostrarDatos {
    private double base;
    private double altura;
    private double hip;

    public double getHip() {
        return hip;
    }

    public void setHip(double hip) {
        this.hip = hip;
    }
    
    public Triangulo() {
        this.base = 0;
        this.altura = 0;
        this.hip = 0;
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        this.hip = hip;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
       return (base * altura)/2;
    }

    @Override
    public double calcularPerim() {
        double hip = Math.hypot(base, altura);
        return base + altura + hip;
    }
    
    @Override
    public void imprimirDatos (){
        System.out.println("Triangulo: ");
        System.out.println("Base: "+base);
        System.out.println("Altura: "+altura);
        System.out.println("Area: "+calcularArea());
        System.out.println("Perimetro: "+calcularPerim());
    }
}
