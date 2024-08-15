package bitadvanced;

public class OOPS_MethodOverloading {
	
	
	
	// method having same name but differs in either no of parameters or data types or order of the data type
	
	public static void add(int a,int b)
	{
		System.out.println("sum of two numbers is "+(a+b));
	}
	
	public static void add(double a,double b)
	{
		System.out.println("sum of two decimal numbers is "+(a+b));
	}
	
	public static void add(double a,int b)
	{
		System.out.println("sum of decimal plus int number is "+(a+b));
	}
	
	public static void add(int a,double b)
	{
		System.out.println("sum of decimal plus int number is "+(a+b));
	}
	
	public static void add(int a,int b,int c)
	{
		System.out.println("sum of three numbers is "+(a+b+c));
	}
	
	public static void add(int a,int b,int c,int d)
	{
		System.out.println("sum of three numbers is "+(a+b+c+d));
	}
	
	public static void add(int a,int b,int c,int d,int e)
	{
		System.out.println("sum of three numbers is "+(a+b+c+d+e));
	}
	
	
	public static void main(String[] args) {

		add(10, 20); // int,int
		add(10, 20,30);
		add(10.2, 20.2);
		add(10.2, 20);
		add(20, 10.2);
		add(10,20,30,40);
		
	}

}
