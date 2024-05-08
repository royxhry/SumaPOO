import java.util.Scanner;

public class MainSuma {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner p1 = new Scanner(System.in);
        
        // Crear un objeto de tipo Suma
        Suma s1 = new Suma();
        
        // Solicitar al usuario que ingrese el primer número
        System.out.println("Ingresa el primer número:");
        int a = p1.nextInt();
        s1.setA(a);
        
        // Solicitar al usuario que ingrese el segundo número
        System.out.println("Ingresa el segundo número:");
        int b = p1.nextInt();
        s1.setB(b);
        
        // Realizar la suma
        s1.sumar();

        // Obtener el resultado de la suma
        int r = s1.getR();
        System.out.println("El resultado de la suma es: " + r);
        
        // Imprimir la información de la suma utilizando el método toString
        System.out.println(s1.toString());
        
        // Cerrar el Scanner
        p1.close();
    }
}
