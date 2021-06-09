package Java;

import java.util.Random;

public class Ejercicio6 {
    public static void main(String[] args) {
        int num1 = (int)(Math.random()*201);
        System.out.println("numero aleatorio es: "+num1);
        double aumentado = num1+num1*0.30;
        System.out.println("el numero aumentado es: "+aumentado);
    }
}
