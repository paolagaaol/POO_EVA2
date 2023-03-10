/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MisClases;

/**
 *
 * @author galle
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private int año;
    
    //metodos get
      public String getMarca(){
        return marca;
}
    public String getModelo(){
        return modelo;
}
    public int getAño(){
        return año;
}
    
    // metodos set
    public void setMarca (String valor){
        marca = valor; 
    }
    public void setModelo (String valor){
        modelo = valor; 
    }
    public void setAño (int valor){
        año = valor; 
    }
     public void imprimirDatos(){
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Año: "+año);
    }
}
