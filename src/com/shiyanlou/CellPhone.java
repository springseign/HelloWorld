package com.shiyanlou;

public class CellPhone extends TelePhone{

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("�ҿ��Դ�绰��");
	}

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("�ҿ��Է����ţ�");
	}
	
	public static void main(String[] args) {
		CellPhone cp = new CellPhone();
		cp.call();
		cp.message();
	}
}
