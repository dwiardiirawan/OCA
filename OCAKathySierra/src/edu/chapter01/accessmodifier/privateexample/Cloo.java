package edu.chapter01.accessmodifier.privateexample;

public class Cloo extends Roo {
	public void doClooThing() {
		doRooThings();
		
	}
	
	private void doMoreRooThings() {
		System.out.println("It's private cloo");
	}
	
	public static void main(String parameter[]) {
		Cloo cloo = new Cloo();
		cloo.doClooThing();
		cloo.doRooThings();
		cloo.doMoreRooThings(); //because it's accessed in the same class
	}
}
