package cn.xpbootcamp.fizzbuzz;

public class FizzBuzz {
    static String threeWord = "Fizz";
    static String fiveWord = "Buzz";
    static String sevenWord = "Whizz";

    static String say(int number){
        String sayWord = "";
        boolean ignoreDivide3 = false;
        boolean ignoreDivide5 = false;
        boolean notConnectWord = false;

        // 7
        if((number+"").indexOf("7")>=0){
            ignoreDivide5 = true;
        }

        // 6
        else if((number+"").indexOf("5")>=0){
            ignoreDivide3 = true;
        }

        // 5 4
        else if((number+"").indexOf("3")>=0){
            notConnectWord = true;
            sayWord += threeWord;
        }


        // 3 2
        if(number%3 == 0 && !ignoreDivide3){
            if(!notConnectWord) {
                sayWord += threeWord;
            }
        }


        if(number%5 == 0 && !ignoreDivide5){
            if(!notConnectWord) {
                sayWord += fiveWord;
            }
        }

        if(number%7 == 0){
            if(!notConnectWord) {
                sayWord += sevenWord;
            }
        }

        // 1
        if(sayWord.equals("")){
            sayWord = number+"";
        }


        return sayWord;
    }
}
