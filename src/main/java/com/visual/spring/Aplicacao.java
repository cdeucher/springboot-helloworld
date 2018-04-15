/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.visual.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
public class Aplicacao extends SpringBootServletInitializer {
    public static void main (String[] args) throws Exception{
        SpringApplication.run(Aplicacao.class, args);
    } 
    
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Aplicacao.class);
    }
}
