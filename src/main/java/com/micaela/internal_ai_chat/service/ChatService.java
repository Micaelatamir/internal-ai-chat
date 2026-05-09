package com.micaela.internal_ai_chat.service;

import com.micaela.internal_ai_chat.client.GroqClient;
import com.micaela.internal_ai_chat.dto.request.GroqRequestDTO;
import com.micaela.internal_ai_chat.dto.response.GroqResponseDTO;
import com.micaela.internal_ai_chat.dto.response.MessageDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatService {

    @Autowired
    private GroqClient groqClient;

    @Value("${groq.api.key}")
    private String apiKey;

    public String chat(String userMessage) {
        MessageDTO message = new MessageDTO("user", userMessage);

        GroqRequestDTO request = new GroqRequestDTO(
                "llama-3.3-70b-versatile",
                List.of(message)
        );

        GroqResponseDTO response = groqClient.chat(
                "Bearer " + apiKey,
                request
        );

        return response.getChoices().get(0).getMessage().getContent();
    }
}