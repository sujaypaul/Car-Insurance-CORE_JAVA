package com.nagarro.training;

import java.util.*;
import com.nagarro.training.model.*;
import com.nagarro.training.constants.*;

public class CarInsurance {
	public static void main(String[] args) {
		
		double price=0d;
		String type;
		String insuranceType;
		String newInput="y";
		
		Scanner sc= new Scanner(System.in);
		Car myCar = new Car();
			
		do {
			//user inputs
			
			//model input
			while(true) {
				System.out.print("Model :");
				String model = sc.nextLine();
				myCar.setModel(model);
				if(!myCar.getModel().isEmpty())
					break;
				System.out.println("Please enter a value");
			}
			
			//Car Type input
			while(true){
				System.out.print("Type :");
				type = sc.nextLine();
				myCar.setCarType(type);
				
				if(Utils.checkCarType(type))
					break;
				else
					System.out.println("Please Enter Car type: Hatchback, Sedan or SUV");
			}
			
			//Car Price input
			int flag=1;
			while(flag==1) {
				try {
					System.out.print("Price :");
					price = sc.nextDouble();
					sc.nextLine();
					myCar.setPrice(price);
					
					flag=0;
				}
				catch(InputMismatchException exception) {
					System.out.println("Please input a number value");
					flag=1;
				}
			}
			
			//Car Insurance input
			while(true) {
				System.out.print("Insurance type :");
				insuranceType = sc.nextLine();
				myCar.setInsuranceType(insuranceType);
				
				if(Utils.checkInsuranceType(insuranceType))
					break;
				else
					System.out.println("Please Enter Insurance type: Basic or Premium");
			}
			
			
			//Output to console
			System.out.println();
			System.out.println("Your Input -----------------");
			System.out.println();
			System.out.println("Model : "+myCar.getModel());
			System.out.println("Price : Rs"+myCar.getPrice());
			System.out.println("Total insurance : Rs"+myCar.insurance());
			System.out.println();

				
			System.out.println("Do you want to enter details of any other car (y/n):");
			newInput = sc.nextLine();
		}
		while(newInput.equals("y"));
		System.out.println("Exited");
		sc.close();
	}
}