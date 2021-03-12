package com.coding.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void calculateArea_returnsNonNullObject() {
        // when
        Double calculatedArea = Triangle.calculateArea(1, 1, 1);

        // then
        Assert.assertNotNull(calculatedArea);
    }

    @Test
    public void calculateArea_returnsCalculatedArea() {
        // when
        Double calculatedArea = Triangle.calculateArea(1, 1, 1);

        // then
        Assert.assertNotNull(calculatedArea);
        Assert.assertEquals(0.433D, calculatedArea, 0D);
    }

    @Test(expected = IllegalArgumentException.class)
    public void calculateArea_atLeastOneSideSizeIsNegative_exceptionIsRaised() {
        // when
        Triangle.calculateArea(-1, 1, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void calculateArea_atLeastOneSideSizeIsZero_exceptionIsRaised() {
        // when
        Triangle.calculateArea(1, 1, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void calculateArea_twoSideSizesEqualsThird_exceptionIsRaised() {
        // when
        Triangle.calculateArea(20, 1, 21);
    }

    @Test(expected = IllegalArgumentException.class)
    public void calculateArea_twoSideSizesAreSmallerThanThird_exceptionIsRaised() {
        // when
        Triangle.calculateArea(20, 1, 10);
    }

}
