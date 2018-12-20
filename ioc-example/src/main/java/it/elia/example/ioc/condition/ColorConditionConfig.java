package it.elia.example.ioc.condition;

import it.elia.example.ioc.color.Color;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ColorConditionConfig {

    @Conditional(ColorCondition.class)
    @Bean
    Color yellow() {
        return () -> "yellow";
    }

    @Conditional(ColorCondition2.class)
    @Bean
    Color yellow2() {
        return () -> "yellow2";
    }
}
