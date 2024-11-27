package com.project.todo.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Schema(name = "Error Response", description = "Error Response")
public class ErrorResponseDto {

    @Schema(description = "API Path Invoked by client")
    private String apiPath;
    @Schema(description = "Error Code representing the error occurred")
    private HttpStatus errorCode;

    @Schema(description = "Error Message")
    private String errorMessage;
    @Schema(description = "Error Time")
    private LocalDateTime errorTime;


}
