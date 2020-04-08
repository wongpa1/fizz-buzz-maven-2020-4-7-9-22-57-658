package com.oocl;

public class FizzBuzz {
    public String play(int integer) {

        if (integer % 3 == 0) {
            return "fizz";
        }
        return String.valueOf(integer);
    }
}
