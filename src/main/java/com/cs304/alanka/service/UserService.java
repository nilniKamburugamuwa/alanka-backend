package com.cs304.alanka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cs304.alanka.model.User;
import com.cs304.alanka.repository.UserRepository;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User addUser(User user){
        return userRepository.save(user);
    }

    public void deleteUser(Long id){ userRepository.deleteById(id);}

    public boolean checkPassword(Long user_id, String password){
        return userRepository.getUserById(user_id).getPassword().equals(password);  
    }
    
    public User getUserById(Long id) {
    	return userRepository.findById(id).get();
    }
    
    public User editUser(User user, Long id) {
    	return userRepository.save(user);
    }

    public User getUserByEmail(String email) {
    	return userRepository.findByEmail(email).get();
    }
}
