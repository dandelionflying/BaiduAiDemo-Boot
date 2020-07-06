package cn.running4light.test.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	private final static Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@GetMapping(value = "/test")
	public String test() {
		logger.info("test log");
		return "success";
	}
}
