package automobile.hmwll.cars.entities;

import org.springframework.stereotype.Component;

@Component
public class Dodge implements CarBrand{
	
	private String name = "Dodge Sport"; 
	
	public String getName() {
		return name;
	}
	                      
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Dodge [name=" + name + ", getName()=" + getName() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
