package org.erpmicroservices.peopleandorganizations.api.rest;

import org.springframework.boot.web.client.RestTemplateCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.hateoas.config.HypermediaRestTemplateConfigurer;
import org.springframework.hateoas.config.HypermediaWebClientConfigurer;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class CucumberSpringConfiguration {

	@Bean
	RestTemplateCustomizer restTemplateCustomizer(
			HypermediaRestTemplateConfigurer configurer) {
		return restTemplate -> {
			configurer.registerHypermediaTypes(restTemplate);
		};
	}
}
