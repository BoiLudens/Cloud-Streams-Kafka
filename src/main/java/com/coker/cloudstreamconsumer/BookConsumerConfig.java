package com.coker.cloudstreamconsumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component
@Slf4j
public class BookConsumerConfig {
    @Autowired
    private KafkaService kafkaService;

    @Bean
    public Consumer<String> consumeLive() {
        return message -> {
            log.info("message received");
            if(kafkaService.consumeLive(message))
            {
                log.info("successfully processed");
            }
            else
            {
                log.info("failed to process");
            }
        };
    }
}
