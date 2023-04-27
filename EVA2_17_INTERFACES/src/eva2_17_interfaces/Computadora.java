/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_17_interfaces;

/**
 *
 * @author galle
 */
public class Computadora extends Producto implements MostrarDatos {
    private String procesador;
    private int memoria;

    public Computadora() {
    }

    public Computadora(String procesador, int memoria, double precio, String nombre) {
        super(precio, nombre);
        this.procesador = procesador;
        this.memoria = memoria;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Nombre: "+ getNombre());
        System.out.println("Precio: "+getPrecio());
        System.out.println("Procesador: "+getProcesador());
        System.out.println("Memoria: "+getMemoria());
    }
}
