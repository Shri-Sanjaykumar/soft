package junitlab;

import static org.junit.Assert.*;
import org.junit.Test;

public class ArithmeticTest {

    Arithmetic obj = new Arithmetic();

    // ---------- ADD ----------
    @Test
    public void testAddPositive() {
        assertEquals(10, obj.add(5,5));
    }

    @Test
    public void testAddNegative() {
        assertEquals(11, obj.add(5,5)); // should fail
    }

    // ---------- SUB ----------
    @Test
    public void testSubPositive() {
        assertEquals(2, obj.sub(5,3));
    }

    @Test
    public void testSubNegative() {
        assertEquals(1, obj.sub(5,3)); // fail
    }

    // ---------- MUL ----------
    @Test
    public void testMulPositive() {
        assertEquals(15, obj.mul(5,3));
    }

    @Test
    public void testMulNegative() {
        assertEquals(10, obj.mul(5,3)); // fail
    }

    // ---------- DIV ----------
    @Test
    public void testDivPositive() {
        assertEquals(2, obj.div(10,5));
    }

    @Test
    public void testDivNegative() {
        assertEquals(3, obj.div(10,5)); // fail
    }

    // ---------- EDGE ----------
    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        obj.div(10,0);
    }

    // ---------- SQUARE ----------
    @Test
    public void testSquarePositive() {
        assertEquals(25, obj.square(5));
    }

    @Test
    public void testSquareNegative() {
        assertEquals(20, obj.square(5)); // fail
    }
}