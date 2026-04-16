package junitlab;

public class Factorial {

    public int fact(int n) {

        if (n < 0)
            return -1;

        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }

        return f;
    }
}