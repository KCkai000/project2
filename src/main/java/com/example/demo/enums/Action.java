package com.example.demo.enums;

import lombok.Getter;

@Getter
public enum Action {
	SUBMIT(1,"正常"),
	RETURN(2,"退回");
	
	private final Integer code;
	private final String displayName;
	
	Action(Integer code, String displayName) {
		this.code = code;
		this.displayName = displayName;
	}
	
	// 根據輸入數字 返回對應的狀態
	public static State fromCode(Integer code) {
		for(State type : State.values()) {
			if(type.getCode().equals(code)) {
				return type;
			}
		}
		return null;
	}
}
