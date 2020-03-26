package com.yuknis.loggingconsumer.messages;

import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;

public class XMLMessage implements Message {

    /**
     * Return the message payload.
     */
    @Override
    public Object getPayload() {
        return null;
    }

    /**
     * Return message headers for the message (never {@code null} but may be empty).
     */
    @Override
    public MessageHeaders getHeaders() {
        return null;
    }

}
