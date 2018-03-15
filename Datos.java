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
public class Datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        RecibirDatos datos = new RecibirDatos("Cristian Mundo", "Santa Tecla", "Soltero", 19, 1999, "UCA");
        
        datos.mostrarNombre();
        datos.mostrarEdad();
        datos.mostrarCiudad();
        datos.mostrarNac();
        datos.mostrarCivil();
        datos.mostrarEstudio();
        
    }
    
}
