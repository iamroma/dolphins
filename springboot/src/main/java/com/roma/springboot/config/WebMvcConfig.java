package com.roma.springboot.config;

import com.roma.springboot.interceptor.AuthInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.handler.MappedInterceptor;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;

/**
 * Created by roma on 20/04/2017.
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    @Autowired
    private AuthInterceptor authInterceptor;

    @Bean(name = "authMappedInterceptor")
    public MappedInterceptor getAuthInterceptor() {
        MappedInterceptor interceptor = new MappedInterceptor(new String[]{"/**"}, authInterceptor);
        return interceptor;
    }

    @Bean
    public HandlerMapping getHandlerMapping(MappedInterceptor authInterceptor) {
        SimpleUrlHandlerMapping mapping = new SimpleUrlHandlerMapping();
        mapping.setInterceptors(new Object[]{authInterceptor});
        return mapping;
    }
}
