package com.q2;

import java.util.Scanner;

class Student {
	
	private int roll;
	private int marks;
	private String name;
	private String address;
	
	
	Student() {
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	

	
}


public class Demo{
	
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter number of student:");
		int n=s.nextInt();
		
		Student[] arr= new Student[n];
		int sum=0;
		for(int i=0; i<n;i++) {
			s.nextLine();
			System.out.println("Enter Address:");
			String add=s.nextLine();
			
			System.out.println("Enter roll:");
			int roll1=s.nextInt();
			System.out.println("Enter marks:");
			int marks1=s.nextInt();
			s.nextLine();
			System.out.println("Enter name:");
			String name1=s.next();
			
			Student ss= new Student();
			ss.setAddress(add);
			ss.setMarks(marks1);
			ss.setName(name1);
			ss.setRoll(roll1);
			arr[i]=ss;
			System.out.println("Name--"+ss.getName());
			System.out.println("roll number--"+ss.getRoll());
			System.out.println("marks--"+ss.getMarks());
			System.out.println("address--"+ss.getAddress());
			sum+=ss.getMarks();
			
		}
		
		int av= sum/n;
		System.out.println("average---"+av);
		
	}
}
