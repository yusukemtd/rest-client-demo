package com.example.restclient.domain.service.todo;

import java.util.Collection;

import com.example.restclient.domain.model.Todo;

public interface TodoService {

    Todo findOne(String todoId);

    Collection<Todo> findAll();

    Todo create(Todo todo);

    Todo finish(String todoId);

    void delete(String todoId);
}
