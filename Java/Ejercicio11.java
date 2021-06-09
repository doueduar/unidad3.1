package Java;
import java.util.*;
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double cm,yr,m,ft,in;
        System.out.print("ingrese un valor en cm");
        cm = scanner.nextDouble();
        if (0<= cm) {
            m = cm/100;
            yr = m/0.9144;
            in = cm/2.54;
            ft = m/0.3048;
            System.out.println("dimenciones en m: "+m+" yr: "+yr+" in: "+in+" ft: "+ft);
        }
    }
}
