package FizzBUzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    public void fizzBuzzBasicTest() {
        FizzBuzz tester = new FizzBuzz();

        assertEquals(100, tester.printStuff(100), "print given number as the same");
    }
}
