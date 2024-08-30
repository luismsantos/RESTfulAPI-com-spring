package com.aprendendo.dev.controller;

import com.aprendendo.dev.domain.model.User;
import com.aprendendo.dev.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users") // definindo um caminho para endpoints
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}") // fazendo a req GET por id
    public ResponseEntity<User> findById(@PathVariable Long id) {
        var user = userService.findById(id);
        return ResponseEntity.ok(user);
    }
}
