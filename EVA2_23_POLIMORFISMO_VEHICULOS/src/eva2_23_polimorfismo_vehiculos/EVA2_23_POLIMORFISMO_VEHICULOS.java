/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_23_polimorfismo_vehiculos;

/**
 *
 * @author galle
 */
public class EVA2_23_POLIMORFISMO_VEHICULOS {

    public static void main(String[] args) {
        Automovil auto = new Automovil("X5", 2014, 0, "BMW");
        
        cambiarVelocidad(auto,50);
        bicicleta bici = new bicicleta("MONTAÑA", "XXX", 0, "Harley Davidson");
       cambiarVelocidad(bici,15);
      
       //Clase Object --->
        Object obj = auto;
        
    }
    public static void cambiarVelocidad(DatosVehiculo vehi, int vel){
        vehi.acelerar(vel);
        vehi.tablero();
    }
}

interface DatosVehiculo{
  public abstract void acelerar(int cambio);
  void tablero();
}

class Vehiculo{
     protected int velocidad;
     private String brand;

    public Vehiculo() {
        this.brand="----";
        this.velocidad=0;
    }

    public Vehiculo(int velocidad, String brand) {
        this.velocidad = velocidad;
        this.brand = brand;
    }
// La velocidad se va a modificar con  el método "Acelerar"
    public int getVelocidad() {
        return velocidad;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    
}

class Automovil extends Vehiculo implements DatosVehiculo{

  private String model;
  private int year;

    public Automovil() {
        super();
        this.model="----";
        this.year=0;
    }

    public Automovil(String model, int year, int velocidad, String brand) {
        super(velocidad, brand);
        this.model = model;
        this.year = year;
    }

   

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void acelerar(int cambio) {
        int cambioVe1 = velocidad + cambio;
        if(cambioVe1>=0)
            velocidad=cambioVe1;
    } 
    @Override
    public void tablero() {
        System.out.println("Velocidad del automovil: "+getVelocidad());
    } 
}
  class bicicleta extends Vehiculo implements DatosVehiculo{
    private String tipo;
    private String rodada;

        public bicicleta() {
            super();
            this.rodada="-----";
            this.tipo="-----";
        }

        public bicicleta(String tipo, String rodada, int velocidad, String brand) {
            super(velocidad, brand);
            this.tipo = tipo;
            this.rodada = rodada;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public String getRodada() {
            return rodada;
        }

        public void setRodada(String rodada) {
            this.rodada = rodada;
        }
        
      @Override
    public void acelerar(int cambio) {
        int cambioVe1 = velocidad + cambio;
        if(cambioVe1>=0)
            velocidad=cambioVe1;
    } 
    @Override
    public void tablero() {
        System.out.println("Velocidad del bicicleta: "+getVelocidad());
    } 
    
    
  }

