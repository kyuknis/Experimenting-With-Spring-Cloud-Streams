package com.yuknis.logs.demo.functions;

        import java.util.function.Function;

public class Uppercase implements Function<String, String> {

    @Override
    public String apply(String s) {
        System.out.println(String.format("%s Received: %s", Uppercase.class.getName(), s));
        return s.toUpperCase();
    }

}
