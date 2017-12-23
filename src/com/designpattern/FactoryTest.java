package com.designpattern;

public class FactoryTest {
	public static void main(String[] args) {
		HumanFactory factory = new HumanFactory();
		//Human male = factory.createHuman("male");
		Human male = factory.creatFemale();
		male.eat();
		male.sleep();
		male.beat();
	}

}
