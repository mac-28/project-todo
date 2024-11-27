package com.project.todo.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Entity
@Data
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "task_id")
    private Long taskId;

//    @ManyToOne
//    @JoinColumn(name = "user_id", nullable = false)
//    private User userId;
    private String title;
    private String description;

    @Column(name = "is_completed", nullable = false)
    private boolean isCompleted = false;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(insertable = false)
    private LocalDateTime updatedAt;

}
