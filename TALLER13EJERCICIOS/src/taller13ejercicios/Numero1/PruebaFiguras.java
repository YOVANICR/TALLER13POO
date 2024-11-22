/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller13ejercicios.Numero1;

/**
 *
 * @author yoven
 */

public class PruebaFiguras {
    public static void main(String[] args) {
        // Creo un rectángulo con largo 5 y ancho 3
        Rectangulo rectangulo = new Rectangulo(5, 3);

        // Creo un triángulo con base 4 y altura 6
        Triangulo triangulo = new Triangulo(4, 6);

       
        System.out.println("Area del rectangulo: " + rectangulo.calcularArea());
        System.out.println("Area del triangulo: " + triangulo.calcularArea());
    }
}
