class hybrid
{
public static void main(String[] args){
Result r=new Result();
r.getnumber(38);
r.getmarks(17,20);
r.display();
}
 }

class Student{
int rollno;

void getnumber(int s){
rollno=s;
}

void putnumber(){
System.out.println("Roll no : " +rollno);
}

}


class Test extends Student{
float test1,test2;
void getmarks(float a,float b){
test1=a;
test2=b;
}
void putmarks(){
System.out.println("Marks in test 1: " +test1);
System.out.println("Marks in test 2: " +test2);
}
}
interface Sports
{
float score=6.0f;
void putw();
}


class Result extends Test implements Sports{
float total;
public void putw(){
System.out.println("Sports marks : "+score);
}
void display(){
total=test1+test2+score;
putnumber();
putmarks();
putw();


System.out.println("Total marks: "+total);
}
}

