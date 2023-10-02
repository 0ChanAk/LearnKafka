package com.shipmentLocationUpdate.shipmentLocationUpdate.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import static com.shipmentLocationUpdate.shipmentLocationUpdate.config.AppContants.LOCATION_TOPIC_NAME;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic topic(){
        return TopicBuilder
                .name(LOCATION_TOPIC_NAME)
                .build();
    }
}
