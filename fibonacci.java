class fibonacci
{
public static void main(String args[])
{
int n= Integer.parseInt(args[0]);
int a=0;
int b=1;
System.out.print(a+"\t");
System.out.print(b+"\t");
for(int i=1;i<=n-2;i++)
{
int c=a+b;
System.out.print(c+"\t");
a=b;
b=c;
}
}
}

