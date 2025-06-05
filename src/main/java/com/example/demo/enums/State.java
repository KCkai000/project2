package com.example.demo.enums;

import lombok.Getter;

@Getter
public enum State {
	TYPE_1(1, "事假"),
	TYPE_2(2, "病假"),
	TYPE_3(3, "特休假"),
	TYPE_4(4, "喪假"),
	TYPE_5(5, "公假");
	
	
	private final Integer code;
	private final String displayName;
	
	State(Integer code, String displayName) {
		this.code = code;
		this.displayName = displayName;
	}
	
	// 根據輸入數字 返回對應的假別
	public static State fromCode(Integer code) {
		for(State type : State.values()) {
			if(type.code.equals(code)) {
				return type;
			}
		}
		return null;
	}
}
