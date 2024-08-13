
package com.mycompany.calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner Op = new Scanner(System.in);
        int operacion;
        double n1,n2, resultado;
        System.out.println("----Menu---- \n 1.Suma \n 2.Resta \n 3.Multiplicacion \n 4.Division");
         System.out.println("Elija la operacion");
        operacion=Op.nextInt();
         System.out.println("Elija el numero 1");
        n1=Op.nextDouble();
         System.out.println("Elija el numero 2");
        n2=Op.nextDouble();
        switch(operacion){
            case 1:
               resultado=n1+n2;
               System.out.print("El resultado es: "+resultado);
               break;
               case 2:
               resultado=n1-n2;
               System.out.print("El resultado es: "+resultado);
               break;
               case 3:
               resultado=n1*n2;
               System.out.print("El resultado es: "+resultado);
               break;
               case 4:
               resultado=n1/n2;
               System.out.print("El resultado es: "+resultado);
               break;
        }
        
    }
}
