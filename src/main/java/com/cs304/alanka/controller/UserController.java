package com.cs304.alanka.controller;

import com.cs304.alanka.model.User;
import com.cs304.alanka.service.UserService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins="*")
@RestController
@RequestMapping(path = "api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getAll")
    public List<User> getAllUsers(){return userService.getAllUsers();}

    @GetMapping("/get/{id}")
    public User getUser(@PathVariable(name="id") Long id) {
    	return userService.getUserById(id);
    }
    
    @GetMapping("/get/{email}")
    public User getUser(@PathVariable(name="email") String email) {
    	return userService.getUserByEmail(email);
    }
    
    @PostMapping("/save")
    public User addUser(@RequestBody User user){return userService.addUser(user);}
    
    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable(name="id") Long id) {
    	userService.deleteUser(id);
    }
    
    @PostMapping("/edit/{id}")
    public User editUser(@RequestBody User user, @PathVariable Long id) {
    	user.setId(id);
    	return userService.addUser(user);
    }

}