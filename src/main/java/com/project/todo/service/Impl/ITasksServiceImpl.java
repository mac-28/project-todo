package com.project.todo.service.Impl;

import com.project.todo.dto.TaskDto;
import com.project.todo.entity.Task;
import com.project.todo.exceptions.ResourceNotFoundException;
import com.project.todo.mapper.TaskMapper;
import com.project.todo.repository.TasksRepository;
import com.project.todo.service.ITasksService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ITasksServiceImpl implements ITasksService {

    private final TasksRepository tasksRepository;
    @Override
    public void createTask(TaskDto taskDto) {
        tasksRepository.save(TaskMapper.dtoToTask(taskDto, new Task()));
    }

    @Override
    public List<Task> fetchTasks() {
        return tasksRepository.findAll();

    }

    @Override
    public Task updateTask(long taskId,TaskDto taskDto) {
        Task task = tasksRepository.findById(taskId).orElseThrow(
                () -> new ResourceNotFoundException("Task", "taskId", String.valueOf(taskId))
        );

        task.setTitle(taskDto.getTitle());
        task.setDescription(taskDto.getDescription());
        task.setCompleted(taskDto.isCompleted());
        return tasksRepository.save(task);
    }

    @Override
    public Task fetchTask(long taskId) {
        return tasksRepository.findById(taskId).orElseThrow(
                () -> new ResourceNotFoundException("Task", "taskId", String.valueOf(taskId)));
    }

    @Override
    public void deleteTask(long taskId) {
        Task task = tasksRepository.findById(taskId).orElseThrow(
                () -> new ResourceNotFoundException("Task", "taskId", String.valueOf(taskId))
        );
        tasksRepository.delete(task);
    }
}
