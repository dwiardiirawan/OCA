package edu.chapter01.accessmodifier;

public class Convertible extends SportsCar {

	void doThings() {
		SportsCar sc = new SportsCar();
		sc.goFast(); // (R)
	}
	
	void doMore() {
		goFast();  // (I)
		doStuff(); // (I)
	}
}
