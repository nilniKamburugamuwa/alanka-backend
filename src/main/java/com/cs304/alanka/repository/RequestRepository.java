package com.cs304.alanka.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cs304.alanka.model.Request;

public interface RequestRepository extends JpaRepository<Request, Long>{

	public Request getRequestById(Long id);
}


