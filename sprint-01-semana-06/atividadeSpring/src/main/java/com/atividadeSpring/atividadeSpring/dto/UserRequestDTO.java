package com.atividadeSpring.atividadeSpring.dto;

import java.io.Serializable;

public class UserRequestDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private Integer age;

    public UserRequestDTO(){}

    public UserRequestDTO(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
