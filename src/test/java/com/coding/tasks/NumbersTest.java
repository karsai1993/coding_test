package com.coding.tasks;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class NumbersTest {

    @Test
    public void print_defaultBoundaries_printsAndReturnsNonNullObject() {
        // when
        List<Long> printedNumbers = Numbers.print();

        // then
        Assert.assertNotNull(printedNumbers);
    }

    @Test
    public void print_defaultBoundaries_printsAndReturnsNonEmptyList() {
        // when
        List<Long> printedNumbers = Numbers.print();

        // then
        Assert.assertNotNull(printedNumbers);
        Assert.assertFalse(printedNumbers.isEmpty());
    }

    @Test
    public void print_defaultBoundaries_printsAndReturnsList() {
        // when
        List<Long> printedNumbers = Numbers.print();

        // then
        Assert.assertNotNull(printedNumbers);
        Assert.assertFalse(printedNumbers.isEmpty());

        int printedNumbersListSize = printedNumbers.size();
        // to check if the total size is correct
        Assert.assertEquals(10, printedNumbersListSize);
        // to check if the first value is correct
        Assert.assertEquals(1L, printedNumbers.get(0).longValue());
        // to check if the last value is correct
        Assert.assertEquals(10L, printedNumbers.get(printedNumbersListSize - 1).longValue());
    }

    @Test
    public void print_notDefaultBoundaries_printsAndReturnsNonNullObject() {
        // given
        Long initialFromValue = 2L;
        Long initialToValue = 20L;

        // when
        List<Long> printedNumbers = Numbers.print(initialFromValue, initialToValue);

        // then
        Assert.assertNotNull(printedNumbers);
    }

    @Test
    public void print_notDefaultBoundaries_printsAndReturnsNonEmptyList() {
        // given
        Long initialFromValue = 2L;
        Long initialToValue = 20L;

        // when
        List<Long> printedNumbers = Numbers.print(initialFromValue, initialToValue);

        // then
        Assert.assertNotNull(printedNumbers);
        Assert.assertFalse(printedNumbers.isEmpty());
    }

    @Test
    public void print_notDefaultBoundaries_printsAndReturnsList() {
        // given
        Long initialFromValue = 2L;
        Long initialToValue = 20L;

        // when
        List<Long> printedNumbers = Numbers.print(initialFromValue, initialToValue);

        // then
        Assert.assertNotNull(printedNumbers);
        Assert.assertFalse(printedNumbers.isEmpty());

        int printedNumbersListSize = printedNumbers.size();
        // to check if the total size is correct
        Assert.assertEquals(19, printedNumbersListSize);
        // to check if the first value is correct
        Assert.assertEquals(2L, printedNumbers.get(0).longValue());
        // to check if the last value is correct
        Assert.assertEquals(20L, printedNumbers.get(printedNumbersListSize - 1).longValue());
    }


    @Test(expected = IllegalArgumentException.class)
    public void print_notDefaultBoundaries_endingValueIsSmallerThanStartingOne_exceptionRaised() {
        // given
        Long initialFromValue = 20L;
        Long initialToValue = 2L;

        // when
        Numbers.print(initialFromValue, initialToValue);
    }

}
