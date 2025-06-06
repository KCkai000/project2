package com.example.demo.enums;

import lombok.Getter;

@Getter
public enum Status {
	SUBMITTED("已送出"),
	PENDING("待審核"),
	APPROVED("已批准"),
	REJECTED("已拒絕"),
	CANCELLED("已取消");

	private final String displayName;
	
	Status (String displayName){
		this.displayName = displayName;
	}
	
	@Override
	public String toString() {
		return displayName;
	}
}
