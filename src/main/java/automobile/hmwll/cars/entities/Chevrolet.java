package automobile.hmwll.cars.entities;
import org.springframework.stereotype.Component;

@Component
public class Chevrolet implements CarBrand {
	

	private String name = "Chevrolet Sport";
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Chevrolet [name=" + name + ", getName()=" + getName() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";

	}
	
}
