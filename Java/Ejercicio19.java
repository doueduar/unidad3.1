package Java;

public class Ejercicio19 {
    public static void main(String[] args) {
        int N = (int)(Math.random()*1000+1);
        System.out.println(N);
        if (N % 5 == 0) {
            int contador = N;
            int num = 0;
            while (0<contador) {
                contador = contador-5;
                num++;
            }
            System.out.println(num);
            if ((contador == 0)&&(num<=25)) {
                System.out.println("Correcto");
            } else {
                System.out.println("incorrecto");
            }
        } else {
            System.out.println("incorrecto");
        } 
    }
}
