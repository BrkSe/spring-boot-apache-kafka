package com.burakkutbay.springbootapachekafka.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * Created by Hasan Burak KUTBAY on 12/13/20.
 */
@Service
public class Consumer {

    private final Logger logger = LoggerFactory.getLogger(Producer.class);

    @KafkaListener(topics = "ogrenciler", groupId = "group_id")
    public void consume(String message) throws IOException {
        logger.info(String.format("# -> Consumer mesajı -> %s", message));
    }
}
