package com.example.demo.enums;

public enum Action {
	SUBMIT("正常"),
	RETURN("退回");
	
	private final String displayName;
	
	private Action(String displayName) {
		this.displayName = displayName;
	}
	
	public String getDisplayName() {
		return displayName;
	}
	
	@Override
	public String toString() {
		return this.name();
	}
}
