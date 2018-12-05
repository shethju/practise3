package com.easy;

public class Generics<T> {
	
	private T t;
	Generics(T t1) {
		t = t1;
	}
	
	public T getT() {
		return t; 
	}
	
	public <T> void display() {
		System.out.println("t is " + T);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Generics<String> g = new Generics<String>("abc");
			System.out.println(g.getT());
			g.display();
	}

}
