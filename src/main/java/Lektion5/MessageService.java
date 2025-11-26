package Lektion5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class MessageService {

    private static final Logger log = LoggerFactory.getLogger(MessageService.class);

    private final MessageRepository repository;

    public MessageService(MessageRepository repository) {
        this.repository = repository;
    }

    public Mono<Message> createMessage(Message incoming) {

        Message toSave = Message.createNew(incoming.message());

        log.info("Creating new message: {}", toSave.message());

        return repository.save(toSave);
    }

    public Mono<Message> getMessageById(Long id) {
        return repository.findById(id)
                .switchIfEmpty(Mono.error(new MessageNotFoundException(id)));
    }
}