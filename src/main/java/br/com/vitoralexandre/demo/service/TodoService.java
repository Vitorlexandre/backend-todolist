package br.com.vitoralexandre.demo.service;

import br.com.vitoralexandre.demo.entity.Todo;
import br.com.vitoralexandre.demo.repository.TodoRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> create(Todo todo) {
        todoRepository.save(todo);
        return list();

    }
    public List<Todo> list() {
        Sort sort = Sort.by("prioridade").descending().and(
                Sort.by("nome").ascending());
        return todoRepository.findAll(sort);

    }
    public List<Todo> update(Todo todo) {
        todoRepository.save(todo);
        return list();

    }
    public List<Todo> delete(Long id) {
        todoRepository.deleteById(id);
        return list();

    }

}
