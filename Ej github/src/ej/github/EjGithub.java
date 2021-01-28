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
        
        boolean repetido;
        int num, cantidadNumeros;
        
        do {
            System.out.println("¿Cuántos números vas a leer? (Max. 10)");
            cantidadNumeros = sc.nextInt();
            if (cantidadNumeros < 1 || cantidadNumeros > 10) {
                System.out.println("Tiene que ser una cantidad del 1 al 10");
            }
        } while (cantidadNumeros < 1 || cantidadNumeros > 10);
        
        int numeros[] = new int[cantidadNumeros];

         for (int i = 0; i < cantidadNumeros; i++) {
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

        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.println(numeros[i]);
        }
        
        System.out.println("¿Qué número quieres buscar en el array?");
        int numEncontrar=sc.nextInt();
        boolean numEncontrado=encontrarNumero(numeros,numEncontrar);
        if (numEncontrado==true)
            System.out.println("El número aparece en el array.");
        else
            System.out.println("El número no aparece en el array.");
        
    }
    
    public static boolean encontrarNumero(int num[],int n){
        for(int i=0;i<num.length;i++){
            if(n==num[i])
                return true;
        }
        return false;
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
