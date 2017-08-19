package logics;
import java.util.Scanner;
public class Idgeneration {
public static String output1;
public static void main(String args[]){
	Id_Generation("Kavi","kala","637008");
}
private static void Id_Generation(String s, String s1, String pin){
	String smaller_name=s;
	String larger_name =s1;
	if(s.length()<s1.length()){
	    larger_name=s1;
	    smaller_name=s;
	   System.out.println(larger_name);
	    System.out.println(smaller_name);
 }
	else if(s.length()>s1.length()){
		larger_name=s;
		smaller_name=s1;
		 System.out.println(larger_name);
		 System.out.println(smaller_name);
	}
	if (larger_name.compareTo(smaller_name)>0){
		System.out.println("larger_name comes after smaller_name"+smaller_name);
	    System.out.println("smaller_name comes after larger_name"+larger_name);
} 
	else if(s.compareTo(s1)<0){
		System.out.println("larger_name comes after smaller_name"+smaller_name);
		System.out.println("smaller_name comes after larger_name"+larger_name);
		}
char c=s.charAt(0);
s1=smaller_name;
int l=pin.length();
char c1=pin.charAt(5);
char c2=pin.charAt(0);
output1=c+s1+c1+c2;
System.out.println(output1);	
/*for(int i=0; i<=output1.length()-1; i++){
	char c3=output1.charAt(i);
	if(Character.isUpperCase(c3)){
		System.out.print(Character.toLowerCase(c3));
	}
	else if(Character.isLowerCase(c3)){
		System.out.print(Character.toUpperCase(c3));
	}
	else
	{
		System.out.print(c3);
		}
}*/
		}
		}
	


	
