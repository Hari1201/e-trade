package com.techprimers.springboot.swaggerexample.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

@EnableSwagger2
@Configuration
public class SwaggerConfig {


    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.techprimers.springboot.swaggerexample"))
                .paths(regex("/eeo.*"))
                .build()
                .apiInfo(metaInfo());
    }

    private ApiInfo metaInfo() {

        ApiInfo apiInfo = new ApiInfo(
                "E - Trade Swagger",
                "Release TAX Import - Asynch",
                "v_11",
                "Documention",
                new Contact("E Trade", "https://www.xyz.com/eTrade",
                        "sample@gmail.com"),
                "Teast Version 2.0",
                "https://www.test.org/test.html"
        );

        return apiInfo;
    }
}
