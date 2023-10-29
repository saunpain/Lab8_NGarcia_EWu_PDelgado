package com.example.lab8_ngarcia_ewu_pdeglado.Services;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class Config implements WebMvcConfigurer {
  @Override
  public void addCorsMappings(CorsRegistry cors){
    cors.addMapping("/**").allowedMethods(
      "*"
    );
  }
}
