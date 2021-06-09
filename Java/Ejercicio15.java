package Java;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingresa un numero");
        double num1 = scanner.nextDouble();
        if (num1==0) {
            System.out.println("es nulo");
        } else {
            if (0<num1) {
                System.out.println("es positivo");
            } else {
                System.out.println("es negativo");
            }
        }        
    }
}
