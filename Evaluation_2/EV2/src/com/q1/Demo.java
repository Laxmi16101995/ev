package com.q1;

/*
IS A relationship
 				when class extends other class this represent IS A relationship
 				For example
 				Main class has been extended by Main2 so there is a relation of Parent and child.
 				parent is Main class 
 				child is Main2 class.
 				
 				
HAS A relationship
				when we create object of any class in any another class at that time we can say that 
				both classes HAS A relationship
				for example
				As in Demo class we have created object of Main class bt taking reference veriable
				by this we cam access all veriable, methods from Main class. this is called they has 
				HAS A relationship.
				
				
access modifiers

				there are 4 access modifier
				1) public--accessible from everywhere
				2) private--accessible  only from same class.
				3) default-- accessible only whithin the same package
				4) protected--accessible only from child class.
				
				
*/

class Main{
	
}
class Main2 extends Main{
	
}

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main obj= new Main();

	}

}
