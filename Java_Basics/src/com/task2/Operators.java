package com.task2;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		System.out.println("i value is " + i);

		int n = i++ % 5;
		System.out.println("n value is " + n);
		System.out.println("i value is " + i);
		

		int j = 10;
		System.out.println("j value is " + j);

		int m = ++j % 5;
		System.out.println("m value is " + m);
		System.out.println("j value is " + j);
		//3
		boolean flag=true;
		
		System.out.println("flag value is " + !flag);
		
		//4
        boolean flag1=true;
        if(flag==!flag1) {
    		System.out.println("Both values are same");

        }else {
    		System.out.println("Both values are not the same");

        	
        }
        
        //5
		int val= 50;

        boolean result=false;
        result = (val<30) ? true : false;
        
		System.out.println("result is "+result);

	
		

		

	}

}


