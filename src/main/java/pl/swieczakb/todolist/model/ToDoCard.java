package pl.swieczakb.todolist.model;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class ToDoCard {

    @Id
    public Long id;

    public String title;

}
