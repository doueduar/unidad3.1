package Java;
import java.util.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1,cuadrado,cubo;
        System.out.print("ingrese un numero");
        num1 = scanner.nextDouble();
        cuadrado = num1*num1;
        cubo = num1*num1*num1;
        System.out.println("cuadrado es: "+cuadrado+" cubo es: "+cubo);        
    }
    }
