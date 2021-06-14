package com.example.adv2.controllers;

import com.example.adv2.dao.TodoDAO;
import com.example.adv2.models.Todo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class TodoController {


    private TodoDAO todoDAO;


    //localhost:8080 for get
    @GetMapping("/todos")
    public List<Todo> getTodos(){
        List<Todo> all = todoDAO.findAll();
        return all;
    }

    @GetMapping("/todos/{id}")
    public Todo getTodoById(@PathVariable int id){
        return todoDAO.findById(id).orElseGet(Todo::new);
    }

    @PostMapping("/todos")
    public void postTodo(@RequestBody Todo todo){
        System.out.println(todo);
        todoDAO.save(todo);
    }


    @PostMapping("/saveTodoWithUser")
    public List<Todo> saveTodoWithUser(@RequestBody Todo todo){
        System.out.println(todo);
        System.out.println(todo.getUser());

        todoDAO.save(todo);

        return todoDAO.findAll();
    }
    //        User s = new User();
    //        s.setName("Danny");
    //        userDAO.save(s);



//    @DeleteMapping("/users/{id}")
//    public List<User>deleteUserById(@PathVariable int id){
//        userDAO.deleteById(id);
//        return userDAO.findAll();
//    }

    @DeleteMapping("/users")
    public List<Todo>deleteUserById(@RequestParam int id){
        todoDAO.deleteById(id);
        return todoDAO.findAll();
    }
}
