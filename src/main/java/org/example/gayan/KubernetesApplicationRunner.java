package org.example.gayan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KubernetesApplicationRunner {
    public static void main(String[] args) {
        SpringApplication.run(KubernetesApplicationRunner.class,args);
    }
}