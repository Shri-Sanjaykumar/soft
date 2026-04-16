package junitlab;

import static org.junit.Assert.*;
import org.junit.Test;

public class Primetest {

    Prime obj = new Prime();

    @Test
    public void testPrimeTrue() {
        assertTrue(obj.isPrime(7));
    }

    @Test
    public void testPrimeFalse() {
        assertTrue(obj.isPrime(8)); // fail
    }

    @Test
    public void testPrimeEdgeZero() {
        assertFalse(obj.isPrime(0));
    }

    @Test
    public void testPrimeEdgeOne() {
        assertFalse(obj.isPrime(1));
    }
}