package com.VaibhavIT.blog.Services;

import java.util.List;


import com.VaibhavIT.blog.Payloads.PostDto;
import com.VaibhavIT.blog.Payloads.PostResponce;

public interface PostService {

	public PostDto createPost(PostDto postDto , Integer userId, Integer categoryId);
	
	public PostDto updatePost(PostDto postDto , Integer postId);
	
	public void deletePost(Integer postId);
	
	public PostResponce getAllPosts(Integer pageNumber , Integer pageSize , String sortBy , String sortDir);
	
	public PostDto getPostById(Integer postId);
	
	public List<PostDto> getPostsByCategory(Integer categoryId);
	
	public List<PostDto> getPostsByUser(Integer userId);
	
	public List<PostDto> searchPost(String keyword);
	
}
