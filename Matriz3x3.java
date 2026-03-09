package matriz3x3;

import java.util.Scanner;

public class Matriz3x3 {

    int[][] data;
    int filas;
    int columnas;

    // Constructor
    public Matriz3x3() {
        filas = 3;
        columnas = 3;
        data = new int[filas][columnas];
    }

    // Método para cargar la matriz
    public void cargar() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("data[" + i + "][" + j + "]: ");
                data[i][j] = sc.nextInt();
            }
        }
    }

    // Método para imprimir la matriz
    public void imprimir() {
        System.out.println("\nMatriz 3x3:");

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Método principal
    public static void main(String[] args) {
        Matriz3x3 m = new Matriz3x3();

        m.cargar();
        m.imprimir();
    }
}
