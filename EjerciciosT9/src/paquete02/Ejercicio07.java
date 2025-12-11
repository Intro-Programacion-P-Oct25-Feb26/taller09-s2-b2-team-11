/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
        
        double[] numeros = new double[10];
        double suma = 0;
        double promedio;
        
        System.out.println("   INGRESE SUS 10 NÚMEROS AQUI  ");

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = entrada.nextDouble();

            suma = suma + numeros[i];
        }
        
        promedio = suma / 10;
        
        System.out.println("\n RESULTADOS: ");
        System.out.println("El promedio es: " + promedio);
        System.out.println("----------------------------------------");
        System.out.println("Número | Diferencia con el promedio");
        
        for (int i = 0; i < 10; i++) {
            double diferencia = numeros[i] - promedio;
            
           System.out.printf("  %.1f \t | \t %.1f %n", numeros[i], diferencia);
        }
    }
}

   
