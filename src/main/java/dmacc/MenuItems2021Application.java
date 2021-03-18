package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Menu;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.MenuRepository;

@SpringBootApplication
public class MenuItems2021Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(MenuItems2021Application.class, args);
	}
	
	@Autowired
	MenuRepository repo;
	
	@Override 
	public void run(String... args) throws Exception {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		Menu m = appContext.getBean("menu", Menu.class);
		m.setItemName("Alfredo");
		repo.save(m);
		Menu d = new Menu("Cheeseburger", 850, 10.99);
		repo.save(d);
		List<Menu> allMyItems = repo.findAll();
		for(Menu item: allMyItems) {
			System.out.println(item.toString());
		}
		((AbstractApplicationContext) appContext).close();
	}
}
