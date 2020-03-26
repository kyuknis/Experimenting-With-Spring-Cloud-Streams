package com.yuknis.loggingconsumer.functions;

import java.util.function.Function;

public class CharCounter implements Function<String, Integer> {

    /**
     * Applies this function to the given argument.
     *
     * @param s the function argument
     * @return the function result
     */
    @Override
    public Integer apply(String s) {
        System.out.println(String.format("RECEIVED: %S", s));
        return s.length();
    }

}
