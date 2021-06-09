package Java;

import java.util.*;
public class Ejercicio13 {
    public static void main(String[] args) {
        double PI = 3.141592;
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingresa el radio ");
        double radio = scanner.nextDouble();
        System.out.print("ingresa la altura ");
        double altura = scanner.nextDouble();
        if ((0<radio)&&(0<altura)) {
            double area,volumen;
            area = PI*radio*radio;
            volumen = PI*radio*radio*altura;
            System.out.println("el area es: "+area+" volumen es: "+volumen);
        } else {
            System.out.println("no puede haber valores negativos");
        }
    }
    
}
