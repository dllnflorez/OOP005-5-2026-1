package arreglos; 

import java.util.Scanner;

public class Arreglos {

    private int[] datos;

    public Arreglos() {
        this.datos = new int[5];
    }

    public Arreglos(int tamano) {
        this.datos = new int[tamano];
    }

    public int suma() {
        int s = 0;
        for (int i = 0; i < datos.length; i++) {
            s += datos[i];
        }
        return s;
    }

    public double promedio() {
        if (datos.length == 0) return 0;
        return (double) suma() / datos.length;
    }

    public int maximo() {
        if (datos.length == 0) return 0;
        int mayor = datos[0];
        for (int i = 1; i < datos.length; i++) {
            if (datos[i] > mayor) {
                mayor = datos[i];
            }
        }
        return mayor;
    }

    public int minimo() {
        if (datos.length == 0) return 0;
        int menor = datos[0];
        for (int i = 1; i < datos.length; i++) {
            if (datos[i] < menor) {
                menor = datos[i];
            }
        }
        return menor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Bienvenido a nuestro programa de arreglos");
        
        System.out.print("De que tamano desea el arreglo: ");
        int n = sc.nextInt();

        Arreglos objeto = new Arreglos(n);

        System.out.println("Ingrese " + objeto.datos.length + " numeros:");
        for (int i = 0; i < objeto.datos.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            objeto.datos[i] = sc.nextInt();
        }

        System.out.print("\nValores: ");
        for (int valor : objeto.datos) {
            System.out.print(valor + " ");
        }
        System.out.println();

        System.out.println("LOS DATOS SON:");
        System.out.println("Suma: " + objeto.suma());
        System.out.println("Promedio: " + objeto.promedio());
        System.out.println("Mayor: " + objeto.maximo());
        System.out.println("Menor: " + objeto.minimo());
        System.out.println("---------------------------");
    }
}