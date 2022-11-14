package com.VaibhavIT.blog.Services;

import java.util.List;

import com.VaibhavIT.blog.Payloads.CategoryDto;

public interface CategoryService {

	public CategoryDto createCategory(CategoryDto categoryDto);
	
	public CategoryDto updateCategory(CategoryDto categoryDto,Integer categoryId);
	
	public void deleteCategory(Integer categoryId);
	
	public CategoryDto getSingleCategory(Integer categoryId);
	
	public List<CategoryDto> getAllCategories();
}
