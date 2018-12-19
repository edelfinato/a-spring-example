package it.elia.example.ioc.color;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ColorConfiguration {

    @Bean("red")
    Color red(){
        return () -> "red";
    }

    @Bean("blue")
    Color blue(){
        return () -> "blue";
    }

    @Bean("yellow")
    Color yellow(){
        return () -> "yellow";
    }

}
