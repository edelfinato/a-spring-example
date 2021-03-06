package it.elia.example.ioc.lifecircle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean, DisposableBean {
	
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
	public String toString(){
		return "id "+ id + " and position " + position;
	}

	public void destroy() throws Exception {
		System.out.println("I am in destroy... ");
		
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("I am in afterPropertiesSet... ");
		
	}
}