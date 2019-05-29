package com.prodapt.restsample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope

public class HelloController {
	private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

	@Value("${greet.message}")
	private String greetMsg;

	@GetMapping
	public String doTest() {
		LOGGER.warn("This is warning log !!");
		LOGGER.warn("The property value is: " + greetMsg);
		
		return greetMsg;
	}
}
