package basics;

public class ReturnTypes {
	
	//protected, defauklt
	
	private static int a;
	
	// int, double, char, boolean , string
	
	static int add(int a,int b)
	{
		//System.out.println("sum of two numbers is "+(a+b));
		int result=a+b;
		return result;
	}
	
	public static double subtract(double a,double b)
	{
		//System.out.println("subtraction of two numbers is "+(a-b));
		double result=a-b;
		return result;
	}
	
	// Multiplication of two numbers is 200
	
	public String multiplication(int a,int b)
	{
		int result1=a*b;
		String result2="Multiplication of two numbers is "+result1;
		return result2;
	}
	
	public static void main(String[] args) {
		int result=add(0,1);
		System.out.println("addition of two numbers is "+result);
		double subvalue=subtract(10.2, 5.2);
		System.out.println("subtraction of two numbers is "+subvalue);

		ReturnTypes c=new ReturnTypes();
		String mulvalue=c.multiplication(10, 20);
		
		System.out.println(mulvalue);
		
		c.division(10, 20);
		
		System.out.println(a);
		
	}
	
	private void division(int a,int b)
	{
		System.out.println("division of two numbers is "+(a/b));
	}

}
