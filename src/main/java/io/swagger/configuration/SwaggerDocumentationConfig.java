package io.swagger.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-08-15T10:06:57.629Z[GMT]")
@Configuration
public class SwaggerDocumentationConfig {

    @Bean
    public Docket customImplementation(){
        return new Docket(DocumentationType.OAS_30)
                .select()
                    .apis(RequestHandlerSelectors.basePackage("io.swagger.api"))
                    .build()
                .directModelSubstitute(org.threeten.bp.LocalDate.class, java.sql.Date.class)
                .directModelSubstitute(org.threeten.bp.OffsetDateTime.class, java.util.Date.class)
                .apiInfo(apiInfo());
    }

    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("API Service Activation and Configuration")
            .description("## TMF API Reference: TMF640 - Service Activation and Configuration   Version 4.0   Service Activation and Configuration API goal is to provide the ability to activate and configure Service. This API features Monitor pattern allowing to manage service configuration/activation asynchronous request (server side will provide monitor as POST/PATCH response)   ### TMF640 performs the following Operations on service resource : - Retrieve a service or a collection of services depending on filter criteria - Partial update of an service - Create a service (including default values and creation rules) - Delete a service (for administration purposes) - Manage notification of events  ### Monitor Resource  Monitor resource is used to track and log activation and/or configuration request  ### TMF640 provides following operation on Monitor resource:  - Retrieval of a monitor or a collection of monitor  Copyright © TM Forum 2019; All Rights Reserved")
            .license("")
            .licenseUrl("http://unlicense.org")
            .termsOfServiceUrl("")
            .version("4.0.0")
            .contact(new Contact("","", ""))
            .build();
    }

    @Bean
    public OpenAPI openApi() {
        return new OpenAPI()
            .info(new Info()
                .title("API Service Activation and Configuration")
                .description("## TMF API Reference: TMF640 - Service Activation and Configuration   Version 4.0   Service Activation and Configuration API goal is to provide the ability to activate and configure Service. This API features Monitor pattern allowing to manage service configuration/activation asynchronous request (server side will provide monitor as POST/PATCH response)   ### TMF640 performs the following Operations on service resource : - Retrieve a service or a collection of services depending on filter criteria - Partial update of an service - Create a service (including default values and creation rules) - Delete a service (for administration purposes) - Manage notification of events  ### Monitor Resource  Monitor resource is used to track and log activation and/or configuration request  ### TMF640 provides following operation on Monitor resource:  - Retrieval of a monitor or a collection of monitor  Copyright © TM Forum 2019; All Rights Reserved")
                .termsOfService("")
                .version("4.0.0")
                .license(new License()
                    .name("")
                    .url("http://unlicense.org"))
                .contact(new io.swagger.v3.oas.models.info.Contact()
                    .email("")));
    }

}
