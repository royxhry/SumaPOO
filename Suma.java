public class Suma {
    // Variables para los valores y el resultado de la suma
    private int a, b, r;
    
    // Método para obtener el valor 'a'
    public int getA() {
        return a;
    }
    
    // Método para establecer el valor 'a'
    public void setA(int a) {
        this.a = a;
    }
    
    // Método para obtener el valor 'b'
    public int getB() {
        return b;
    }
    
    // Método para establecer el valor 'b'
    public void setB(int b) {
        this.b = b;
    }
    
    // Método para realizar la suma de 'a' y 'b'
    public void sumar() {
        this.r = a + b;
    }
    
    // Método para obtener el resultado de la suma
    public int getR() {
        return r;
    }
    
    // Método toString para representar la información de la suma
    @Override
    public String toString() {
        return "Suma [a=" + a + ", b=" + b + ", r=" + r + "]";
    }
}
