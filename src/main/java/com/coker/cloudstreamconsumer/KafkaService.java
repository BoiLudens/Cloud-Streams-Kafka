package com.coker.cloudstreamconsumer;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class KafkaService {
    public boolean consumeLive(String message) {
        log.info("Entering kafkaService.consume");
        try {
            log.info(message);
            return true;
        }
        catch(Exception e) {
            return false;
        }
    }
}
