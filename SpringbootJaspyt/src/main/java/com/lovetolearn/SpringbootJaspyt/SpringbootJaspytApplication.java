package com.lovetolearn.SpringbootJaspyt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@SpringBootApplication
@EnableEncryptableProperties
public class SpringbootJaspytApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJaspytApplication.class, args);
	}

}
