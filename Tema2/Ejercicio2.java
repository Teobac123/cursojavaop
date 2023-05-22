package Tema2;

public class Ejercicio2 {
    public static void main(String[] args) {
        double precio = getPrice(100.00);
        System.out.println(precio);
    }
    static double getPrice(double precio) {
        return precio + precio*0.21 ;
    }
    
}
