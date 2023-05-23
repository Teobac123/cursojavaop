package Tema3;

public class Ejercicio3 {
    public static void main(String[] args) {
        String[] nombres = {"Juan,", "Pedro", "y Lucas."};

        String amigos = "";

        for(String n : nombres){
            amigos += n + " ";
        }  
        System.out.println("Mis amigos son: " + amigos);
    }
    
}
