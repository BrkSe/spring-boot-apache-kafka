package com.burakkutbay.springbootapachekafka.controller;

import com.burakkutbay.springbootapachekafka.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Hasan Burak KUTBAY on 12/13/20.
 */
@RestController
@RequestMapping(value = "/kafkaController")
public class KafkaController {

    private final Producer producer;

    @Autowired
    KafkaController(Producer producer) {
        this.producer = producer;
    }

    @PostMapping(value = "/yayin")
    public void sendMessageToKafkaTopic(@RequestParam("mesaj") String mesaj) {
        this.producer.sendMessage(mesaj);
    }

}
