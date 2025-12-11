/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        double suma = 0;
        double media = 0;
        int mediaEncima = 0;
        int mediaAbajo = 0;

        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + arreglo[i];

        }
        media = suma / arreglo.length;

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > media) {
                mediaEncima = mediaEncima + 1;
            } else {
                mediaAbajo = mediaAbajo + 1;
            }
        }
        System.out.printf("La media es:%.2f\n"
                + "Elementos por encima de la media:%d\n"
                + "Elementos por debajo de la media:%d\n",
                media,
                mediaEncima,
                mediaAbajo);
    }

}
