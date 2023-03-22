/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_11_override_figuras;

/**
 *
 * @author galle
 */
public class Triangulo extends Figuras{
    private double altura;
    private double base;
    
    public Triangulo (){
        this.altura = 0;
        this.base = 0;
    }

    public Triangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
    @Override
    public double calcularArea (){
        return (base*altura)/2;
    }
    
    @Override
    public double calcularPerim (){
        return (base + base + base);
    }
}
