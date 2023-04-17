package com.cs304.alanka.controller;

import com.cs304.alanka.model.Blog;
import com.cs304.alanka.service.BlogService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins="*")
@RestController
@RequestMapping(path = "api/blog")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @GetMapping("/getAll")
    public List<Blog> getAllBlogs(){return blogService.getAllBlogs();}

    @GetMapping("/get/{id}")
    public Blog getBlog(@PathVariable(name="id") Long id) {
    	return blogService.getBlogById(id);
    }
    
    @PostMapping("/save")
    public Blog addBlog(@RequestBody Blog blog){return blogService.addBlog(blog);}
    
    @DeleteMapping("/delete/{id}")
    public void deleteBlog(@PathVariable(name="id") Long id) {
    	blogService.deleteBlog(id);
    }
    
    @PostMapping("/edit/{id}")
    public Blog editBlog(@RequestBody Blog blog, @PathVariable Long id) {
    	blog.setBlogId(id);
    	return blogService.addBlog(blog);
    }

}
