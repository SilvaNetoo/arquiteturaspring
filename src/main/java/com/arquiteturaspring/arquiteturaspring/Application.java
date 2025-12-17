package com.arquiteturaspring.arquiteturaspring;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
@EnableConfigurationProperties
public class Application {

	public static void main(String[] args) {

//        SpringApplication.run(Application.class, args);
        SpringApplicationBuilder builder = new SpringApplicationBuilder(Application.class);
        builder.run(args);
        builder.bannerMode(Banner.Mode.OFF);
        ConfigurableApplicationContext applicationContext = builder.context();
//        var produtoRepository = applicationContext.getBean("produtoRepository");
        builder.profiles("producao");
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        String applicationName = environment.getProperty("spring.application.name");
        System.out.printf("Nome da aplicação: " + applicationName);

        ExemploValue value = applicationContext.getBean(ExemploValue.class);
        value.imprimirVariavel();

        AppProperties properties = applicationContext.getBean(AppProperties.class);
        System.out.printf(properties.getValor1());

    }

}
