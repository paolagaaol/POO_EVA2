/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Productos;

import SuperClases.Ropa;

/**
 *
 * @author galle
 */
public class Playera extends Ropa {
    private String talla;
    private String tipo;

    public Playera(String talla, String tipo, String marca, String color) {
        super(marca, color);
        this.talla = talla;
        this.tipo = tipo;
    }

    public Playera (){
        this.talla ="";
        this.tipo = "";
    }
    public Playera(String talla, String tipo) {
        this.talla = talla;
        this.tipo = tipo;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public double precioVenta(int cant) {
      if (cant < 10)
           return getPrecio() * cant;
       else
           return (getPrecio()*0.8)*cant; //descuento
    }
    }
    
