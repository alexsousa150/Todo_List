package br.com.AlexSousa.TodoList.Controller;

import br.com.AlexSousa.TodoList.Entity.Todo;
import br.com.AlexSousa.TodoList.Service.TodoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {
    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping
    List<Todo> criar(@RequestBody Todo todo){
        return todoService.criar(todo);
    }

    @GetMapping
    List<Todo> listar(){
        return todoService.listar();

    }
    @PutMapping
    List<Todo> atualizar(@RequestBody Todo todo){
        return  todoService.atualizar(todo);

    }
    @DeleteMapping("{id}")
    List<Todo> deletar(@PathVariable("id") Long id){
        return todoService.deletar(id);
    }
}
