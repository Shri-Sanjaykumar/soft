package junitlab;

import static org.junit.Assert.*;
import org.junit.Test;

public class PalindromeTest {

    Palindrome obj = new Palindrome();

    @Test
    public void testPalindromeTrue() {
        assertTrue(obj.isPalindrome("madam"));
    }

    @Test
    public void testPalindromeFalse() {
        assertTrue(obj.isPalindrome("hello")); // fail
    }

    @Test
    public void testPalindromeSingleChar() {
        assertTrue(obj.isPalindrome("a"));
    }

    @Test
    public void testPalindromeEmpty() {
        assertTrue(obj.isPalindrome(""));
    }
}