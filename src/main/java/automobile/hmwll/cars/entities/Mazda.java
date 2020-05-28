package automobile.hmwll.cars.entities;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Mazda implements CarBrand {
	
	private String name = "Mazda Sport"; 
	
	public String getName() {
		
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Mazda [name=" + name + ", getName()=" + getName() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	

}
