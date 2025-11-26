package Lektion5;


import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/messages")
public class MessageController {

    private final MessageService service;

    public MessageController(MessageService service) {
        this.service = service;
    }


    @PostMapping
    public Mono<ResponseEntity<Message>> createMessage(
            @Valid @RequestBody Message message
    ) {
        return service.createMessage(message)
                .map(saved -> ResponseEntity
                        .status(HttpStatus.CREATED) // 201
                        .body(saved)
                );
    }


    @GetMapping("/{id}")
    public Mono<ResponseEntity<Message>> getMessage(@PathVariable Long id) {
        return service.getMessageById(id)
                .map(ResponseEntity::ok);
    }
}
