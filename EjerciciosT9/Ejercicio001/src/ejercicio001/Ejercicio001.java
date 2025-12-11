/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio001;
import java.util.Scanner;
/**
 *
 * @author PERSONAL
 */
public class Ejercicio001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese cuantos vehículos va a registrar: ");
        int n = entrada.nextInt();
        entrada.nextLine(); 

        
        String[] autos = new String[n];
        int i = 0; 

        while (i < n) {
            System.out.print("Ingrese la marca del vehiculo: ");
            String marca = entrada.nextLine();

            if (marca.length() > 0) {

                char letra = marca.toUpperCase().charAt(0);

                if (letra == 'A' || letra == 'C' || letra == 'T') {
                    System.out.println("No se permiten marcas que empiecen con"
                            + " A, C o T. Intente otra vez.");
                } else {
                    autos[i] = marca;
                    i++; 
                }
            } else {
                System.out.println("No escribió nada, debe escribir una marca.");
            }
        }
        System.out.println("\nLISTA DE VEHICULOS TOTAL");
        for (int j = 0; j < n; j++) {
            System.out.println((j + 1) + ". " + autos[j]);
        }
    }
}