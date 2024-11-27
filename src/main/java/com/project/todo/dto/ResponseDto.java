package com.project.todo.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@Schema(name = "Response", description = "Schema to old successful response information")
public class ResponseDto {

    @Schema(description = "Status Code", example = "200")
    private String statusCode;

    @Schema(description = "Status Message", example = "Success")
    private String statusMsg;
}
