package com.VaibhavIT.blog.Entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="USER")
@NoArgsConstructor
@Getter
@Setter
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="User_id", nullable=false)
	private int id;
	
	@Column(name="User_name", nullable=false , length=100 ) 
	private String name;
	
	@Column(name="User_email", nullable=false , length=100 )
	private String email;
	
	@Column(name="User_pass", nullable=false , length=100 )
	private String password;
	
	@Column(name="User_about", nullable=false , length=100 )
	private String about;
	
	
	// To Map With Post Table
	
	@OneToMany(mappedBy = "user" , cascade = CascadeType.ALL ,fetch = FetchType.LAZY)
	private List<Post> posts=new ArrayList<>();
}
