package com.ttdat.identityservice.dto.request;

import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDate;

@Data
public class UserCreationRequest {
    @Size(min = 3, message = "INVALID_USERNAME")
    private String username;

    @Size(min = 8, message = "INVALID_PASSWORD")
    private String password;

    private String firstName;

    private String lastName;

    private LocalDate dob;
}
