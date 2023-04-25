/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_9_super_2;

/**
 *
 * @author galle
 */
public class EVA2_9_SUPER_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante estu = new Estudiante("Paola","Gallegos",18,"22550322");
        estu.imprimirDatos();
        System.out.println("Num de Control: "+ estu.getNumControl());
        
        Maestros maes = new Maestros("Rosy", "Sanchez", 45,"78285");
        maes.imprimirDatos();
        System.out.println("Plaza: "+maes.getPlaza());
        
        Proveedor prov = new Proveedor ("Luis", "Corral", 42, "COSP020564MM4");
        prov.imprimirDatos();
        System.out.println("RFC: "+prov.getRfc());
    }
    
}
