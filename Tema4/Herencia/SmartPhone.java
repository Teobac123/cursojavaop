package Tema4.Herencia;

import Tema4.Clases.SmartDevice;

public class SmartPhone extends SmartDevice {

    String name;
    double tamagnoPantalla;
    int Ram;
    protected double precioSmartphone;
    protected String color;

    public SmartPhone(String color, String name, double tamagnoPantalla, int ram) {
        this.color = color;
        this.name = name;
        this.tamagnoPantalla = tamagnoPantalla;
        Ram = ram;
    }

    public SmartPhone() {
    }



    public double getprecioSmartphone() {
        this.precioSmartphone = precio;
        return precioSmartphone;
    }

    @Override
    public String toString() {
        return "SmartPhone [Nombre=" + name + ", tamaño de pantalla=" + tamagnoPantalla + ", RAM=" + Ram
                + "]";
    }

}
