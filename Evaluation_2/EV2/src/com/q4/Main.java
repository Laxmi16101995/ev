package com.q4;
//===========================Person=================

class Person {
	
	String name;
	String gender;
	Address add=new Address();
	

}
//===========================Address=================

class Address{
	String city="Chennai";
	String state="TN";
	String pinCode="60001";
	
	
}
//===========================Instructor=================

class Instructor extends Person{
	
	int instructorId=456;
	int salary=45612;
	
	public Instructor() {
		super();
		
	}
		public String toString() {
			return "Instructor [instructorId=" + instructorId + ", salary=" + salary + 
	"   Address  [ city: "+ super.add.city+" , state: "+super.add.state+ ",  pincode "+super.add.pinCode+"]" ;
		}
}
//===========================Student=================

class Student extends Person{
	int courseFee=300000;
	int studentId=1;
	String courseEnrolled="JA111";
	
	
	
	public Student() {
		super();
		
	}
		public String toString() {
			return "Student [courseFee=" + courseFee + ", studentId=" + studentId + ", courseEnrolled=" + courseEnrolled
					+  "]"+"   Address  [ city: "+ super.add.city+" , state: "+super.add.state+ ",  pincode "+super.add.pinCode +"]";
		}
	
	
	
	
}
//===========================Main=================

public class Main{
	
	public static Person generatePerson(Person Person) {
		
		return (Person)Person;
		//System.out.println(Person.toString());
		//return ()
		
	}
	public static void main(String[] args) {
		//generatePerson(new Student());
		Person newStudent =generatePerson(new Student());
		System.out.println(newStudent.toString());
		Person newTeacher =generatePerson(new Instructor());
		System.out.println(newTeacher.toString());
	}
}
