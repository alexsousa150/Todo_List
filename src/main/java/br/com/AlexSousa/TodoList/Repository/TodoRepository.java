package br.com.AlexSousa.TodoList.Repository;

import br.com.AlexSousa.TodoList.Entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
