package com.kairosbarber.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest loginRequest) {
        // Aquí iría la lógica de autenticación con JWT
        return "Token generado";
    }
}
