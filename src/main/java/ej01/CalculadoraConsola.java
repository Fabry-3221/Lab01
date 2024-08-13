package ej01;
import java.util.Scanner;
public class CalculadoraConsola {
    public static void main(String[] args) {        
        Scanner ingreso= new Scanner(System.in);
        Calculadora calcu1= new Calculadora();
        int o;
        do{
        System.out.println("seleccione la opcion que desea");
        System.out.println("1. suma");
        System.out.println("2. resta");
        System.out.println("3. multiplicacion");
        System.out.println("4. division");
        System.out.println("5. raiz");
        System.out.println("6. potencia");
        System.out.println("7. seno");
        System.out.println("8. coseno");
        System.out.println("9. tangente");
        System.out.println("10. Salir");
        o = ingreso.nextInt();
        switch (o) {
            case 1:                 {
                    System.out.println("Ingrese el numero 1");
                    float a=ingreso.nextFloat();
                    System.out.println("Ingrese el numero 2");
                    float b=ingreso.nextFloat();
                    calcu1.num1=a;
                    calcu1.num2=b;
                    calcu1.suma();
                    System.out.println("la suma es:" + calcu1.result + "\n");
                    break;
                }
            case 2:                 {
                    System.out.println("Ingrese el numero 1");
                    float a=ingreso.nextFloat();
                    System.out.println("Ingrese el numero que desea restar");
                    float b=ingreso.nextFloat();
                    calcu1.num1=a;
                    calcu1.num2=b;
                    calcu1.resta();
                    System.out.println("la resta es:" + calcu1.result + "\n");
                    break;
                }
            case 3:                 {
                    System.out.println("Ingrese el numero 1");
                    float a=ingreso.nextFloat();
                    System.out.println("Ingrese el numero 2");
                    float b=ingreso.nextFloat();
                    calcu1.num1=a;
                    calcu1.num2=b;
                    calcu1.multi();
                    System.out.println("el producto es:" + calcu1.result + "\n");
                    break;
                }
            case 4:                 {
                    System.out.println("Ingrese el primer numero ");
                    float a=ingreso.nextFloat();
                    System.out.println("Ingrese el numerador ");
                    float b=ingreso.nextFloat();
                    calcu1.num1=a;
                    calcu1.num2=b;
                    calcu1.div();
                    System.out.println("el resultado de la division es:" + calcu1.result + "\n");
                    break;
                }
            case 5:                 {
                    System.out.println("Ingrese el numero al que desea hallar su raiz ");
                    float a=ingreso.nextFloat();
                    calcu1.num1=a;
                    calcu1.raiz();
                    System.out.println("la raiz es:" + calcu1.result + "\n");
                    break;
                }
            case 6:                 {
                    System.out.println("Ingrese la base ");
                    float a=ingreso.nextFloat();
                    System.out.println("Ingrese el exponente ");
                    float b=ingreso.nextFloat();
                    calcu1.num1=a;
                    calcu1.num2=b;
                    calcu1.potencia();
                    System.out.println("la potencia es:" + calcu1.result + "\n");
                    break;
                }
            case 7:                 {
                    System.out.println("Ingrese el numero que al que desea sacar el seno ");
                    double a=ingreso.nextDouble();
                    double rad = Math.toRadians(a);
                    calcu1.sin(rad);
                    System.out.println("el seno de: " + a + " es:"+ calcu1.getResult() + "\n");
                    break;
                }
            case 8:                 {
                    System.out.println("Ingrese el numero del cual desea saber su coseno");
                    double a= ingreso.nextDouble();
                    double rad = Math.toRadians(a);
                    calcu1.cos(rad);
                    System.out.println("el coseno de: " + a + " es: " + calcu1.getResult() + "\n");
                    break;
                }
            case 9:                 {
                    System.out.println("Ingrese el numero del cual desea saber su tangente");
                    double a=ingreso.nextDouble();
                    double rad = Math.toRadians(a);
                    calcu1.tan(rad);
                    System.out.println("la tangente de: " + a + " es:" + calcu1.getResult() + "\n");
                    break;
                }
            case 10: {
                System.out.println("Salio del programa");
                return;
                
            }
            default: {
                 System.out.println("Opcion no valida1\n");
                 break;
            }
        }
        }while(o != 10);
    }  
}
