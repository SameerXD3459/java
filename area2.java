import java.util.*;
class area
{
int s;
float l, b;
double r;
double area;
void calarea(int s)
{
s=s;
area=s*s;
System.out.println("Area of Square= "+area);
}
void calarea(float l, float b)
{
l=l;
b=b;
area=l*b;
System.out.println("Area of Rectangle= "+area);
}
void calarea(double r)
{
r=r;
area=3.14*r*r;
System.out.println("Area of Circle= "+area);
}
}

class area2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter side of Square= ");
int s=sc.nextInt();
System.out.println("Enter length and breadth of Rectangle= ");
float l=sc.nextFloat();
float b=sc.nextFloat();
System.out.println("Enter radius of Circle= ");
double r=sc.nextDouble();
area a=new area();
a.calarea(s);
a.calarea(l, b);
a.calarea(r);
}
}