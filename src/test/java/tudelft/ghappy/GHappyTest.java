package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {
    @ParameterizedTest
    @CsvSource({"xxggxx,true","xxgxx,false", "xxggyygxx,false", "gxx,false"})
    public void happyTest(String input, boolean expectedResult){
        GHappy gHappy = new GHappy();

        boolean result = gHappy.gHappy(input);
        Assertions.assertEquals(expectedResult, result);

    }

}
