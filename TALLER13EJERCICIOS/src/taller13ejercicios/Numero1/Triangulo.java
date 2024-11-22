/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller13ejercicios.Numero1;

/**
 *
 * @author yoven
 */

public class Triangulo extends Figura {

    private double base;
    private double altura;

    
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Implementación del método abstracto calcularArea
    @Override
    public double calcularArea() {
        return (base * altura) / 2; // Fórmula del área de un triángulo
    }
}
