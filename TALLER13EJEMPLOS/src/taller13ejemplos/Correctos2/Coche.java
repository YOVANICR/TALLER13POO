/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller13ejemplos.Correctos2;

/**
 *
 * @author yoven
 */

public class Coche implements VehiculoInterface {

    // Implementación del método abstracto acelerar
    @Override
    public void acelerar() {
        System.out.println("El coche esta acelerando");
    }
}
