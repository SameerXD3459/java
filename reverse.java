import java.util.*;
class reverse 
{
public static void main(String x[])
{
char c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string =");
String str=sc.nextLine();
String rev="";
for(int i=str.length()-1;i>=0;i--)
{
c=str.charAt(i);
rev=rev+c;
}
System.out.println("Reverse= "+rev);
}
}



