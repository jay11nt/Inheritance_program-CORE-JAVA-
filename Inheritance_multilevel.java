package corejava;

class m          //super class
{
	int a,b,c;
	void add()
	{
		a=10; b=20;
		c=a+b;
		System.out.println("Enter the sum of two no.: "+c);
	}
	
	void sub()
	{
		a=40; b=60;
		c=a-b;
		System.out.println("Enter the sum of two no.: "+c);
	}
}

class n extends m     //1st sub class
{
	void multi()
	{
		a=12; b=20;
		c=a*b;
		System.out.println("Enter the sum of two no.: "+c);
	}
	
	void div()
	{
		a=15; b=3;
		c=a/b;
		System.out.println("Enter the sum of two no.: "+c);
	}
	
}

class o extends n     //2nd sub class
{
	void rem()
	{
		a=10; b=3;
		c=a%b;
		System.out.println("Enter the sum of two no.: "+c);
	}
}

public class Inheritance_multilevel 
{

	public static void main(String[] args) 
	{
		o x=new o();
		x.add();
		x.sub();
		x.multi();
		x.div();
		x.rem();
		

	}

}
