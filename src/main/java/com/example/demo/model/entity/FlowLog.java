package com.example.demo.model.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class FlowLog {
	@Id
	@GeneratedValue
	private Long id;
	@ManyToOne
	@JoinColumn(name = "form_id")
	private ApplicationForm formId;
	@ManyToOne
	@JoinColumn(name = "flow_id")
	private Flow flowId;
	//這個關係有點迷還搞不清楚
	private Flow flowType;
	@CreationTimestamp
	private LocalDateTime createDate;
}
