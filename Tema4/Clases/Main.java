package Tema4.Clases;

import Tema4.Herencia.SmartPhone;
import Tema4.Herencia.SmartWatch;

public class Main {
    public static void main(String[] args) {
        
        SmartDevice Iphone = new SmartDevice("Apple", "Iphone");
        SmartDevice Iphone11 = new SmartPhone("White", "Iphone 11", 6.1, 4);
        
        Iphone11.disminuirPrecio(50);
        System.out.println(Iphone.toString() + " " + Iphone11.toString());

        SmartDevice Iphone2 = new SmartDevice("Apple", "AppleWatch");
        SmartWatch AppleWatch = new SmartWatch("Serie 8","Negro");
        AppleWatch.aumentarPrecio(450);
        System.out.println(Iphone2.toString() + AppleWatch.toString() + ", Bluetooh= " + AppleWatch.getBluetooh(true) + ", Water Resistence= " 
        + AppleWatch.getwaterResistence(true) + "]");
        
        
    }
}