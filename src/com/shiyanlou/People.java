package com.shiyanlou;

public class People {
	//�������ⲿ���еķ�����
	public void peopleInfo() {
		final String sex = "man"; //�ⲿ�෽���еĳ���
		class Student {
			String ID = "20151234"; //�ڲ����еĳ���
			public void print() {
				System.out.println("�����ⲿ��ķ����еĳ���sex:" + sex);
				System.out.println("��λ�ڲ����еı���ID��" + ID);
			}
		}
		Student a = new Student(); //���������ڲ���Ķ���
		a.print(); //�����ڲ���ķ���
	}
	//�������ⲿ���е���������
	public void peopleInfo2(boolean b) {
		if (b) {
			final String sex = "man"; //�ⲿ�෽���еĳ���
			class Student {
				String ID = "20151234"; //�ڲ����еĳ���
				public void print() {
					System.out.println("�����ⲿ��ķ����еĳ���sex:" + sex);
					System.out.println("��λ�ڲ����еı���ID��" + ID);
		}
			}
				Student a = new Student(); //���������ڲ���Ķ���
				a.print(); //�����ڲ���ķ���
		}
	}
	public static void main(String[] args) {
		People b = new People(); //�����ⲿ��Ķ���
		System.out.println("�����ڷ����ڣ�============");
		b.peopleInfo(); //�����ⲿ��ķ���
		System.out.println("�����ڷ����⣺============");
		b.peopleInfo2(true);
	}
}
