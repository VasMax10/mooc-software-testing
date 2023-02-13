package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoNumbersSumTest {

    @Test
    public void addSameLengthNumbers(){
        TwoNumbersSum twoNumbersSum = new TwoNumbersSum();
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(1,2));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(3,4));

        ArrayList<Integer> result = twoNumbersSum.addTwoNumbers(first, second);

        Assertions.assertEquals(new ArrayList<>(Arrays.asList(4,6)), result);

    }

    @Test
    public void addNumbersSecondHasMoreDigits(){
        TwoNumbersSum twoNumbersSum = new TwoNumbersSum();
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(1,2));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(3,4,5));

        ArrayList<Integer> result = twoNumbersSum.addTwoNumbers(first, second);

        Assertions.assertEquals(new ArrayList<>(Arrays.asList(3,5,7)), result);
    }
    @Test
    public void addNumbersFirstHasMoreDigits(){
        TwoNumbersSum twoNumbersSum = new TwoNumbersSum();
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(4,5));

        ArrayList<Integer> result = twoNumbersSum.addTwoNumbers(first, second);

        Assertions.assertEquals(new ArrayList<>(Arrays.asList(1,6,8)), result);
    }

    @Test
    public void addNumbersDigitSumMoreThan10(){
        TwoNumbersSum twoNumbersSum = new TwoNumbersSum();
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(1,9));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(9));

        ArrayList<Integer> result = twoNumbersSum.addTwoNumbers(first, second);

        Assertions.assertEquals(new ArrayList<>(Arrays.asList(2,8)), result);
    }

    @Test
    public void addNumbersThatCreatesNewDigit(){
        TwoNumbersSum twoNumbersSum = new TwoNumbersSum();
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(9));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(9));

        ArrayList<Integer> result = twoNumbersSum.addTwoNumbers(first, second);

        Assertions.assertEquals(new ArrayList<>(Arrays.asList(1,8)), result);
    }
}
