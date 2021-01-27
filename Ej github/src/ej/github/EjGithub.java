/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej.github;

import java.util.*;

/**
 *
 * @author ivanr
 */
public class EjGithub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        int numeros[] = new int[10];
        boolean repetido;
        int num;

         for (int i = 0; i < numeros.length; i++) {
            do {
                System.out.println("Introduce el número de la posición " + (i + 1) + ":");
                num = sc.nextInt();
                repetido = buscarNumero(numeros, num);
                if (repetido == true) {
                    System.out.println("Número repetido, introduzca otro.");
                }
            } while (repetido == true);
            numeros[i] = num;
        }

        Arrays.sort(numeros);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
    public static boolean buscarNumero(int num[], int n) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == n) {
                return true;
            }
        }
        return false;
    }

}
