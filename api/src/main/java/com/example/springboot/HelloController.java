package com.example.springboot;
import java.sql.Timestamp;    
import java.util.Date;    
import java.text.SimpleDateFormat;  
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class HelloController {

	@Value("${foo}")
	String foo;

	@GetMapping("/")
	public String index() {
		Date date = new Date();  
		Timestamp ts=new Timestamp(date.getTime());
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String logMessage = String.format("%s: Greetings from Spring Boot!", formatter.format(ts));
		System.out.println(logMessage);
		System.out.println(String.format("foo is %s", foo));
		return  logMessage;
	}

}
