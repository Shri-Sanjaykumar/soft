package junitlab;

import static org.junit.Assert.*;
import org.junit.Test;

public class FactorialTest {

    Factorial obj = new Factorial();

    @Test
    public void testFactorialPositive() {
        assertEquals(120, obj.fact(5));
    }

    @Test
    public void testFactorialNegative() {
        assertEquals(100, obj.fact(5)); // fail
    }

    @Test
    public void testFactorialZero() {
        assertEquals(1, obj.fact(0));
    }

    @Test
    public void testFactorialNegativeInput() {
        assertEquals(-1, obj.fact(-3));
    }
}