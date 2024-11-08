package com.mycompany.nombrescompaneros;

public class nombrescompaneros{
    public static void main(String[] args) {
      
        String[] nombres = new String[10];

        nombres[0] = "Emanuel";
        nombres[1] = "Noel";
        nombres[2] = "Daniela";
        nombres[3] = "Ermin";
        nombres[4] = "Evelyn";
        nombres[5] = "Felipe";
        nombres[6] = "Jeyson";
        nombres[7] = "Blanca";
        nombres[8] = "Jorge";
        nombres[9] = "Ervin";

     
        System.out.println("Nombres de los companeros de clase:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println((i + 1) + ". " + nombres[i]);
        }
    }
}
