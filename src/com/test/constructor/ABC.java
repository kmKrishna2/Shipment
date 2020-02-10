package com.test.constructor;

public class ABC {
	String name;
	ABC(String n){name=n;}
	public static void main(String[] args) {
		A a = new B();
		B b = new B();
		System.out.println(a.c+" "+a.getValue()+" "+b.getValue()+" "+b.getSuperValue());
		
		ABC m1=new ABC("HELLO");
		ABC m2=new ABC("WORLD");
		System.out.println(m1.equals(m2));
	}
	@Override
	public boolean equals(Object o) {
		ABC m = (ABC)o;
		if(m.name!=null) {
			return true;
		}
		return false;		
	}
}
class A{
	protected char c='A';
	char getValue() {
		return c;
	}
}
class B extends A{
	protected char c='B';
	char getValue() {
		return c;
	}
	char getSuperValue() {
		return super.c;
	}
}
