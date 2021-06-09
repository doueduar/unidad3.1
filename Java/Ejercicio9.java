package Java;
import java.util.*;

public class Ejercicio9 {
    public static void main(String[] args) {
        String A,B,C;
        Scanner scanner = new Scanner(System.in);
        System.out.println("agregar un valor");
        A = scanner.nextLine();
        System.out.println("agregar otro valor");
        B = scanner.nextLine();
        C = A;
        A = B;
        B = A;
        System.out.println("los valores permutados "+A+" "+B);   
    }
}
