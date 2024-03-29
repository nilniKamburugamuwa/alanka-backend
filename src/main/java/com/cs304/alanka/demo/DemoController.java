package com.cs304.alanka.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/api/demo-controller")
public class DemoController {

	@GetMapping
	public ResponseEntity<String> sayHello(){
		return ResponseEntity.ok("Hello from secured endpoint"); 
	}
}
