package com.arquiteturaspring.arquiteturaspring;

import com.arquiteturaspring.arquiteturaspring.todos.MailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class ConfiguracaoAcessoEmail {

    @Autowired
    private AppProperties properties;

    @Bean
    public MailSender mainSender() {
        return null;
    }

}
