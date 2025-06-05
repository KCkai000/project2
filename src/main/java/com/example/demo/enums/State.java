package com.example.demo.enums;

public enum State {
	TYPE_1(1, "事假"),
	TYPE_2(1, "病假"),
	TYPE_3(1, "特休假"),
	TYPE_4(1, "喪假"),
	TYPE_5(1, "公假");
	
	
	private final Integer code;
	private final String displayName;
	
	State(Integer code, String displayName) {
		this.code = code;
		this.displayName = displayName;
	}
	
	public Integer getCode() {
		return code;
	}
	
	public String getDisplayName() {
		return displayName;
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
