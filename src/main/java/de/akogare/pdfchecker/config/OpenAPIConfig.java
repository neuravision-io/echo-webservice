package de.akogare.pdfchecker.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {
    /*Environment Variable for decServer*/
    @Value("${openApiDevServerUrl}")
    private String openApiDevServerUrl;

    @Bean
    public OpenAPI customOpenAPI() {
        Server devServer = new Server();
        devServer.setDescription("Akogare Platform REST API");
        devServer.setUrl(openApiDevServerUrl);
        Contact contact = new Contact();
        contact.setEmail("info@abramov-samuel.de");
        contact.setName("Samuel Abramov");
        contact.setUrl("https://www.abramov-samuel.de");

        Info info = new Info();
        info.setTitle("Akogare Platform REST API");
        info.setVersion("1.0.0");
        info.setDescription("REST API for Akogare Platform");
        info.setContact(contact);

        return new OpenAPI()
                .info(info)
                .addServersItem(devServer);

    }
}
