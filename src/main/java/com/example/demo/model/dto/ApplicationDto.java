package com.example.demo.model.dto;

import com.example.demo.enums.Action;
import com.example.demo.enums.State;

import lombok.Data;

@Data
public class ApplicationDto {
	
	private State state; //假別的狀態
	
	private Action action;
}
