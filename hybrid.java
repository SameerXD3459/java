import java.util.*;
class Student{
	int rollNo;
	Scanner sc=new Scanner(System.in);
	public void getRollNumber(){
		System.out.println("ENTER STUDENT ROLL NO. :");
		rollNo=sc.nextInt();
	}
	public void showRollNumber(){
		System.out.println("STUDENT ROLL NO. :"+rollNo);
	}
}
class Test extends Student{
	int marks1;
	int marks2;
	Scanner sc=new Scanner(System.in);
	public void getMarks(){
		System.out.println("ENTER STUDENT MARKS :");
		marks1=sc.nextInt();
		marks2=sc.nextInt();
	}
	public void showMarks(){
		System.out.println("STUDENT MARKS :"+marks1+" "+marks2);
	}
}
interface Sports{
	int score=7;
	void showScore();
}
class Result extends Test implements Sports{
	public void showScore(){
		System.out.println("STUDENT SCORE :"+score);
	}
	public void showResult(){
                int total=marks1 + marks2 + score;
		System.out.println("STUDENT RESULT IS :"+total);
	}
}
class Hybrid{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		Result r=new Result();
		r.getRollNumber();
		r.getMarks();
		r.showRollNumber();
		r.showMarks();
		r.showScore();
		r.showResult();
	}
}