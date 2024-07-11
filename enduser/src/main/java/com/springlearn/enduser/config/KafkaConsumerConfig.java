package com.springlearn.enduser.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConsumerConfig {

    @KafkaListener(topics = AppConstants.LOCATION_TOPIC , groupId = AppConstants.GROUP_ID)
    public void kafkaConsumerConfig(String value) {

        System.out.println(value);


    }
}
