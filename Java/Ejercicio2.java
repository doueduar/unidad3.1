package Java;
import java.util.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        String pais, capital;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresar el país: ");
        pais = scanner.next();
        System.out.print("Ingresar el capital: ");
        capital = scanner.next();
        System.out.println(pais + " es la capital" + capital);

    }
}
