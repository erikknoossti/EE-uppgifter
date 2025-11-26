package Lektion5;

import jakarta.validation.constraints.NotBlank;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.relational.core.mapping.Column;

import java.time.LocalDateTime;

@Table("messages")
public record Message(
        @Id
        Long id,

        @NotBlank(message = "Message must not be blank")
        String message,

        @Column("created_at")
        LocalDateTime createdAt
) {
    public static Message createNew(String message) {
        return new Message(null, message, LocalDateTime.now());
    }
}