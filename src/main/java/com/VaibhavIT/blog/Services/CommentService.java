package com.VaibhavIT.blog.Services;

import com.VaibhavIT.blog.Payloads.CommentDto;

public interface CommentService {

	public CommentDto createComment(CommentDto commentDto , Integer postId);
	
	public void deleteComment(Integer commentId);
}
