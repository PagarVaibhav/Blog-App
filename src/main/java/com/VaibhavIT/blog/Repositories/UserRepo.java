package com.VaibhavIT.blog.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.VaibhavIT.blog.Entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
