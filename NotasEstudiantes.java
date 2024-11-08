package com.mycompany.notasestudiantes;

import java.util.Scanner;

public class NotasEstudiantes {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();
  
        System.out.print("Ingrese la nota del estudiante: ");
        int nota = scanner.nextInt();
      
        String resultado = (nota >= 70) ? "Aprobado" : "Reprobado";
        System.out.println("\nNombre: " + nombre);
        System.out.println("Nota: " + nota);
        System.out.println("Resultado: " + resultado);
    }
}
