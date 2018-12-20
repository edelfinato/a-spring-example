package it.elia.example.ioc.lifecircle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee2 {

    private Long id;

    private String position;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "id " + id + " and position " + position;
    }

    @PreDestroy
    public void destroy() throws Exception {
        System.out.println("I am in destroy... ");

    }

    @PostConstruct
    public void init() throws Exception {
        System.out.println("I am in afterPropertiesSet... ");

    }
}