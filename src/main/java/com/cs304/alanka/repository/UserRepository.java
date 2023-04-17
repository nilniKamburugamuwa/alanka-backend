package com.cs304.alanka.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cs304.alanka.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{

	public User getUserById(Long id);
	
	Optional<User> findByEmail(String email);

	//public User findByUsername(String username);
}

