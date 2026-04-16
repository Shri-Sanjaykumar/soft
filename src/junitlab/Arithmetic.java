package junitlab;

public class Arithmetic {

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        if (b == 0)
            throw new ArithmeticException("Divide by zero");
        return a / b;
    }

    public int square(int a) {
        return a * a;
    }
}