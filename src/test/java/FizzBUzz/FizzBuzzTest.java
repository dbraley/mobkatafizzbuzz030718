package FizzBUzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void fizzBuzz_testForUpto2() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1 2", fizzBuzz.printStuff(2));
    }

    @Test
    void fizzBuzz_testForUpto3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1 2 Fizz", fizzBuzz.printStuff(3));
    }
}
