/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Mundopc;

import Clases.Computadora;
import Clases.Monitor;
import Clases.Orden;
import Clases.Raton;
import Clases.Teclado;

/**
 *
 * @author LENOVO
 */
public class MundoPc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Teclado teclado1 = new Teclado("cable","asus");
        Raton raton1 = new Raton("cable", "hp");
        Monitor monitor1= new Monitor("hp",15);
        Computadora computadora1 = new Computadora("lenovo",monitor1, teclado1, raton1);
        
        
        Teclado teclado2 = new Teclado("cable","LUXIUS");
        Raton raton2 = new Raton("cable", "luxius");
        Monitor monitor2= new Monitor("luxius",18);
        Computadora computadora2 = new Computadora("chafa",monitor2, teclado2, raton2);
        
        Orden orden1 = new Orden();
        
        orden1.agregarComputadora(computadora1);
        orden1.agregarComputadora(computadora2);
        orden1.mostrarOrden();
        
        
    }
    
}
