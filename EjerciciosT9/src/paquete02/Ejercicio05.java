/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio05;

import java.util.Scanner;

/**
 *
 * @author PERSONAL
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        String[] dias = new String[5];
        double[] ventas = new double[5];
        System.out.println("");

        dias[0] = "Lunes";
        dias[1] = "Martes";
        dias[2] = "Miércoles";
        dias[3] = "Jueves";
        dias[4] = "Viernes";

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el valor de ventas del " + dias[i] + ": ");
            ventas[i] = entrada.nextDouble();
        }
        System.out.println("\n");
        for (int i = 0; i < 5; i++) {
            System.out.println("- " + dias[i] + " $" + ventas[i]);
        }
    }
}
