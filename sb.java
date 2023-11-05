import java.util.*;
class sb
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a sentence= ");
StringBuffer str=new StringBuffer();
str.append(sc.nextLine());
System.out.println("Reverse= "+str.reverse());
}
}