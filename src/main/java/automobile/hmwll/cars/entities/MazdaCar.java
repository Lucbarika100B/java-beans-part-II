package automobile.hmwll.cars.entities;

import org.springframework.beans.factory.annotation.Autowired;

public class MazdaCar {
	
	String model; 
	CarBrand brand; 
	Double price; 
	
	public MazdaCar(String model, Double price, CarBrand carBrand) {
	        this.model = model;
	        this.price = price;
	        this.brand = brand;
	}
	


	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
		
	} 
	
	
	public CarBrand getBrand() {
		return brand; 
	}
	
	public void setBrand(CarBrand brand) {
		this.brand = brand;
	} 
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
		
	}

	@Override
	public String toString() {
		return "MazdaCar [model=" + model + ", brand=" + brand + ", price=" + price + ", getModel()=" + getModel()
				+ ", getBrand()=" + getBrand() + ", getPrice()=" + getPrice() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	

}
