package com.oocl;

public class FizzBuzz {

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";

    public String play(int integer) {
        String result = "";

        if (integer % 3 == 0) {
            result += FIZZ;
        }

        if (integer % 5 == 0) {
            result += BUZZ;
        }

        return result.isEmpty() ? String.valueOf(integer) : result;
    }
}
