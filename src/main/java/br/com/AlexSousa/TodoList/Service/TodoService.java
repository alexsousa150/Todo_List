package br.com.AlexSousa.TodoList.Service;

import br.com.AlexSousa.TodoList.Entity.Todo;
import br.com.AlexSousa.TodoList.Repository.TodoRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> criar(Todo todo){
        todoRepository.save(todo);
        return listar();
    }
    public List<Todo> listar(){
        Sort sort = Sort.by("prioridade").descending().and(
                Sort.by("nome"))
                .ascending();
        return todoRepository.findAll(sort);
    }
    public List<Todo> atualizar(Todo todo){
        todoRepository.save(todo);
        return listar();
    }
    public List<Todo> deletar(Long id){
        todoRepository.deleteById(id);
        return listar();
    }
}
