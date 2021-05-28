package com.example.ws_back.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class GlobalConfig implements WebMvcConfigurer {

  @Override
  public void addCorsMappings(CorsRegistry registry) {
    registry.addMapping("/**");
  }

  // @Bean
  // public CorsConfigurationSource corsConfigurationSource() {
  //   final CorsConfiguration configuration = new CorsConfiguration();
  //   configuration.setAllowedOrigins(List.of("*"));
  //   configuration.setAllowedMethods(List.of("GET", "POST", "PUT", "DELETE", "PATCH"));
  //   // configuration.setAllowCredentials(true);
  //   configuration.setAllowedHeaders(List.of("Authorization", "Cache-Control", "Content-Type"));

  //   final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
  //   source.registerCorsConfiguration("/**", configuration);
  //   return source;
  // }

}