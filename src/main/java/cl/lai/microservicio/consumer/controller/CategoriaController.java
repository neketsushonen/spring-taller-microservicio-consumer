package cl.lai.microservicio.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import cl.lai.microservicio.consumer.config.TallerSpringRobbinCategoriaConfiguracion;

@RestController
@RibbonClient(name = "SERVICE-CATEGORIA-BANCO",configuration=TallerSpringRobbinCategoriaConfiguracion.class )
public class CategoriaController {
	
	 @Bean
	 @LoadBalanced
	 RestTemplate restTemplate() {
		 return new RestTemplate();
	 }
	 
	 @Autowired
	 private RestTemplate restTemplate;

	@RequestMapping(value = "/categoria", method = RequestMethod.GET)
	public String getCategoria() {
		return restTemplate.getForEntity("http://SERVICE-CATEGORIA-BANCO/categoria", String.class).getBody();
	}
}
