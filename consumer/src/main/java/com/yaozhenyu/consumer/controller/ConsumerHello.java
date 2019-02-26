package com.yaozhenyu.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yaozhenyu.consumer.service.ProviderService;

@RestController
@RequestMapping("consumer")
public class ConsumerHello {

	@Autowired
	private ProviderService providerService;

	@RequestMapping("/say")
	public String say() {
		System.out.println("================say ConsumerHello ===============");
		return "ConsumerHello.say";
	}
	
	@RequestMapping("/hello")
	public String consumerHello() {
		System.out.println("================" + providerService + "===============");
		return providerService.hello();
	}
}
