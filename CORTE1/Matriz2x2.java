package matriz2x2;

import java.util.Scanner;

public class Matriz2x2 {

    public int[][] data;
    public int filas;
    public int columnas;

    public Matriz2x2() {
        filas = 2;
        columnas = 2;
        data = new int[filas][columnas];
    }

    public void set() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("data[" + i + "][" + j + "]: ");
                data[i][j] = sc.nextInt();
            }
        }
    }

    public void get() {
        System.out.println("\nMatriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    public Matriz2x2 sumar(Matriz2x2 otra) {

        Matriz2x2 resultado = new Matriz2x2();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                resultado.data[i][j] =
                        this.data[i][j] + otra.data[i][j];

            }
        }

        return resultado;
    }
     public Matriz2x2 multiplicar ( Matriz2x2 otra ) {

         Matriz2x2 resultado = new Matriz2x2 ();

         for (int i = 0; i < filas ; i ++) {

             for (int j = 0; j < columnas ; j ++) {

                 resultado . data [i][j] = 0;

                 for (int k = 0; k < columnas ; k ++) {

                   resultado . data [i][j] =
                     resultado . data [i][j] +
                       this . data [i][k] * otra . data [k][j];

 }
 }
 }

 return resultado ;
 }
    public static void main(String[] args) {

        Matriz2x2 m1 = new Matriz2x2();
        Matriz2x2 m2 = new Matriz2x2();

        System.out.println("Ingrese datos de la primera matriz");
        m1.set();
        System.out.println("Ingrese datos de la segunda matriz");
        m2.set();
        Matriz2x2 resultado = m1.sumar(m2);
        Matriz2x2 m2resultado = m1.multiplicar(m2);
        System.out.println("\nPrimera matriz:");
        m1.get();
        System.out.println("\nSegunda matriz:");
        m2.get();
        System.out.println("\nResultado de la suma:");
        resultado.get();
        System.out.println("\nResultado de la multiplicacion:");
        m2resultado.get();
        
    }
}   