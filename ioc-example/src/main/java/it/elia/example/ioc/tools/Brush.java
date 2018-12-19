package it.elia.example.ioc.tools;

import it.elia.example.ioc.color.Color;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class Brush {

    private Color color;

    public String paint() {
        return "paint with " + Optional.ofNullable(color).map(Color::getColor).orElse("empty");
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
