package student;

public class Student 
{
	int rollNo;
	int age;
	public void display1()
	{
		System.out.println("Welcome to all of you");
	}
	public void display2()
	{
		System.out.println("Automation is very easy");
	}
	public static void main(String[] args)
	{
		Student obj=new Student();
		obj.display1();
		obj.display2();
	}

}
