package com.msa.service3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.msa.service3.dao.Service1Dao;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class Service1Controller {

	@Autowired
	Service1Dao dao;

	@RequestMapping(path = "/regist.do", method = RequestMethod.GET)
	public void test() {
		System.out.println(dao.test());
	}

}
