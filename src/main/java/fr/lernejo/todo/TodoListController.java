package fr.lernejo.todo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoListController  {
    TodoRepository repo;
    public TodoListController(TodoRepository rep)
    {
        this.repo=rep;
    }
    @PostMapping(value = "/api/todo")
    public TodoEntity ajout(@RequestBody TodoEntity todo)
    {
        return repo.save(todo);

    }
    @GetMapping(value = "/api/todo")
    public Iterable<TodoEntity> affichage()
    {
        return repo.findAll();

    }
}
