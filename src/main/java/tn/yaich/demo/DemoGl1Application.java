package tn.yaich.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/api/docker")
public class DemoGl1Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoGl1Application.class, args);
	}
	
	
	@GetMapping
	public String getMessage() {
		return "Hello Jenkins";
	}

}
