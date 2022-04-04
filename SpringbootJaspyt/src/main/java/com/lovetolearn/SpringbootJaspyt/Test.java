package com.lovetolearn.SpringbootJaspyt;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;

public class Test {


@Value("${password}")
private  String defaultName;

@PostConstruct
public void intialize() {
	System.out.println(defaultName+"************");

}
}
