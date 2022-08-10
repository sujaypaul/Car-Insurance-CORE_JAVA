package com.nagarro.training.model;

class Type {
	String carType;
	
	//setter and getter for car type
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType.toUpperCase();
	}
	
	//interest rates for specific car type
	public float interest() {
		switch(carType) {
			case "HATCHBACK":
				return 0.05f;
			case "SEDAN":
				return 0.08f;
			case "SUV":
				return 0.1f;
		}
		return -1.0f;
	}
}
