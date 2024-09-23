package com.atividadeSpring.atividadeSpring.controller;


import com.atividadeSpring.atividadeSpring.dto.UserRequestDTO;
import com.atividadeSpring.atividadeSpring.dto.UserResponseDTO;
import com.atividadeSpring.atividadeSpring.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping
    public ResponseEntity<UserResponseDTO> create (@RequestBody UserRequestDTO objDto){
        UserResponseDTO responseDTO = service.validadeAge(objDto);
        return ResponseEntity.ok(responseDTO);
    }
}
