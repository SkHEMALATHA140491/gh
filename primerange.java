package logic;
import java.util.Scanner;
public class primerange {
	public static void main(String args[]){
		int i;
		for(i=10; i<=99; i++){
		if(i%2!=0 &&i%3!=0 && i%5!=0 && i%7!=0){
		System.out.print(i+" ");
		}
		
	}
}
}