package com.thindipos.backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.thindipos.backend.dto.LoginRequest;
import com.thindipos.backend.dto.RegisterRequest;
import com.thindipos.backend.dto.UserResponse;
import com.thindipos.backend.service.AuthService;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/register")
    public ResponseEntity<UserResponse> register(
            @RequestBody RegisterRequest request) {

        UserResponse response = authService.register(request);

        return ResponseEntity.ok(response);
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(
            @RequestBody LoginRequest request) {

        String token = authService.login(request);

        return ResponseEntity.ok(token);
    }
    @GetMapping("/me")
    public UserResponse getCurrentUser(Authentication authentication) {

        String username = authentication.getName();

        return authService.getCurrentUser(username);
    }
}