package com.ttdat.identityservice.controller;

import com.ttdat.identityservice.dto.request.UserCreationRequest;
import com.ttdat.identityservice.dto.response.ApiResponse;
import com.ttdat.identityservice.entity.User;
import com.ttdat.identityservice.service.UserService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    ApiResponse<User> createUser(@RequestBody @Valid UserCreationRequest user) {
        ApiResponse<User> response = new ApiResponse<>();
        response.setData(userService.createUser(user));
        return response;
    }

    @PutMapping("/{userId}")
    User updateUser(@PathVariable String userId, @RequestBody UserCreationRequest user) {
        return userService.updateUser(userId, user);
    }

    @DeleteMapping("/{userId}")
    void deleteUser(@PathVariable String userId) {
        userService.deleteUser(userId);
    }

    @GetMapping
    List<User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/{userId}")
    User getUser(@PathVariable String userId) {
        return userService.getUser(userId);
    }


}
