package com.example.demo.service;

import com.example.demo.entity.Task;
import com.example.demo.repository.TaskRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TaskServiceImpl implements TaskService {

    private final TaskRepository repository;


    @Override
    public List<Task> findAllTask() {
        return repository.findAll();
    }

    @Override
    public Optional<Task> findTaskById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Task createTask(Task task) {
        return repository.save(task);
    }


    @Override
    public Task updateTask(Long id, Task task) {
        return repository.save(task);
    }

    @Override
    public void deleteTask(Long id) {
         repository.deleteById(id);
    }

    @Override
    public List<Task> findByAuthor(String author) {
        return repository.findByAuthor(author);
    }

    @Override
    public List<Task> findByStatus(String status) {
        return repository.findByStatus(status);
    }
}
