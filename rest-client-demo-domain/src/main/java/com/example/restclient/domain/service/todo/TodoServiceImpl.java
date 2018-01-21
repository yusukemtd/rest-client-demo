package com.example.restclient.domain.service.todo;

import java.net.URI;
import java.util.Collection;
import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.example.restclient.domain.model.Todo;

@Service
@Transactional
public class TodoServiceImpl implements TodoService {

    private static final long MAX_UNFINISHED_COUNT = 5;

    @Inject
    RestTemplate restTemplate;

    @Value("${api.url:http://localhost:8080/rest-server-demo-web/api/v1/todos}")
    URI uri;

    @Override
    @Transactional(readOnly = true)
    public Todo findOne(String todoId) {
        // Todo todo = todoRepository.findOne(todoId);
        // if (todo == null) {
        //
        // ResultMessages messages = ResultMessages.error();
        // messages.add(ResultMessage.fromText("[E404] The requested Todo is not found.
        // (id=" + todoId + ")"));
        //
        // throw new ResourceNotFoundException(messages);
        // }
        // return todo;
        return null;
    }

    @Override
    @Transactional(readOnly = true)
    public Collection<Todo> findAll() {

        RequestEntity<Void> requestEntity = RequestEntity.get(uri).build();

        ResponseEntity<List<Todo>> responseEntity = restTemplate.exchange(requestEntity,
                new ParameterizedTypeReference<List<Todo>>() {
                });

        List<Todo> userList = responseEntity.getBody();

        return userList;
    }

    @Override
    public Todo create(Todo todo) {
        // long unfinishedCount = todoRepository.countByFinished(false);
        // if (unfinishedCount >= MAX_UNFINISHED_COUNT) {
        // ResultMessages messages = ResultMessages.error();
        // messages.add(ResultMessage
        // .fromText("[E001] The count of un-finished Todo must not be over " +
        // MAX_UNFINISHED_COUNT + "."));
        //
        // throw new BusinessException(messages);
        // }
        //
        // String todoId = UUID.randomUUID().toString();
        // Date createdAt = new Date();
        //
        // todo.setTodoId(todoId);
        // todo.setCreatedAt(createdAt);
        // todo.setFinished(false);
        //
        // todoRepository.create(todo);
        //
        // return todo;
        return null;
    }

    @Override
    public Todo finish(String todoId) {
        // Todo todo = findOne(todoId);
        // if (todo.isFinished()) {
        // ResultMessages messages = ResultMessages.error();
        // messages.add(ResultMessage.fromText("[E002] The requested Todo is already
        // finished. (id=" + todoId + ")"));
        // throw new BusinessException(messages);
        // }
        // todo.setFinished(true);
        // todoRepository.update(todo);
        //
        // return todo;
        return null;
    }

    @Override
    public void delete(String todoId) {
        // Todo todo = findOne(todoId);
        // todoRepository.delete(todo);
    }
}