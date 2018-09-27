package br.com.fontana.loja.funcionario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Date;

@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackages = "br.com.fontana.loja")
public class LojaFuncionarioApplication {

    public static void main(String[] args){
        SpringApplication.run(LojaFuncionarioApplication.class, args);
    }

    @Bean
    public Docket mainConfig() {
        return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any()).build().pathMapping("/")
                .directModelSubstitute(Date.class, String.class)
                .useDefaultResponseMessages(false)
                .genericModelSubstitutes(ResponseEntity.class);
    }
}
