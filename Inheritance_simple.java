package corejava;

class student           //super class in inheritance
{ 
	int roll,marks;
	String name;
	void input()
	{
		System.out.println("Enter Roll Name & Marks: ");
	}
}

class ajay extends student             //sub class in inheritance
{
	void disp()
	{
		roll=1; name="ajay"; marks=87;
		System.out.println(roll+" "+name+" "+" "+marks);
	}
}

public class Inheritance_simple 
{

	public static void main(String[] args) 
	{
		ajay a=new ajay();
		a.input();
		a.disp();
		

	}

}
