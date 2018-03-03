package edu.chapter01.accessmodifier.privateexample;

public class Test {
	public static void main(String parameter[]) {
		Cloo cloo = new Cloo();
		cloo.doClooThing();
		cloo.doRooThings();
		//cloo.doMoreRooThings(); it's private
	}
}
