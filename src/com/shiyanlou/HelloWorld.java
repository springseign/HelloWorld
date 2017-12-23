package com.shiyanlou;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Welcome to ShiYanlou");
		
		int a = 60;
		int b = 13;
		
		System.out.println("~a = " + (~a));
		
		System.out.println("a << 2 = " + (a << 2));
		
		System.out.println("a >> 2 = " + (a >> 2));
		
		System.out.println("a >>> 2 = " + (a >>> 2));
		
        Integer n1 = new Integer(2);
        Integer n2 = new Integer(2);
        System.out.println( n1 == n2);
        System.out.println(n1.equals(n2));

        double score = 68.9;
        String result = (score >= 60?"Pass":"Fail");
        System.out.println(result);
        
        boolean b1 = (5 > 2) && (4 == 5);
        boolean b2 = false || (2 < 5);
        System.out.println(b1);
        System.out.println(b2);
        
        int i = 1;
        int sum = 0;
        while(i <= 1000)
        {
        	if (0 == i%2)
        	{
        		sum = sum + i;
        	}
        	
        	i++;
        }
        System.out.println(sum);
        
        Dog c = new Dog();
        c.legNum = 4;
        c.bark();
        
        Animal d = new Animal();
        d.bark();
        
        Animal e = new Dog(); //Dog对象，向上转型为Animal类型
        e.bark(); //执行Dog类的方法
        
	}

}
