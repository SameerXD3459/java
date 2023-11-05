import java.util.*;
class victor
{
public static void main(String x[])
{
Vector <Integer> v=new Vector <>();
v.add(2);
v.add(4);
v.add(6);
v.add(8);
v.add(10);
v.add(12);
v.add(14);
v.add(16);
System.out.println("vector elements= "+v);
System.out.println("after removing element 4= "+v.remove((Integer) 4));
System.out.println("after removing element at index 4= "+v.remove(4));
System.out.println("hashcode= "+v.hashCode());
System.out.println("element at index 1= "+v.get(1));
}
}

