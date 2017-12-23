package com.designpattern;

public class HumanFactory {
/*	//普通工厂类
     public Human createHuman(String gender) {
		if (gender.equals("male")) {
			return new Male();
		}else if (gender.equals("female")) {
			return new Female();
		}else {
			System.out.println("请输入正确的类型");
			return null;
		}
	}*/
	
	//多个工厂方法
	public Male creatMale() {
		return new Male();
	}
	public Female creatFemale() {
		return new Female();
	}
}
