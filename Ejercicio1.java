import java.util.*;

public class Ejercicio1 {

    public static void main(String[] args) {
        int num1,num2,suma;

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("ingrese el primer numero: ");
        num1 = scanner.nextInt();
        System.out.print("ingrese el segundo numero: ");
        num2 = scanner.nextInt();
        suma = num1 +num2;
        System.out.println("suma es:"+suma);

    }        
}