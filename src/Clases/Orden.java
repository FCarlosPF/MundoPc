/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author LENOVO
 */
public class Orden {
    
    private int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static final int MAX_COMPUTADORAS=10;

    public Orden() {
        this.idOrden=++Orden.contadorOrdenes;
        this.computadoras=new Computadora[MAX_COMPUTADORAS];
    }
    
    public void agregarComputadora(Computadora computadora){
    
    if(contadorComputadoras<=MAX_COMPUTADORAS){
    this.computadoras[contadorComputadoras++]=computadora;
    }else{
        System.out.println("Se alcanzo el maximo de computadoras disponibles");
    }    
    }
    
    public void mostrarOrden(){
    
        System.out.println("Orden "+this.idOrden);
        for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println(this.computadoras[i]);
        }
        
    }
    
    
}
