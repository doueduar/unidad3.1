package Java;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String d1,d2;
        System.out.println("ingrese 2 números de 5 digitos");
        d1 = scanner.next();
        d2 = scanner.next();
        if ((d1.length()==5)&&(d2.length()==5)) {
            int contador = 0;
            if (!d1.substring(0, 1).equals(d2.substring(3, 4))) {
                contador++;
            }
            if (!d1.substring(1, 2).equals(d2.substring(2, 3))) {
                contador++;
            }
            if (!d1.substring(0, 1).equals(d2.substring(3, 4))) {
                contador++;
            }
            if (!d1.substring(0, 1).equals(d2.substring(3, 4))) {
                contador++;
            }
            if (!d1.substring(0, 1).equals(d2.substring(3, 4))) {
                contador++;
            }
            System.out.println(contador);
            if (contador == 5) {
                System.out.println("Es capicua");
            } else {
                System.out.println("no es capicua");
            }
        } else {
            System.out.println("no es un numero de 5 digitos");
        }
    }
}
