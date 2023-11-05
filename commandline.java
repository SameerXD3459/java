class commandline
{
public static void main(String args[]) 
{
int inputs = args.length;
System.out.println("Number of inputs= " + inputs);
System.out.println("Inputs taken= ");
for (int i=0;i<inputs;i++) 
{
System.out.println((i + 1) + ". " + args[i]);
}
}
}
