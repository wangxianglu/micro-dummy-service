package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@SpringBootApplication
public class MicroDummyServiceApplication{

	public static void main(String[] args) {
		SpringApplication.run(MicroDummyServiceApplication.class, args);
	}

	@Configuration
	@EnableResourceServer
	protected static class ResourceConfig extends ResourceServerConfigurerAdapter{
		@Override
		public void configure(HttpSecurity http) throws Exception {
			http
					.authorizeRequests()
					.antMatchers("/admin").access("ROLE_admin")
					.antMatchers("/person/**").access("#oauth2.clientHasRole('user')");
		}
		}

}
