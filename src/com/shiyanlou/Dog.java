package com.shiyanlou;

public class Dog extends Animal {
	//重写父类的bark方法
	/*public void bark() {
		System.out.println("汪！汪！汪！");
	}
	public Dog() {
		System.out.println("子类的构造方法被调用");
	}*/
	public void main(String[] args) {
		super.bark();
	}
}
