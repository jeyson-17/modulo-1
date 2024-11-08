package com.mycompany.datoscompaneros;

public class DatosCompaneros {
    public static void main(String[] args) {
               String[][] datos = {
            {"Carlos", "Portillo", "Ingenieria en Computacion", "Tecnicom"},
            {"Arnold", "Aguilar", "Ingenieria Electronica", "Empresa de energia renovable"},
            {"Cristian", "Zamora", "Ingenieria en Produccion Industrial", "No especificado"},
            {"Diana", "Selva", "Ingenieria en Computacion", "Ingenieria Civil"},
            {"Jasson", "Ortega", "Ingenieria en Produccion Industrial", "No especificado"}
        };

         System.out.println("Datos de los companeros de clase:");
        for (int i = 0; i < datos.length; i++) {
            System.out.println("Nombre: " + datos[i][0]);
            System.out.println("Apellido: " + datos[i][1]);
            System.out.println("Carrera: " + datos[i][2]);
            System.out.println("Lugar de Trabajo: " + datos[i][3]);
            System.out.println(); 
        }
    }
}
