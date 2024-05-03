import java.util.Scanner;

public class MainSuma {
    public static void main(String[] args) {
        Scanner p1 = new Scanner(System.in);
        Suma s1 = new Suma();
        System.out.println("ingresa el primer numero ");
        int a = p1.nextInt();   
        System.out.println("ingresa el segundo numero");
        int b = p1.nextInt();
        int r = s1.Sumar(a, b);

        System.out.println("El resultado de la suma es: "+r);
        p1.close();
       
    }

}