package com.yuknis.logs.demo.functions;

import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;

import java.util.function.Function;

public class CharCount implements Function<String, Message<Integer>> {

    protected static Integer currentCharCount;

    @Override
    public Message<Integer> apply(String s) {

        System.err.println(String.format("%s Received: %s", CharCount.class.getName(), s));

        return  MessageBuilder.withPayload(s.length ( ))
                    .setHeader("spring.cloud.stream.sendto.destination", "charCount-out-0")
                    .build();

    }

}
