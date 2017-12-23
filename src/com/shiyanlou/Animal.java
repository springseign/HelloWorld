package com.shiyanlou;

public class Animal {
	public int legNum = 4; //动物四肢的数量
	
	//类方法
	public void bark() {
		System.out.println("动物叫");
	}
	public Animal() {
		System.out.println("动物有" + legNum + "条腿");
		System.out.println("父类的构造方法被调用");
	}
}
