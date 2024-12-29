package com.example.auth.domain.user;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RegisterDTO(String login, String password, UserRole role) {
}
