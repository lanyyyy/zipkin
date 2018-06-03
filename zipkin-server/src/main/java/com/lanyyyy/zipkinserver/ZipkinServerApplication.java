package com.lanyyyy.zipkinserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;
import org.springframework.kafka.annotation.EnableKafkaStreams;

@SpringBootApplication
@EnableZipkinStreamServer
//@EnableKafkaStreams
public class ZipkinServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZipkinServerApplication.class, args);
    }
}
