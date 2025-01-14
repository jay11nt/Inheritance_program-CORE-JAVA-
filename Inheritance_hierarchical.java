package corejava;

class P
{
	void input()
	{
		System.out.println("Enter your Name");
	}
}

class Q extends P	//subclass extends superclass
{
	void Show()
	{
		System.out.println("My Name Is Ajju");
	}
}

class R extends P	//subclass extends superclass
{
	void Disp()
	{
		System.out.println("My Name Is Appu");
	}
}


public class Inheritance_hierarchical 
{
	public static void main(String[] args) 
	{
		Q r=new Q();
		R r1=new R();
		
		r.input();
		r.Show();
		r1.input();
		r1.Disp();

	}

}
