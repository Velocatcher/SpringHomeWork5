package com.example.demo.controler;

import com.example.demo.entity.Task;
import com.example.demo.service.TaskService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService service;


    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return service.createTask(task);
    }

    @GetMapping("/list")
    public List<Task> findAllTask(){
        return service.findAllTask();
    }

    @GetMapping("/{id}")
    public Optional<Task> getTaskById(@PathVariable Long id) {
        return service.findTaskById(id);
    }

    @GetMapping("/{author}")
    public List<Task> findByAuthor(@PathVariable String author) {
        return service.findByAuthor(author);
    }

    @GetMapping("/{status}")
    public List<Task> findByStatus(@PathVariable String status) {
        return service.findByStatus(status);
    }


    @PutMapping("/{id}")
    public Task updateTask(@PathVariable Long id, @RequestBody Task task) {
        return service.updateTask(id, task);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        service.deleteTask(id);
    }


}
