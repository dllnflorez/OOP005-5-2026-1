
package com.mycompany.tarea1;
import java.util.Scanner;
public class Tarea1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("--- CONFIGURACIoN DEL ARREGLO ---");
        System.out.print("Cuantos numeros quieres guardar?: ");
        int n = entrada.nextInt();
        int[] miVector = new int[n];
        System.out.println("\n--- INGRESO DE DATOS ---");
        for (int i = 0; i < n; i++) {
            System.out.print("Ingresa el valor para la posicion [" + i + "]: ");
            miVector[i] = entrada.nextInt();
        }
        System.out.println("\n--- RESULTADO FINAL ---");
        for (int i = 0; i < miVector.length; i++) {
            System.out.println("En el índice " + i + " guardaste: " + miVector[i]);
        }
        entrada.close();
        System.out.println("\nProceso terminado!");
    }
}
    
