package com.nagarro.training.constants;


public class Utils extends Constants {
	public static boolean checkCarType(String type) {

		for(Constants.CAR_TYPE t : Constants.CAR_TYPE.values()) {
			
			if(t.name().equalsIgnoreCase(type))
				return true;
		}
		return false;
	}
	
	public static boolean checkInsuranceType(String type) {

		for(Constants.INSURANCE_TYPE t : Constants.INSURANCE_TYPE.values()) {
			
			if(t.name().equalsIgnoreCase(type))
				return true;
		}
		return false;
	}

}