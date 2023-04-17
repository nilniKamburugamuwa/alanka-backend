package com.cs304.alanka.auth;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cs304.alanka.config.JwtService;
import com.cs304.alanka.model.User;
import com.cs304.alanka.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
@CrossOrigin(origins="*")
public class AuthenticationController {
	
	private final AuthenticationService service;

//	JwtService jwtUtil;
//	private final JwtService jwtService;
	
	@PostMapping("/register")
	public ResponseEntity<AuthenticationResponse> register(@RequestBody RegisterRequest request) {
		return ResponseEntity.ok(service.register(request));
	}
	
	@PostMapping("/authenticate")
	public ResponseEntity<AuthenticationResponse> authenticate(@RequestBody AuthenticationRequest request) {
		System.out.println("nilni");
		return ResponseEntity.ok(service.authenticate(request));
	}

	
    @GetMapping("/user")
    public ResponseEntity<ValidationResponse> validate(@RequestHeader("Authorization") String tokenHeader) {
    	
    	String token = tokenHeader.substring(7);
    	System.out.println(token);
        return ResponseEntity.ok(service.validate(token));
       
    }

}
