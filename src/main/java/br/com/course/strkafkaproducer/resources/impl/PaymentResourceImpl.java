package br.com.course.strkafkaproducer.resources.impl;

import br.com.course.strkafkaproducer.model.Payment;
import br.com.course.strkafkaproducer.resources.PaymentResource;
import br.com.course.strkafkaproducer.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "payments")
public class PaymentResourceImpl  implements PaymentResource {

    @Autowired
    private PaymentService service;


    @Override
    public ResponseEntity<Payment> create(Payment payment) {
        service.createPayment(payment);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
