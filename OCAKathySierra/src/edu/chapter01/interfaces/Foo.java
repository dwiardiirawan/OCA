package edu.chapter01.interfaces;


public abstract interface Foo {
	int BAR = 42;
	static final int a = 1;
	final static int b = 2;
	public static int c = 3;
	
	void go();
}

class Zap implements Foo{
	
	@Override
	public void go() {
		//BAR = 10; error, can't change the value
		
	}
	
	public void come() {
		//BAR = 11;
	}
	
}
