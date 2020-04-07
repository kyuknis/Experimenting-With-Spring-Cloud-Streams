package com.yuknis.logs.demo.functions;

import java.util.function.Function;

public class Lowercase implements Function<String, String> {

    @Override
    public String apply(String s) {
        System.out.println(String.format("%s Received: %s", Lowercase.class.getName(), s));
        return s.toLowerCase();
    }

}
