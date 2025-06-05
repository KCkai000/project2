package com.example.demo.model.dto;

import com.example.demo.model.entity.Role;

import lombok.Data;

@Data
public class UserDto {
	private Integer userId;
	private String username;
	private Boolean active;
	private Role role;
}
