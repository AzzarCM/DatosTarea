/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author cmundo
 */
public class RecibirDatos {
   String nombre, ciudad, civilStatus, estudio;
   int edad, nacimiento;
   
   public RecibirDatos(String nombre, String ciudad, String civilStatus, int edad, int nacimiento, String estudio){
       
       this.ciudad = ciudad;
       this.civilStatus = civilStatus;
       this.edad = edad;
       this.nacimiento = nacimiento;
       this.nombre = nombre;
       this.estudio = estudio;
       
   }
   public void mostrarNombre(){
       
       System.out.println("Mi nombre es: " + nombre);
   }
   public void mostrarEdad(){
       
       System.out.println("Mi edad es: " + edad);
   }
   
   public void mostrarEstudio(){
       
       System.out.println("Estudio en: " + estudio);
   }
   
   public void mostrarNac(){
       
       System.out.println("Naci el: " + nacimiento);
       
   }
   public void mostrarCivil(){
       
       System.out.println("estoy: " + civilStatus);
       
   }
   public void mostrarCiudad(){
       
       System.out.println("vivo en : " + ciudad);
       
   }
  
   
   
   
    
}
