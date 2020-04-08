package com.oocl;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void should_return_number_by_input_normal_integer() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        Assert.assertEquals("1", fizzBuzz.play(1));

    }

    @Test
    public void should_return_fizz_by_input_integer_divisible_by_3() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        Assert.assertEquals("Fizz", fizzBuzz.play(3));

    }

    @Test
    public void should_return_fizz_by_input_integer_divisible_by_5() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        Assert.assertEquals("Buzz", fizzBuzz.play(5));

    }

    @Test
    public void should_return_fizz_by_input_integer_divisible_by_3_and_5() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        Assert.assertEquals("FizzBuzz", fizzBuzz.play(15));

    }
}
