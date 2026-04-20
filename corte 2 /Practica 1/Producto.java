
package constructorysobrecargas;


public class Producto {
    public String nombre;
    public double precio;
    //constructor vacio
    public Producto(){
        this.nombre="Sin nombre";
        this.nombre = nombre;
        this.precio=0.0;
    }
    //primera sobrecarga
    public Producto(String nombre){
        this.nombre = nombre;
        //seguunda sobrecarga
    }
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    public void mostrar(){
        System.out.println("nombre:"+" "+nombre);     
        System.out.println("precio:"+" "+precio);
        
    }
    
    
}
