package com.atividadeSpring.atividadeSpring.services;

import com.atividadeSpring.atividadeSpring.dto.UserRequestDTO;
import com.atividadeSpring.atividadeSpring.dto.UserResponseDTO;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public UserResponseDTO validadeAge(UserRequestDTO objDto) {
        UserResponseDTO responseDTO = new UserResponseDTO();
        responseDTO.setName(objDto.getName());

        if (objDto.getAge() >= 18){
            responseDTO.setMessage("Entry Allowed");
        }else {
            responseDTO.setMessage("Entry Denied");
        }
        return responseDTO;
    }
}
