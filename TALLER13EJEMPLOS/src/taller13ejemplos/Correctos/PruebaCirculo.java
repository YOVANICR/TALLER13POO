/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller13ejemplos.Correctos;

/**
 *
 * @author yoven
 */

public class PruebaCirculo {
    public static void main(String[] args) {
       
        Circulo circulo = new Circulo(5.0);

         
        circulo.mostrarFigura();

        // Mostrar el área calculada del círculo
        System.out.println("Area del circulo: " + circulo.calcularArea());
    }
}
