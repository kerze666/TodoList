package pl.swieczakb.todolist.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pl.swieczakb.todolist.model.ToDoCard;

@Repository
public interface ToDoCardRepository extends MongoRepository<Long, ToDoCard> {
}
