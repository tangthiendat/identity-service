package com.ttdat.identityservice.controller;

import com.ttdat.identityservice.dto.request.UserCreationRequest;
import com.ttdat.identityservice.entity.User;
import com.ttdat.identityservice.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    User createUser(@RequestBody UserCreationRequest user) {
        return userService.createUser(user);
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
