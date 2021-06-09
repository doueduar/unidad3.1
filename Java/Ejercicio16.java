package Java;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1,num2,num3;
        System.out.println("ingresa tres numeros: ");
        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();
        num3 = scanner.nextDouble();
        if (num1 >num2) {
            if (num1>num3) {
                System.out.println(num1+"es el mayor");
            }else{
                if (num2>num3) {
                    System.out.println(num2+" es el mayor");
                }else{
                    System.out.println(num3+" es el mayor");
                }
                
            }
        } else {
            if (num2>num3) {
                System.out.println(num2+"es el mayor");
            } else {
                System.out.println(num3+"es el mayor");
            }
        }
    }
}
