package com.cs304.alanka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cs304.alanka.model.Blog;
import com.cs304.alanka.repository.BlogRepository;


@Service
public class BlogService {

    @Autowired
    private BlogRepository blogRepository;

    public List<Blog> getAllBlogs() {
        return blogRepository.findAll();
    }

    public Blog addBlog(Blog blog){
        return blogRepository.save(blog);
    }

    public void deleteBlog(Long id){ blogRepository.deleteById(id);}
    
    public Blog getBlogById(Long id) {
    	return blogRepository.findById(id).get();
    }
    
    public Blog editBlog(Blog blog, Long id) {
    	return blogRepository.save(blog);
    }
    

}
