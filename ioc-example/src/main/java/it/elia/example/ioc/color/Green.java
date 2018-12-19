package it.elia.example.ioc.color;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Green implements Color {
    @Autowired
    Color yellow;
    @Autowired
    @Qualifier("blue")
    Color colorBlue;

    @Override
    public String getColor() {
        return "Green is " + yellow.getColor() + " + " + colorBlue.getColor();
    }
}
