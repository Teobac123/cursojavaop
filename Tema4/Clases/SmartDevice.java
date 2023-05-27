package Tema4.Clases;

public class SmartDevice {

    //Atributos 
    protected static String fabricante;
    protected static String modelo;
    protected static double precio = 800.00;

    //Constructores
    public SmartDevice() {
    }
    public SmartDevice(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        
    }

    // Métodos
    public void aumentarPrecio(double precio) {
        this.precio += precio;
    }
    public void disminuirPrecio(double precio) {
        this.precio -= precio;
    }
    @Override
    public String toString() {
        return "SmartDevice [Fabricante= " + getFabricante() + ", modelo= " + getModelo() + ", precio=" +  precio + "]";
    }
    public String getFabricante() {
        return fabricante;
    }

    public String getModelo() {
        return modelo;
    }
}
