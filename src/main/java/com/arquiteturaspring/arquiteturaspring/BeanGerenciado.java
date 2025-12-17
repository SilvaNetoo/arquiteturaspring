package com.arquiteturaspring.arquiteturaspring;

import com.arquiteturaspring.arquiteturaspring.todos.TodoEntity;
import com.arquiteturaspring.arquiteturaspring.todos.TodoValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanGerenciado {

    @Autowired
    private TodoValidator validator;

    @Autowired
    private AppProperties properties;

    public BeanGerenciado(TodoValidator validator) {
        this.validator = validator;
    }

    public void atualizar () {
        var todo = new TodoEntity();
        validator.validar(todo);
    }

    @Autowired
    public void setValidator(TodoValidator validator) {
        this.validator = validator;
    }

}
