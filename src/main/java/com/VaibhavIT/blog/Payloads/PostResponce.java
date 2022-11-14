package com.VaibhavIT.blog.Payloads;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@Getter
@Setter
public class PostResponce {

	private List<PostDto> content;
	
	private Integer pageNumber;
	
	private Integer pageSize;
	
	private long totalElements;
	
	private Integer totalPages;
	
	private boolean lastPage;
}
