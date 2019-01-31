package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;

@RestController
public class TestControllerBalanced {

	@Autowired
	private RestTemplate restTemplate ;

	

	@RequestMapping("/test")
	public String getSignUp() {
		
		//InstanceInfo server = eurekaClient.getNextServerFromEureka("signup", false);
		//String homePageURL = server.getHomePageUrl();
		//System.out.println("the url is " + homePageURL);
		ResponseEntity<String> response = restTemplate.getForEntity("http://signup",
				String.class);
//		 restTemplate.exchange(homePageURL + "signup/test", HttpMethod.GET, null,
//					String.class);

		return response.getBody()  ;
	}

}
