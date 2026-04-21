package com.micaela.internal_ai_chat.client;

import com.micaela.internal_ai_chat.dto.request.GroqRequestDTO;
import com.micaela.internal_ai_chat.dto.response.GroqResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "groq", url = "${groq.api.url}")
public interface GroqClient {

    @PostMapping
    GroqResponseDTO chat(
            @RequestHeader("Authorization") String authorization
            // completa aqui!
    );

    @PostMapping
    GroqResponseDTO chat(
            @RequestHeader("Authorization") String authorization,
            @RequestBody GroqRequestDTO request
    );

}
