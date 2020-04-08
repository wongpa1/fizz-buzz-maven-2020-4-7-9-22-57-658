package com.oocl;

public class FizzBuzz {
    public String play(int integer) {
        String result = "";

        if (integer % 3 == 0) {
            result += "Fizz";
        }

        if (integer % 5 == 0) {
            result += "Buzz";
        }

        return result.isEmpty() ? String.valueOf(integer) : result;
    }
}
