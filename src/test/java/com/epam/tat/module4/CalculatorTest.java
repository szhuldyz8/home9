package com.epam.tat.module4;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @BeforeClass
    public void sumTest() {
        long result = calculator.sum(14L, 12L);
        Assert.assertEquals(result, 26L);
    }

    @Test
    public void testSum() {
        double sum = calculator.sum(11d, 13d);
        Assert.assertEquals(sum, 24d);
    }

    @Test
    public void subTest() {
        long result = calculator.sub(17L,9L);
        Assert.assertEquals(result,8L);
    }
    @Test
    public void testSub() {
        double result = calculator.sub(5d,3d);
        Assert.assertEquals(result,2d);
    }
    @Test
    public void multTest() {
        long result = calculator.mult(5,5);
        Assert.assertEquals(result,25L);
    }
    @Test
    public void testMult() {
        double result = calculator.mult(12,12);
        Assert.assertEquals(result,144d);
    }
    @Test
    public void testDiv() {
        long result = calculator.div(36,6);
        Assert.assertEquals(result,6d);
    }
    @Test
    public void divTest() {
        double result = calculator.div(12,3);
        Assert.assertEquals(result,4d);
    }
    @Test
    public void powTest() {
        double result = calculator.pow(3,2);
        Assert.assertEquals(result,9d);
    }
    @Test
    public void sqrtTest() {
        double result = calculator.sqrt(169);
        Assert.assertEquals(result,13d);
    }
    @Test
    public void tgTest() {
        double result = calculator.tg(60);
        Assert.assertEquals(result,3d);
    }
    @Test
    public void ctgTest() {
        double result = calculator.ctg(0);
        Assert.assertEquals(result,0d);
    }
    @Test
    public void cosTest() {
        double result = calculator.cos(0);
        Assert.assertEquals(result,0d);
    }
    @Test
    public void sinTest() {
        double result = calculator.sin(0);
        Assert.assertEquals(result,0d);
    }
    @Test
    public void isPositiveTest() {
        Assert.assertTrue(calculator.isPositive(14));
    }
    @Test
    public void isNegativeTest() {
        Assert.assertTrue(calculator.isNegative(-15));
    }






}
