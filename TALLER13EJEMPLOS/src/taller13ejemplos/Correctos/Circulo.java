/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller13ejemplos.Correctos;

/**
 *
 * @author yoven
 */

public class Circulo extends FiguraAbstracta {

    private double radio; 

    
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Implementación del método abstracto para calcular el área
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio; // Fórmula del área del círculo
    }
}
