package com.shiyanlou;

public class Puppy {

		   private int puppyAge;
		   public Puppy(String name){
		      // �������������һ��������name
		      System.out.println("С���������� : " + name ); 
		   }
		 
		  /* public void setAge( int age ){
		       puppyAge = age;
		   }
		 
		   public int getAge( ){
		       System.out.println("С��������Ϊ : " + puppyAge ); 
		       return puppyAge;
		   }*/
		 
		   public int getPuppyAge() {
			return puppyAge;
		}

		public void setPuppyAge(int puppyAge) {
			System.out.println("С��������Ϊ : " + puppyAge ); 
			this.puppyAge = puppyAge;
		}

		public static void main(String []args){
		      ///�������� 
		      Puppy myPuppy = new Puppy( "tommy" );
		      // ͨ���������趨age 
		      myPuppy.setPuppyAge(2);
		      // ������һ��������ȡage 
		      myPuppy.getPuppyAge();
		      //��Ҳ�����������������ʳ�Ա���� 
		      System.out.println("����ֵ : " + myPuppy.puppyAge ); 
		   }
}
