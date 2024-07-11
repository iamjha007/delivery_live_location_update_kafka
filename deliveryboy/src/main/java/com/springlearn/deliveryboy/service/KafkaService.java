package com.springlearn.deliveryboy.service;

import com.springlearn.deliveryboy.config.AppConstants;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
@Slf4j
public class KafkaService {


    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;


    public boolean updateLocation(String location) {

        kafkaTemplate.send(AppConstants.LOCATION_TOPIC,location);
//        log.info("location sent to kafka");
//        log.info("location updated successfully");
        return true;
    }
}
