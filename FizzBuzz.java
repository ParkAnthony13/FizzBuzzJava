public class FizzBuzz {
    public String fizzBuzz(int number) {
        if(number%3==0 && number%5==0) {
            return "Fizzbuzz";
        } else if (number%5==0) {
            return "Buzz";
        } else if (number%3==0) {
            return "Fizz";
        } else {
            String num = "";
            return num+number;
        }
    }
    public String fizzBuzz(
        int number,
        String multOf3Word,
        String multOf5Word,
        String multOf15Word) {
            if(number%3==0 && number%5==0) {
                return multOf15Word;
            } else if (number%5==0) {
                return multOf5Word;
            } else if (number%3==0) {
                return multOf3Word;
            } else {
                String num = String.valueOf(number);
                return num;
            }
        }
}