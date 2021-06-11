package com.ecs.deployment.aws;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ecs")
public class EcsDevelopment {

	 @GetMapping("/deployment")
	 public ResponseEntity<?> deployInEcs() { 
		 
		 return ResponseEntity.ok("successfully deployed in ECS");
	 }
}
