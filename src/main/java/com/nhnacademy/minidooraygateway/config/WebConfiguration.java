package com.nhnacademy.minidooraygateway.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@Configuration
@EnableConfigurationProperties({UrlProperties.class, OAuth2Properties.class, TaskUrlProperties.class, RedisConfig.class})
public class WebConfiguration {
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder
                .setReadTimeout(Duration.ofSeconds(3L))
                .setConnectTimeout(Duration.ofSeconds(3L))
                .build();
    }
}
