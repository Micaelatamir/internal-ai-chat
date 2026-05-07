package com.micaela.internal_ai_chat.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GroqResponseDTO {
    private List<ChoiceDTO> choices;
}