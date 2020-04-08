package com.oocl;

public class FizzBuzz {
    public String play(int integer) {
        String result = "";

        if (integer % 3 == 0) {
            result += "fizz";
        }

        if (integer % 5 == 0) {
            result += "buzz";
        }

        return result.isEmpty() ? String.valueOf(integer) : result;
    }
}
