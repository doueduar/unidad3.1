package Java;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numero;
        int d1,d2,d3,d4,suma;
        System.out.println("ingresa el el numero");
        numero= scanner.next();
        //System.out.println(numero.length());
        d1 = 0; d2 =0; d3 =0; d4 =0;

        if ((numero.length()<5)&&(0<numero.length())) {
            if (1==numero.length()) {
                d4 = Integer.parseInt(numero.substring(0,1));
            }
            if (2==numero.length()) {
                d4 = Integer.parseInt(numero.substring(1,2));
                d3 = Integer.parseInt(numero.substring(0,1));
            }
            if (3==numero.length()) {
                d2 = Integer.parseInt(numero.substring(0, 1));
                d3 = Integer.parseInt(numero.substring(1,2));
                d4 = Integer.parseInt(numero.substring(2,3));
            }
            if (4 ==numero.length()) {
                d1 = Integer.parseInt(numero.substring(0,1));
                d2 = Integer.parseInt(numero.substring(1,2));
                d3 = Integer.parseInt(numero.substring(2,3));
                d4 = Integer.parseInt(numero.substring(3,4));
            }

            suma = d1+d2+d3+d4;
            System.out.println("d1: "+d1+" d2: "+d2+" d3: "+d3+" d4: "+d4);
            System.out.println("la suma es "+suma);
        } else {
            System.out.println("el numero se excedede 4 digitos");
        }
    }
}
