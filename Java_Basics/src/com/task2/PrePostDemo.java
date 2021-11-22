package com.task2;

public class PrePostDemo {
	
	public static void main(String[] args){
        int i = 3;
        i++;
        System.out.println(i);    // "4"
        ++i;                     
        System.out.println(i);    // "5"
        System.out.println(++i);  // "6"
        System.out.println(i++);  // "6"
        System.out.println(i);    // "7"
        int j=7;
        System.out.println(j++);  // "8"

        System.out.println(j++);  // "9"

        System.out.println(++j);  // "9"

        System.out.println(j++);  // "8"
        
    }


}
