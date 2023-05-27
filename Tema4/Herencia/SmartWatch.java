package Tema4.Herencia;

import Tema4.Clases.SmartDevice;

public class SmartWatch extends SmartDevice{
    
    String name;
    boolean bluetooth;
    boolean waterResistence;
    protected String color;
    
    public SmartWatch() {
    }
    public SmartWatch(String name, String color) {
        this.name = name;
        this.color = color;

    }

    public String getBluetooh(Boolean bluetooth) {
        this.bluetooth = bluetooth;
        return bluetooth.toString();
    }
    
    public String getwaterResistence(Boolean waterResistence){
        this.waterResistence = waterResistence;
        return waterResistence.toString();
    }
    @Override
    public String toString() {
        return "SmartWatch [name=" + name + ", color=" + color ;
    }
  
 }



