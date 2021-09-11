/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_1;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner entrada=new Scanner(System.in); 
        String empleado;
        int horas;
        float salario, total;
        System.out.print("Ingrese el nombre del empleado: ");
        empleado=entrada.nextLine();
        System.out.print("Ingrese las horas semanales de "+empleado+": ");
        horas=entrada.nextInt();
        System.out.print("Ingrese el salario por hora de "+empleado+": ");
        salario=entrada.nextFloat();
        total=horas*salario;
        System.out.println("El salario semanal de "+empleado+" es de: $"+total);
    } 
}
