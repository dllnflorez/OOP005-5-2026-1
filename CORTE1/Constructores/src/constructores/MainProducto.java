
package constructores;
public class MainProducto {
    public static void main(String[] args) {
       Producto p1 = new Producto ();
       Producto p2 = new Producto("Cuaderno");
       Producto p3 = new Producto ("Lapiz ", 2500.00 );
     System.out.println("Producto1: ");
     p1.mostrar();
     System.out.println("Producto2: ");
     p2.mostrar();
     System.out.println("Producto3: ");
     p3.mostrar();
    }
    
}
