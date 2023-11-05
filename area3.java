import java.util.*;
class Room
{
int l, b;
float area;
Room()
{
l=0;
b=0;
}
Room(int x, int y)
{
l=x;
b=y;
}
Room(int x)
{
l=x;
b=x;
}
void calarea()
{
area=l*b;
System.out.println("Area= "+area);
}
}

class area3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter side of Square= ");
int s=sc.nextInt();
System.out.println("Enter length and breadth of Rectangle= ");
int l=sc.nextInt();
int b=sc.nextInt();
Room R=new Room();
R.calarea();
Room R1= new Room(l, b);
R1.calarea();
Room R2=new Room(s);
R2.calarea();
}
}
