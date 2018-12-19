package it.elia.example.ioc.tools;

import it.elia.example.ioc.color.Color;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BrushPrototype {

    private Color color;

    public String paint() {
        return "paint with " + Optional.ofNullable(color).map(Color::getColor).orElse("empty");
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
