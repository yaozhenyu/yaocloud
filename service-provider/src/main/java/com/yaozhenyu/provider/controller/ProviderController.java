package com.yaozhenyu.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("service1")
public class ProviderController {

	@RequestMapping("hello")
	public String hello() {
		return "hello service provider!";
	}
}
