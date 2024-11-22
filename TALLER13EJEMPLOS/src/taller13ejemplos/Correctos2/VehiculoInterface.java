/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller13ejemplos.Correctos2;

/**
 *
 * @author yoven
 */

public interface VehiculoInterface {

    
    void acelerar();

    
    default void encender() {
        System.out.println("El vehiculo esta encendido");
    }
}
