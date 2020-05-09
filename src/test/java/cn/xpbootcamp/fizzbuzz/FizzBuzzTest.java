package cn.xpbootcamp.fizzbuzz;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    String threeWord = "Fizz";
    String fiveWord = "Buzz";
    String sevenWord = "Whizz";

    String threeFiveWord = "FizzBuzz";
    String fiveSevenWord = "BuzzWhizz";
    String threeSevenWord = "FizzWhizz";

    String threeFiveSevenSevenWord = "FizzBuzzWhizz";

    @Test
    void condition7() {
        assertThat(FizzBuzz.say(75)).isEqualTo("Fizz");
    }

    @Test
    void condition6() {
        assertThat(FizzBuzz.say(35)).isEqualTo("BuzzWhizz");
    }

    @Test
    void condition5() {
        assertThat(FizzBuzz.say(30)).isEqualTo("Fizz");
    }

    @Test
    void condition4() {
        assertThat(FizzBuzz.say(13)).isEqualTo("Fizz");
    }

    @Test
    void condition3() {
        assertThat(FizzBuzz.say(60)).isEqualTo(threeFiveWord);
        assertThat(FizzBuzz.say(140)).isEqualTo(fiveSevenWord);
        assertThat(FizzBuzz.say(42)).isEqualTo(threeSevenWord);

        assertThat(FizzBuzz.say(210)).isEqualTo(threeFiveSevenSevenWord);
    }

    @Test
    void condition2() {
        assertThat(FizzBuzz.say(6)).isEqualTo(threeWord);
        assertThat(FizzBuzz.say(9)).isEqualTo(threeWord);
        assertThat(FizzBuzz.say(12)).isEqualTo(threeWord);

        assertThat(FizzBuzz.say(5)).isEqualTo(fiveWord);
        assertThat(FizzBuzz.say(10)).isEqualTo(fiveWord);
        assertThat(FizzBuzz.say(20)).isEqualTo(fiveWord);

        assertThat(FizzBuzz.say(7)).isEqualTo(sevenWord);
        assertThat(FizzBuzz.say(14)).isEqualTo(sevenWord);
        assertThat(FizzBuzz.say(28)).isEqualTo(sevenWord);

    }

    @Test
    void condition1() {
        assertThat(FizzBuzz.say(401)).isEqualTo(401+"");
        assertThat(FizzBuzz.say(421)).isEqualTo(421+"");
        assertThat(FizzBuzz.say(229)).isEqualTo(229+"");
    }



}
