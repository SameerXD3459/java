import java.util.Scanner;
class digitcount
{
public static void main(String args[])
{
int count=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number=");
int n=sc.nextInt();
while(n!=0)
{
count++;
n=n/10;
}
System.out.println("Number of digits="+count);
}
}
