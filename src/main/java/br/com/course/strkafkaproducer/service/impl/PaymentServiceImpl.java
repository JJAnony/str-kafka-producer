package br.com.course.strkafkaproducer.service.impl;

import br.com.course.strkafkaproducer.model.Payment;
import br.com.course.strkafkaproducer.service.PaymentService;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @Override
    @SneakyThrows
    public void createPayment(Payment payment) {
        log.info("PAYMENT_SERVICE_IMPL ::: Receive payment {}", payment);
        Thread.sleep(1000);
        log.info("Send payment ...");
        kafkaTemplate.send("payment-topic", payment);
    }
}
