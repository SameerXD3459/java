import Operations.special;
import java.util.*;

class packed
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("ENTER TWO NUMBERS :");
	double a=sc.nextDouble();
	double b=sc.nextDouble();
	
	special s1=new special();
	s1.add(a,b);
	s1.sub(a,b);
	s1.mul(a,b);
	s1.div(a,b);
}
}
