package com.example.springboot;
import java.sql.Timestamp;    
import java.util.Date;    
import java.text.SimpleDateFormat;  

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		Date date = new Date();  
		Timestamp ts=new Timestamp(date.getTime());  
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return formatter.format(ts) + ": Greetings from Spring Boot!";
	}

}
