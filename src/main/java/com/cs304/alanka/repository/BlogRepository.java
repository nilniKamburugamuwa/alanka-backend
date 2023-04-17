package com.cs304.alanka.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cs304.alanka.model.Blog;

@Repository
public interface BlogRepository extends JpaRepository<Blog,Long>{

	public Blog getBlogById(Long id);
}
