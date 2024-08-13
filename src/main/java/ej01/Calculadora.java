package ej01;

public class Calculadora {
    public float num1,num2,result;// atributos:  
public void suma(){   //metodos:
    result=num1+num2;
}   
public void resta(){
    result = num1-num2;
}
public void multi(){
    result=num1*num2;
}
public void div(){
    result=num1/num2;
}
public void raiz(){
    result = (float)(double)Math.sqrt(num1);
}
public void potencia(){
    result = (float)(double)Math.pow(num1, num1);
}
public void sin(double a) {
        result = (float) Math.sin(a);
    }
public void cos(double a) {
        result = (float) Math.cos(a);
    }
public void tan(double a) {
        result = (float) Math.tan(a);
    }
public double getResult() {
        return result;
    }

}
