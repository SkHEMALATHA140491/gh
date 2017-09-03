package guvi;
import java.util.Scaanner;
public class IndexOfFirstNumber{
public static void main (String args[]){
Scanner s=new Scanner(System.in);
String a=s.nextLine();
String b=s.nextLine();
if(a.contains(b)){
System.out.println(a.indexOf(b));
}
else{
System.out.println("-1");
}
}
}
