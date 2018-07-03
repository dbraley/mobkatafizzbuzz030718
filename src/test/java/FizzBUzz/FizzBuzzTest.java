package FizzBUzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void fizzBuzzZestyTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertEquals("1 2", fizzBuzz.printStuff(2));
    }
}
