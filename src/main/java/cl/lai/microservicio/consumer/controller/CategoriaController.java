package cl.lai.microservicio.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CategoriaController {
	 @Bean
	 RestTemplate restTemplate() {
		 return new RestTemplate();
	 }
	 
	 @Autowired
	 private RestTemplate restTemplate;

	@RequestMapping(value = "/categoria", method = RequestMethod.GET)
	public String hello() {
		return restTemplate.getForEntity("http://SERVICE-CATEGORIA-BANCO/categoria/list.htm", String.class).getBody();
	}
}
