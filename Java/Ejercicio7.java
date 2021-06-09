package Java;
import java.util.Random;

public class Ejercicio7 {
    public static void main(String[] args) {
        int num1 = (int)(Math.random()*41+10);
        System.out.println("El numero aleatorio es: "+num1);
        double disminuido = num1-num1*0.15;
        System.out.println("El numero disminuido es: "+disminuido);

    }
}
