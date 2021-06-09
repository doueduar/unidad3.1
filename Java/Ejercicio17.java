package Java;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double l1,l2,l3;
        System.out.println("ingrese las longitudes de los lados del triangulo: ");
        l1 = scanner.nextDouble();
        l2 = scanner.nextDouble();
        l3 = scanner.nextDouble();
        if (l1 == l2) {
            if (l2 ==l3) {
                System.out.println("equilatero");
            } else {
                System.out.println("escaleno");
            }
        } else {
            if (l2 == l3) {
                System.out.print("escaleno");
            } else {
                System.out.println("isosceles");
                
            }
        }
    }
}
