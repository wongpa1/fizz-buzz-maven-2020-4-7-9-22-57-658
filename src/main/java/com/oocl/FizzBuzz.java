package com.oocl;

public class FizzBuzz {
    public String play(int integer) {

        if (integer % 3 == 0) {
            return "fizz";
        }

        if (integer % 5 == 0) {
            return "buzz";
        }

        return String.valueOf(integer);
    }
}
