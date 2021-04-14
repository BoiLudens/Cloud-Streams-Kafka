package com.coker.cloudstreamconsumer;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class KafkaService {
    public boolean consume(String message) {
        log.info("Entering kafkaService.consume");
        try {
            System.out.println(message);
            return true;
        }
        catch(Exception e) {
            return false;
        }
    }
}
