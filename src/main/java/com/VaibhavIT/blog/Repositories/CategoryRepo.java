package com.VaibhavIT.blog.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.VaibhavIT.blog.Entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
