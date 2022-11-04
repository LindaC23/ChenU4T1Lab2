public class WhileLoopFun {
    // constructor with no parameters
    public  WhileLoopFun(){}

    // prints the individual digits in number separately, starting with the rightmost digit first
    public void printDigits(int number){
        int num = number;
        while (num > 0){
            System.out.println(num % 10);
            num = num / 10;
        }
    }

    // returns the number of times letter occurs in word
    public int countLetter(String word, String letter){
        int wordLength = word.length();
        int index = 0;
        int letterOccurrences = 0;
        while (index < wordLength){
            if (word.substring(index, index + 1).equals(letter)) {
                letterOccurrences ++;
            }
            index ++;
        }
        return letterOccurrences;
    }

    // returns the maximum number of times that number can be doubled before it exceeds threshold
    public int maxDoubles(int number, int threshold){
        int times = 0;
        int num = number;
        while ((num * 2) <= threshold){
            num *= 2;
            times ++;
        }
        return times;
    }

    // returns true if number is prime and false if it is not prime, however, if number is 1, return false
    public boolean isPrime(int number){
        int currentTest = 2;
        double result = 1;
        if (number == 1){
            return false;
        }
        while ((currentTest < number)){
            result =  number % currentTest;
            if (result == 0){
                return false;
            }
            currentTest ++;
        }
        return true;
    }
}
