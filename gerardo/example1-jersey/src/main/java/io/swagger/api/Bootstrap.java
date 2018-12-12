package io.swagger.api;

import javax.servlet.http.HttpServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@OpenAPIDefinition(
    info = @Info(
        title = "Swagger Server", 
        version = "1", 
        description = "Some Talks are coming.",
        termsOfService = "http://www.google.com",
        contact = @Contact(email = "rafael.lopez@pyxisportal.co"),
        license = @License(
            name = "License of API",
            url = "http://www.google.com/"
        )
    )
)
public class Bootstrap {
}
