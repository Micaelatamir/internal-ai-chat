package com.micaela.internal_ai_chat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class InternalAiChatApplication {
	public static void main(String[] args) {
		SpringApplication.run(InternalAiChatApplication.class, args);
	}
}