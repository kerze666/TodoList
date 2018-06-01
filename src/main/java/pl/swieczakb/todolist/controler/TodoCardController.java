package pl.swieczakb.todolist.controler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.swieczakb.todolist.repository.ToDoCardRepository;

@RestController
public class TodoCardController {

    private ToDoCardRepository cardRepository;

    public TodoCardController(ToDoCardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    @GetMapping(value = "/")
    public ResponseEntity getCards(){
        return ResponseEntity.ok(cardRepository.findAll());
    }
}
