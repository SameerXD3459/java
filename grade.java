import java.util.*;
class grade
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter marks of English, Maths, Physics, Chemistry and Biology= ");
int e=sc.nextInt();
int m=sc.nextInt();
int p=sc.nextInt();
int c=sc.nextInt();
int b=sc.nextInt();
int avg=(e+m+p+c+b)/5;
if(avg>90)
{
System.out.println("A Grade");
}
else if(avg<91&&avg>80)
{
System.out.println("B Grade");
}
else if(avg<81&&avg>70)
{
System.out.println("C Grade");
}
else if(avg<71&&avg>60)
{
System.out.println("D Grade");
}
else
{
System.out.println("E Grade");
}
}
}

