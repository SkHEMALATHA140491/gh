package logics;

import java.util.Scanner;

public class reverse {
public static void main (String args[]){
		int n;
		int rem;
		int r=0;
		int m;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		m=n;
		while(n>0){
		rem=n%10;
		r=r*10+rem;
		n=n/10;
		}
		if(m==r){
		System.out.println("it is reverse");
		}
		else
		{
		System.out.println("it is not a reverse");
		}
		}
}
