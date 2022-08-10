package com.nagarro.training.model;

public class Car extends Type {
	private String model;
	private double price;
	private String insuranceType;
	
	public Car() {}
	
	//getter and setter for model
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	//getter and setter for price
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	//getter and setter for insurance type
	public String getInsuranceType() {
		return insuranceType;
	}
	public void setInsuranceType(String insuranceType) {
		this.insuranceType = insuranceType.toLowerCase();
	}
	
	
	
	
	
	//calculate insurance of the car depending on insurance type
	public double insurance() {
		if(insuranceType.equals("premium"))
			return Math.round( (interest()*price)+(0.2f*interest()*price) );
		else
			return Math.round(interest()*price);
	}
	
}
