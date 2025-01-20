package com.zenxdu.notificacao.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigBeans {

    @Bean
    public String remetente() {
        return "";
    }

    @Bean
    public String nomeRemetente() {
        return "Javanauta";
    }
}
