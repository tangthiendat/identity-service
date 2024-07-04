package com.ttdat.identityservice.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponse <T>{
    private int status = 200;
    private String message;
    private T data;
}
