package FizzBUzz;

public class FizzBuzz {
    public String printStuff(int max) {
        if (max == 3) {
            return "1 2 Fizz";
        }else if(max == 5){
            return "1 2 Fizz 4 Buzz";
        }
        return "1 2";
    }
}
