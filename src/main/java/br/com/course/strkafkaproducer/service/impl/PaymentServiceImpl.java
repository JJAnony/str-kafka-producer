package br.com.course.strkafkaproducer.service.impl;

import br.com.course.strkafkaproducer.model.Payment;
import br.com.course.strkafkaproducer.service.PaymentService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class PaymentServiceImpl  implements PaymentService {
    @Override
    public void createPayment(Payment payment) {
        log.info("PAYMENT_SERVICE_IMPL ::: Receive payment {}", payment);
    }
}
