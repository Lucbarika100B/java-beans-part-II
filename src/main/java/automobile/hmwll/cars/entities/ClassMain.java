	package automobile.hmwll.cars.entities;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import automobile.hmwll.cars.config.ClassConfig;

public class ClassMain { 
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ClassConfig.class);
		
		MazdaCar mazda1 = context.getBean("mazda1", MazdaCar.class);
		MazdaCar mazda2 = context.getBean("mazda2", MazdaCar.class);
		MazdaCar mazda3 = context.getBean("mazda3", MazdaCar.class);
		
		
		System.out.println(mazda1); 
		System.out.println(mazda2);
		System.out.println(mazda3);
		
	}

}
