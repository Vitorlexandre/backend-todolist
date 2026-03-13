package br.com.vitoralexandre.demo.repository;

import br.com.vitoralexandre.demo.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
