package Java;
import java.util.*;
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double base,altura,area,perimetro;

        System.out.print("ingrese la base: ");
        base = scanner.nextDouble();
        System.out.print("ingese la altura");
        altura = scanner.nextDouble();
        if ((0<base)&&(0<altura)) {
            area = base*altura;
            perimetro = 2*altura+2*altura;
            System.out.println("el area es: "+ area +" el perimetro"+ perimetro );
        }else{
            System.out.println("uno de los valores es negativo o cero");
        }
        
    }
}
