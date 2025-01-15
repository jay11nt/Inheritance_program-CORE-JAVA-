package corejava;

interface G
{
	void show();     //abstract method
}

interface H
{
	void disp();
}


public class Inheritance_multiple implements G,H
{	@Override
	public void show()
	{
		System.out.println("Interface H");
	}
	
	public void disp()
	{
		System.out.println("Interface G");
	}

	public static void main(String[] args) 
	{
		Inheritance_multiple m=new Inheritance_multiple();
		m.show();
		m.disp();
    }

}
