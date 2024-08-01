package com.ttdat.identityservice.controller;

import com.ttdat.identityservice.dto.request.UserCreationRequest;
import com.ttdat.identityservice.dto.request.UserUpdateRequest;
import com.ttdat.identityservice.dto.response.ApiResponse;
import com.ttdat.identityservice.dto.response.UserResponse;
import com.ttdat.identityservice.entity.User;
import com.ttdat.identityservice.service.UserService;
import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserController {

    UserService userService;

    @PostMapping
    ApiResponse<UserResponse> createUser(@RequestBody @Valid UserCreationRequest user) {
        ApiResponse<UserResponse> response = new ApiResponse<>();
        response.setData(userService.createUser(user));
        return response;
    }

    @PutMapping("/{userId}")
    ApiResponse<UserResponse> updateUser(@PathVariable String userId, @RequestBody UserUpdateRequest user) {
        ApiResponse<UserResponse> response = new ApiResponse<>();
        response.setData(userService.updateUser(userId, user));
        return response;
    }

    @DeleteMapping("/{userId}")
    void deleteUser(@PathVariable String userId) {
        userService.deleteUser(userId);
    }

    @GetMapping
    ApiResponse<List<UserResponse>> getUsers() {
        ApiResponse<List<UserResponse>> response = new ApiResponse<>();
        response.setData(userService.getUsers());
        return response;
    }

    @GetMapping("/{userId}")
    ApiResponse<UserResponse> getUser(@PathVariable String userId) {
        ApiResponse<UserResponse> response = new ApiResponse<>();
        response.setData(userService.getUser(userId));
        return response;
    }


}
