/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author LENOVO
 */
public class Teclado extends DispositivoEntrada{
    
   private int idTeclado;
   private static int contadorTeclado;

    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idTeclado = idTeclado;
        this.idTeclado=++Teclado.contadorTeclado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Teclado{");
        sb.append("idTeclado=").append(idTeclado);
        sb.append("dispositivoEntrada=").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
   
   
    
    
}
