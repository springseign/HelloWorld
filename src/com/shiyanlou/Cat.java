package com.shiyanlou;

public class Cat implements Zoo{
	public void eat() {
		System.out.println("Cat eats");
	}
	public void travel() {
		System.out.println("Cat travels");
	}
	public static void main(String[] args) {
		Cat miao = new Cat();
		miao.eat();
		miao.travel();
	}
}
