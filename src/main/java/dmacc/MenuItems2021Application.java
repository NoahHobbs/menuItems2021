package dmacc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dmacc.beans.Menu;
import dmacc.controller.BeanConfiguration;

@SpringBootApplication
public class MenuItems2021Application {

	public static void main(String[] args) {
		SpringApplication.run(MenuItems2021Application.class, args);
	
	
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
	
		Menu m = appContext.getBean("menu", Menu.class);
	
		System.out.println(m.toString());
	}
}
