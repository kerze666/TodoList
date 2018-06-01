package pl.swieczakb.todolist.model;


import lombok.Data;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@Data
@NodeEntity
public class ToDoCard {

    @Id
    @GeneratedValue
    public Long id;

    public String title;

}
