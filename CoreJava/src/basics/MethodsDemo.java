package basics;

public class MethodsDemo {

	//Object oriented programming language...
	
	
	static int a=10;
	// static and non static method
	
	// method is nothing but a set of instructions
	
	
	// 10,20   10, 10  , 10,89, ....
	
	public static void add(int a,int b)
	{		
		System.out.println("addition of two numbers is "+(a+b));
	}
	
	public static void subtract()
	{
		// local variables
		int a=20;
		int b=10;		
		System.out.println("subtraction of two numbers is "+(a-b));
		
		System.out.println(a);

	}
	
	
	// main is the calling method, add is the called method
	public static void main(String[] args) {

		System.out.println("In main Method");
		add(10,20);
		add(10,30);
		add(10,40);
		add(10,50);
		subtract();
		
		int d[]= {10,20,30};
		int e[]= {20,20,10};
		
		
		for(int i=0;i<d.length;i++)
		{
			add(d[i], e[i]);
		}
		
		System.out.println(a);
		
		
	}

}
