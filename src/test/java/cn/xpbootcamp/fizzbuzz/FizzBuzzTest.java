package cn.xpbootcamp.fizzbuzz;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {



    @Test
    void testSay() {
        String threeWord = "Fizz";
        String fiveWord = "Buzz";
        String sevenWord = "Whizz";

        String threeFiveWord = "FizzBuzz";
        String fiveSevenWord = "BuzzWhizz";
        String threeSevenWord = "FizzWhizz";

        String threeFiveSevenSevenWord = "FizzBuzzWhizz";

        for(int i=1; i<=350; i++){
            if(i%105==0){
                assertThat(FizzBuzz.say(i)).isEqualTo(threeFiveSevenSevenWord);
            }else if(i%15==0){
                assertThat(FizzBuzz.say(i)).isEqualTo(threeFiveWord);
            }else if(i%35==0){
                assertThat(FizzBuzz.say(i)).isEqualTo(fiveSevenWord);
            }else if(i%21==0){{
                assertThat(FizzBuzz.say(i)).isEqualTo(threeSevenWord);
            }else if(i%3==0){
                assertThat(FizzBuzz.say(i)).isEqualTo(threeWord);
            }else if(i%5==0){
                assertThat(FizzBuzz.say(i)).isEqualTo(fiveWord);
            }else if(i%7==0){{
                assertThat(FizzBuzz.say(i)).isEqualTo(sevenWord);
            }else{
                assertThat(FizzBuzz.say(i)).isEqualTo(i+"");
            }
        }

    }

}
