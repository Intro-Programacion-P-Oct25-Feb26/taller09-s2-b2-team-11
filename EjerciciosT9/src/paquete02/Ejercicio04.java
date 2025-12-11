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
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double[] promedios = {10, 10, 9.1, 7, 6.1, 4, 8};
        String[] estudiantes = {"Kimberly Gonzalez", "Mark Hogan",
            "Teresa Martinez", "Julia Johnson", "Mark Cook", "Jennifer Manning",
            "Juan Vasquez"};
        String[] promediosCualitativos = new String[7];

        for (int i = 0; i < promedios.length; i++) {
            double nota = promedios[i];

            if ((nota >= 0) && (nota <= 5.9)) {
                promediosCualitativos[i] = "(Regular)";

            } else {
                if ((nota >= 6) && (nota <= 8.9)) {
                    promediosCualitativos[i] = "(Bueno)";

                } else {
                    if ((nota >= 9) && (nota <= 10)) {
                        promediosCualitativos[i] = "(Sobresaliente)";
                    }
                }
            }

        }
        for (int i = 0; i < promedios.length; i++)
        System.out.printf("%s promedio: %.2f promedio cualitativo %s\n",
                estudiantes[i],
                promedios[i],
                promediosCualitativos[i]);
        
    }
}