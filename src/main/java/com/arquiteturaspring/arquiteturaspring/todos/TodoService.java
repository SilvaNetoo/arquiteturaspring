package com.arquiteturaspring.arquiteturaspring.todos;

import org.springframework.stereotype.Service;

@Service
public class TodoService {


    private TodoRepository repository;

    public TodoService(TodoRepository repository) {
        this.repository = repository;
    }

    public TodoEntity salvar (TodoEntity todo) {
        return repository.save(todo);
    }

    public void atualizarStatus(Integer id, TodoEntity todo) {
        todo.setId(id);
        repository.save(todo);
    }

    public TodoEntity buscarPorId(Integer id) {
        return repository.findById(id).orElse(null);
    }
}
