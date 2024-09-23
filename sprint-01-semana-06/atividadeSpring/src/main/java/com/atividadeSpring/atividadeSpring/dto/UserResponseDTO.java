package com.atividadeSpring.atividadeSpring.dto;

import java.io.Serializable;

public class UserResponseDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private String message;

    public UserResponseDTO(){}

    public UserResponseDTO(String name, String message) {
        this.name = name;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
