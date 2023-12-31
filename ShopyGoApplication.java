package com.ECommerce.ShopyGo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;



@SpringBootApplication
public class ShopyGoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopyGoApplication.class, args);
	}

	public Docket apis(){
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("com.ECommerce")).build();
	}

}
