package com.yuknis.loggingconsumer.converters;

import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.kafka.support.converter.RecordMessageConverter;
import org.springframework.messaging.Message;
import java.lang.reflect.Type;

public class XMLConverter implements RecordMessageConverter {

    /**
     * Convert a {@link ConsumerRecord} to a {@link Message}.
     *
     * @param record         the record.
     * @param acknowledgment the acknowledgment.
     * @param consumer       the consumer
     * @param payloadType    the required payload type.
     * @return the message.
     */
    @Override
    public Message<?> toMessage(ConsumerRecord<?, ?> record, Acknowledgment acknowledgment, Consumer<?, ?> consumer, Type payloadType) {
        return null;
    }

    /**
     * Convert a message to a producer record.
     *
     * @param message      the message.
     * @param defaultTopic the default topic to use if no header found.
     * @return the producer record.
     */
    @Override
    public ProducerRecord<?, ?> fromMessage(Message<?> message, String defaultTopic) {
        return null;
    }

}
