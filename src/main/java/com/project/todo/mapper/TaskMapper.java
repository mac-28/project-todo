package com.project.todo.mapper;

import com.project.todo.dto.TaskDto;
import com.project.todo.entity.Task;

public class TaskMapper {

    public static Task dtoToTask(TaskDto taskDto, Task task) {

        task.setTitle(taskDto.getTitle());
        task.setDescription(taskDto.getDescription());
        return task;
    }

    public static TaskDto taskToDto(Task task, TaskDto taskDto) {
        taskDto.setTitle(task.getTitle());
        taskDto.setDescription(task.getDescription());
        return taskDto;
    }
}