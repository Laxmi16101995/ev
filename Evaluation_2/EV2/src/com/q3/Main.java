package com.q3;

import java.util.Scanner;
//==============================Car Class===================

class Car{
	
	private int numberOfPassenger;
	private int numberOfKms;
	
	public int getNumberOfPassenger() {
		return numberOfPassenger;
	}
	public void setNumberOfPassenger(int numberOfPassenger) {
		this.numberOfPassenger = numberOfPassenger;
	}
	public int getNumberOfKms() {
		return numberOfKms;
	}
	public void setNumberOfKms(int numberOfKms) {
		this.numberOfKms = numberOfKms;
	}
	
	
}

//==============================Sedan Class===================

class Sedan extends Car{
	
	final int farePerKm =20;
	
}
//==============================HatchBack Class===================

class HatchBack extends Car{
	
	final int farePerKm =15;
	int a;
	HatchBack(){
		this.a=super.getNumberOfKms();
	}
}

//==============================OLA Class===================

class OLA{
	
	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
		
		if(numberOfPassenger<=3) {
			return new HatchBack();
		}
		
		return new Sedan();
	}
	
	public void calculateBill(Car car) {
		
		
		HatchBack h= (HatchBack)car;
		Car ccCar= (Car)h;
		System.out.println(ccCar.getNumberOfKms()+"dfdfff");
		
		System.out.println(h.farePerKm);
//		
//		int total=h.getNumberOfKms()* h.farePerKm;
//		System.out.println(total);
		//return total;
		//Total fare=numberOfKms*farePerKm
	}
}

//==============================Main Class===================
public class Main {

	public static void main(String[] args) {

		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter number of passengers:");
		int n=s.nextInt();
		
		System.out.println("Enter number of kms:");
		int km=s.nextInt();
		
		Car car= new Car();
		car.setNumberOfKms(km);
		car.setNumberOfPassenger(n);
		
		OLA ola= new OLA();
		//ola.bookCar(n, km);
		Car c=ola.bookCar(n, km);
		ola.calculateBill(c);
		//int ans= ola.calculateBill(c);
		//System.out.println("The total fare amount is "+ ans);
	}

}
