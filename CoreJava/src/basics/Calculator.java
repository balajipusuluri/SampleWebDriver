package basics;

public class Calculator {
	
	//protected, defauklt
	
	private static int a;
	
	static void add(int a,int b)
	{
		System.out.println("sum of two numbers is "+(a+b));
	}
	
	public static void subtract(int a,int b)
	{
		System.out.println("subtraction of two numbers is "+(a-b));
	}
	
	public void multiplication(int a,int b)
	{
		System.out.println("multiplication of two numbers is "+(a*b));
	}
	
	public static void main(String[] args) {
		add(0,1);
		Calculator c=new Calculator();
		c.multiplication(10, 20);
		c.division(10, 20);
		
		System.out.println(a);
		
	}
	
	private void division(int a,int b)
	{
		System.out.println("division of two numbers is "+(a/b));
	}

}
