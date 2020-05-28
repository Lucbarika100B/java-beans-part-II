package automobile.hmwll.cars.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import automobile.hmwll.cars.entities.CarBrand;
import automobile.hmwll.cars.entities.Mazda;
import automobile.hmwll.cars.entities.MazdaCar;

@Configuration
@ComponentScan(basePackages="automobile.hmwll.cars.entities.*")
public class ClassConfig {
	
	
	@Autowired
	@Qualifier("ChevySport")
	public CarBrand malibu;
	
	@Autowired
	@Qualifier("DodgeSport")
	public CarBrand durango;
	
	
	@Autowired 
	@Qualifier("MazdaSport")
	public CarBrand mazdaCX5;
	

	@Bean
	public MazdaCar mazda1(){
		MazdaCar mazda = new MazdaCar("SUV", 29.95, mazdaCX5);
		return mazda;	
	}
	
	@Bean
	public MazdaCar mazda2(){
		MazdaCar mazda = new MazdaCar("HashBack", 30.95, durango);
		return mazda;
	}
	
	@Bean
	public MazdaCar mazda3(){
		MazdaCar mazda = new MazdaCar("rooftop", 31.95, malibu);
		return mazda;
	}
	

}
