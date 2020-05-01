package cn.xpbootcamp.fizzbuzz;

public class FizzBuzz {
    static String threeWord = "Fizz";
    static String fiveWord = "Buzz";
    static String sevenWord = "Whizz";

    static String say(int number){
        String sayWord = "";

        if(number%3 == 0){
            sayWord += threeWord;
        }

        if(number%5 == 0){
            sayWord += fiveWord;
        }

        if(number%7 == 0){
            sayWord += sevenWord;
        }

        if(sayWord.equals("")){
            sayWord = number+"";
        }

        return sayWord;
    }
}
