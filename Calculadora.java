// Calculadora.java
public class Calculadora {
    private int num1;
    private int num2;

    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int suma() {
        return num1 + num2;
    }
    public int resta() {
        return num1 - num2;
    }
    public int multiplicar() {
        return num1 * num2;
    }
    public int dividir() {
        if (num2 == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return num1 / num2;
    }
    
}
