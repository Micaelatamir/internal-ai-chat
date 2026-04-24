package com.micaela.internal_ai_chat.dto.request;
import com.micaela.internal_ai_chat.dto.response.MessageDTO;
import com.micaela.internal_ai_chat.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GroqRequestDTO {
    private String model;
    private List<MessageDTO> messages;
}