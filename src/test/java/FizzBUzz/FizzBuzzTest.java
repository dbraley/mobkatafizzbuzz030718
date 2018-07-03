package FizzBUzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    private FizzBuzz fizzBuzz;

    @BeforeEach
    public void setup() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void fizzBuzz_testForUpto2() {
        assertEquals("1 2", fizzBuzz.printStuff(2));
    }

    @Test
    void fizzBuzz_testForUpto3() {
        assertEquals("1 2 Fizz", fizzBuzz.printStuff(3));
    }

    @Test
    void fizzBuzz_testForUpto5() {
        assertEquals("1 2 Fizz 4 Buzz", fizzBuzz.printStuff(5));
    }
}
