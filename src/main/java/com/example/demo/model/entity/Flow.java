package com.example.demo.model.entity;

import java.awt.Desktop.Action;

import com.example.demo.enums.State;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "flow")
public class Flow {
	@Id
	@GeneratedValue
	private Long id;
	
	private String flowType;
	
	@Enumerated(EnumType.STRING)
	private State state;
	
	@Enumerated(EnumType.STRING)
	private Action action;
	
	private Integer type;  // 1 =>起始  2=>結束
	
	@ManyToOne
	@JoinColumn(name = "role_id")
	private Role role;
	
	@ManyToOne
	@JoinColumn(name = "goto")
	private Flow nextFlow;
}
