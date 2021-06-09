package Java;
import java.util.*;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese el valor de la temperatura en °C ");
        double tc = scanner.nextDouble();
        double tf = tc*9/5+32;
        System.out.println("el valor en grados F° son: "+tf);
    }
}
