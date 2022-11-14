package com.VaibhavIT.blog.Payloads;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class UserDTO {

	private int id;
	
	@NotEmpty
	@Size(min = 5, message= "Username Must Be Min 4 Charectors")
	private String name;
	
	@Email(message= "Email Address Is Not Valid")
	private String email;
	
	@NotEmpty
	@Size(min = 4 , message= "Password Must Be Min 3 Charectors")
	private String password;
	
	@NotEmpty
	private String about;
}
