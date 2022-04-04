package com.lovetolearn.SpringbootJaspyt;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Value("${spring.datasource.username}")
	private  String nums1;
	
	@PostConstruct
	public void  getData() {

		System.out.println(nums1);
		
	}
}
