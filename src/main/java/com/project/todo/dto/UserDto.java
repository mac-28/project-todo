package com.project.todo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class UserDto {

    private String firstName;
    private String lastName;
    private String email;
}
