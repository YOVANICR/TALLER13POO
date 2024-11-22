/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller13ejercicios.Numero3;

/**
 *
 * @author yoven
 */

public abstract class AnimalAbstracto {

    
    public abstract void hacerSonido();

    // Intento de definir un método predeterminado
    // Esto no es válido en una clase abstracta
    public void metodoPredeterminado() {
        System.out.println("Esto no es un metodo predeterminado valido en una clase abstracta");
    }
}
