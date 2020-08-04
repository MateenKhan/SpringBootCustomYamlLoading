package com.example.restservice;

import com.example.restservice.util.ErrorConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

	@Autowired
	ErrorConfig errorConfig;

	@GetMapping("/asdf")
	public Object asdf(){
		return errorConfig.getMessages();
//		return errorConfig.getErrors();
//		return properties.getAppliedPropertySources().get("").getProperty("");
	}


}
