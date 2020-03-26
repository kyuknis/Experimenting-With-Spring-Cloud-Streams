package com.yuknis.loggingconsumer.functions;

import java.util.function.Function;

public class Uppercase implements Function<String, String> {

    /**
     * Applies this function to the given argument.
     *
     * @param s the function argument
     * @return the function result
     */
    @Override
    public String apply(String s) {
        System.out.println(String.format("RECEIVED: %S", s));
        int n = 0/0;
        return s.toUpperCase();
    }

}
