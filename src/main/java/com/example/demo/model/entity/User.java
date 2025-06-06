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
	@Column(name="name", nullable = false, length =60)
	private String username; //使用者姓名
	@Column(name = "mail", length = 100, nullable = false)
	private String userMail; // 使用者信箱
	@Column(name="account", unique = true, nullable = false, length =60)
	private String userAccount; //使用者帳號	
	@Column(name= "password", nullable = false)
	private String passwordHash; //使用者密碼
	@Column(name = "salt", nullable = false)
	private String salt;  //鹽
	@Column(name = "active")  
	private Boolean active;   //是否啟用
	@ManyToOne
	@JoinColumn(name = "role_id")
	private Role role;
	
	private Boolean deleteAt; //軟刪除?!!!就是不要顯現在頁面上嗎？
}
