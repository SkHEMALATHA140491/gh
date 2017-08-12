package logics;

import java.util.Scanner;

public class truefalse {
public static void main(String args[]){
	Scanner in=new Scanner(System.in);
    System.out.println("enter the day");
    String s1=in.nextLine();
     	if(s1.equals("saturday")||s1.equals("sunday"))
    	{
    		System.out.println("false");
    	}
    	else
    	{
    		System.out.println("true");
    	}
    }
}