package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MirrorTest {
    @ParameterizedTest(name = "input={0}, result={1}")
    @CsvSource({"abXYZba, ab", "abca, a", "aba, aba","abXQba,ab", "a,a","aa,aa","aaa,aaa","aaaa,aaaa"})
    public void mirrorQuizTest(String input, String expectedResult){

        Mirror mirror = new Mirror();
        String result = mirror.mirrorEnds(input);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void mirrorEmptyInputTest(){
        Mirror mirror = new Mirror();
        String result = mirror.mirrorEnds("");

        Assertions.assertEquals("", result);
    }
}
