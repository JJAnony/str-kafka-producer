package br.com.course.strkafkaproducer.service;

import lombok.extern.log4j.Log4j2;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.SuccessCallback;

import java.util.concurrent.Future;

@Log4j2
@Service
public class ProducerService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message) {
        log.info("Send message {}", message);
        kafkaTemplate.send("str-topic", message);
                /**.addCallback(sucess -> {
                    if (callback != null) {
                        log.info("Send message with sucess {}", message);
                        log.info("Partition {}, offset {}",
                                callback.getRecordMetadata().partition(),
                                callback.getRecordMetadata().offset());
                    }
                }, error -> log.error("Error send message"));
                 **/
    }



}
