package pl.swieczakb.todolist.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.swieczakb.todolist.model.ToDoCard;

@Repository
public interface ToDoCardRepository extends CrudRepository<ToDoCard, Long> {
}
