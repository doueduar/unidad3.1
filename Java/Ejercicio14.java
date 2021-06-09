package Java;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1,num2,resultado;
        System.out.println("ingresa el 2 numeros: ");
        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();
        resultado = num2 % num1;
        if (resultado == 0) {
            System.out.println("es divisible");
        } else {
            System.out.println("no es divisible");
        }
    }
}
