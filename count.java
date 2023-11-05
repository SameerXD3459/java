import java.util.*;
class count 
{
public static void main(String x[])
{
char s='l';
String str="Hello Java";
int count=0;
for(int i=0;i<str.length();i++)
{
if(s==str.charAt(i))
{
count++;
}
}
System.out.println("Number of Ocurrances= "+count);
}
}