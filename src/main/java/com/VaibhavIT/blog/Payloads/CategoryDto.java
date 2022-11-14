package com.VaibhavIT.blog.Payloads;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {

	
	private Integer categoryId;
	
	@NotEmpty
	@Size(min=4 , message="Min Size Of Category Title Should Be 4")
	private String categoryTitle;
	
	@NotEmpty
	@Size(min=10 ,message="Min Size Of Category Descripton Should Be 10")
	private String categoryDescription;
}
