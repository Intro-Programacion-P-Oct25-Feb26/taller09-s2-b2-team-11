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
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      
      String[] cafes = new String[3];
        cafes[0] = "Café tradicional";
        cafes[1] = "Café francés";
        cafes[2] = "Café alemán";
        double[] precios = new double[3];
        precios[0] = 1.5;
        precios[1] = 2.1;
        precios[2] = 2.3;
        
        int[] cantidad_tazas = new int[3]; 
        boolean continuar = true;
        int opcion;
        int tazas;
        double subtotal_pedido;
        
        while(continuar) {
            System.out.println("\n MENÚ DE CAFÉS :");
            for(int i = 0; i < 3; i++) {
                System.out.println((i+1) + ". " + cafes[i] + " - $" + 
                        precios[i]);
            }
            System.out.println("4. Terminar pedido y pagar");
            
            System.out.print("Seleccione una opción: ");
            opcion = entrada.nextInt();
            
            if (opcion >= 1 && opcion <= 3) {
                int indice = opcion - 1;
                
                System.out.print("Ingrese número de tazas de " + 
                        cafes[indice] + ": ");
                tazas = entrada.nextInt();
                
                subtotal_pedido = tazas * precios[indice];
                System.out.println("Valor a pagar por este pedido: $" + 
                        subtotal_pedido);
                
                cantidad_tazas[indice] = cantidad_tazas[indice] + tazas;
                
            } else if (opcion == 4) {
                continuar = false;
            } else {
                System.out.println("Opción incorrecta. Intente de nuevo.");
            }
        }
        
        
        System.out.println("\nEl usuario ha comprado:\n");
        
        double total_general = 0;
        double valor_tipo = 0;
        
        for(int i = 0; i < 3; i++) {
            if (cantidad_tazas[i] > 0) {
                valor_tipo = cantidad_tazas[i] * precios[i];
                
                total_general = total_general + valor_tipo;
                
                System.out.printf("%s (%s t), valor a cancelar %.1f\n",
                        cafes[i],
                        cantidad_tazas[i],
                        valor_tipo);
            }
        }
        
        System.out.printf("\nTotal a pagar: %.1f\n ", total_general);
    }
}

