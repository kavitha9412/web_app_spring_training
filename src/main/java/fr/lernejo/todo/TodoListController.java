package fr.lernejo.todo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoListController {
    private List<Todo> liste = new ArrayList<>();


    @PostMapping("/api/todo")
        public void AddList(@RequestBody Todo newTodo){
            liste.add(newTodo);
    }

    @GetMapping("/api/todo")
    public List<Todo> SendList() {
        return liste;

    }
}
