/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_3_extends;

/**
 *
 * @author galle
 */
public class EVA2_3_EXTENDS {

    public static void main(String[] args) {
      Estudiante alumno = new  Estudiante();
      alumno.setName("Paola");
      alumno.setLastName("Gallegos");
      alumno.setAge(18);
      alumno.setNumControl("22550322");
       System.out.println("Nombre: "+alumno.getName());
     System.out.println("Apellido: "+alumno.getLastName());
     System.out.println("Edad: "+alumno.getAge());
     System.out.println("Nombre: "+alumno.getName());
     System.out.println("Num de control: "+alumno.getNumControl());
     
        System.out.println("-------------------");
     Proveedor prove_1 = new Proveedor();
     prove_1.setName("fran");
     prove_1.setLastName("fhsiav");
     prove_1.setAge(24);
     prove_1.setRfc("fran020506MM4");
     
     System.out.println("Nombre: "+prove_1.getName());
     System.out.println("Apellido: "+prove_1.getLastName());
     System.out.println("Edad: "+prove_1.getAge());
     System.out.println("Nombre: "+prove_1.getName());
     System.out.println("RFC:"+prove_1.getRfc());

     


        }
}