package com.msa.service3.service;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*") 
public class Service1Service {
	
	@RequestMapping(path = "service1.do", method= RequestMethod.GET)
	public void test() {
		System.out.println("here");
	}

}
