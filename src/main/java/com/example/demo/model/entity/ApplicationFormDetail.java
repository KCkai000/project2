package com.example.demo.model.entity;

import java.time.LocalDateTime;

import com.example.demo.enums.State;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ApplicationFormDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne
	private ApplicationForm applicationForm;
	
	private State leaveType;
	
	private LocalDateTime startDate;
	
	private LocalDateTime endDate;
}
