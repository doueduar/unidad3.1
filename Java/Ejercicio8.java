package Java;
import java.util.*;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1,num2,num3;
        System.out.print("ingrese el primer numero ");
        num1 = scanner.nextInt();
        System.out.print("ingrese el segundo numero ");
        num2 = scanner.nextInt();
        System.out.print("ingrese el tercer numero ");
        num3 = scanner.nextInt();
        double promedio = num1+num2+num3;
        promedio = promedio/3;
        System.out.println("El promedio es: "+promedio);
    }
}
