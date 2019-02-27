package com.yaozhenyu.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "service-provider")
@Service("providerService")
public interface ProviderService {

	@RequestMapping(value = "/service1/hello")
	public String hello();
}
