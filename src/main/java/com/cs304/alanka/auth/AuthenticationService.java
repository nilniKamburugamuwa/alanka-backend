package com.cs304.alanka.auth;

import java.util.Optional;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.cs304.alanka.config.JwtService;
import com.cs304.alanka.model.Role;
import com.cs304.alanka.model.User;
import com.cs304.alanka.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
	
	private final UserRepository repository;
	private final PasswordEncoder passwordEncoder;
	private final JwtService jwtService;
	private final AuthenticationManager authenticationManager;
	
	public AuthenticationResponse register(RegisterRequest request) {
		var user = User.builder().type(request.getType()).firstName(request.getFirstName()).lastName(request.getLastName()).email(request.getEmail()).password(passwordEncoder.encode(request.getPassword())).role(Role.USER).build();
		repository.save(user);
		var jwtToken = jwtService.generateToken(user);
		return AuthenticationResponse.builder().token(jwtToken).build();
	}

	public AuthenticationResponse authenticate(AuthenticationRequest request) {
		authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getEmail(),request.getPassword()));
		var user = repository.findByEmail(request.getEmail()).orElseThrow();
		var jwtToken = jwtService.generateToken(user);
		return AuthenticationResponse.builder().token(jwtToken).build();
	}
	
    public Optional<User> findByEmail(String email) {
        return repository.findByEmail(email);
    }
    
    public ValidationResponse validate(String token) {
//		authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getEmail(),request.getPassword()));
//		var user = repository.findByEmail(request.getEmail()).orElseThrow();
//		var jwtToken = jwtService.generateToken(user);
    	String username = jwtService.extractUsername(token);
//        User user = userService.findByUsername(username);
        return ValidationResponse.builder().username(username).build();
//		return AuthenticationResponse.builder().token(request.getToken()).build();
	}


	
}
