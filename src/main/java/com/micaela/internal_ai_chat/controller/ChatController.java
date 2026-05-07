package com.micaela.internal_ai_chat.controller;

import com.micaela.internal_ai_chat.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/chat")
public class ChatController {

    @Autowired
    private ChatService chatService;

    @PostMapping
    public String chat(@RequestBody String message) {
        return chatService.chat(message);
    }
}