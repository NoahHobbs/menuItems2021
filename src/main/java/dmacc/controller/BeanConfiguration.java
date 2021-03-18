package dmacc.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

import dmacc.beans.Menu;

@Configuration
public class BeanConfiguration {
	@Bean
	public Menu menu() {
		Menu bean = new Menu();
		bean.setItemName("Spaghetti");
		bean.setCalories(150);
		bean.setPrice(9.99);
		return bean;
	}
}
