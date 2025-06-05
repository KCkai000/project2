package com.example.demo.model.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer userId;  //使用者id
	@Column(name="name", unique = true, nullable = false, length =60)
	private String username; //使用者帳號
//	@Column(name = "account", length = 30, nullable = false)
//	private String userAccount; // 使用者信箱
	@Column(name= "password", nullable = false)
	private String passwordHash; //使用者密碼
	@Column(name = "salt", nullable = false)
	private String salt;  //鹽
	@Column(name = "active")  
	private Boolean active;   //是否啟用
	@ManyToOne
	@JoinColumn(name = "role_id")
	private Role role;
}
