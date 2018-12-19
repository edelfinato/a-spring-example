package it.elia.example.ioc;

import it.elia.example.ioc.color.Color;
import it.elia.example.ioc.color.ColorConfiguration;
import it.elia.example.ioc.color.Green;
import it.elia.example.ioc.tools.Brush;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        brush_sigleton();
    }


    public static void work() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(ColorConfiguration.class);
        context.refresh();
        Color red = (Color) context.getBean("red");
        System.out.println(red.getColor());
    }

    public static void component_scan() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("it.elia.example.ioc.color");
        context.refresh();
        Color red = (Color) context.getBean("red");
        System.out.println(red.getColor());
        Color green = (Color) context.getBean("green");
        System.out.println(green.getColor());
    }

    public static void green_is_green() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("it.elia.example.ioc.color");
        context.refresh();
        Color green = (Color) context.getBean("green");
        Color greenClass = context.getBean(Green.class);
        System.out.println(green.equals(greenClass));
        System.out.println("green: " + green.toString() + " greenClass: " + green.toString());
    }

    public static void brush_sigleton() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("it.elia.example.ioc.color");
        context.register(Brush.class);
        context.refresh();
        Brush brush = context.getBean(Brush.class);
        System.out.println(brush.paint());
        brush.setColor((Color) context.getBean("red"));
        System.out.println(brush.paint());
        Brush brush2 = context.getBean(Brush.class);
        System.out.println(brush2.paint());
    }

}
