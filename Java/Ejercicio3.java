package Java;
import java.util.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1,doble,triple;
        System.out.print("ingrese un numero");
        num1 = scanner.nextDouble();
        doble = 2*num1;
        triple = 3*num1;
        System.out.println("El doble del numero es: "+doble+" y el triple: "+triple);
        
    }    
}
