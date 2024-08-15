package bitadvanced;

public class OOPS_ConstructorOverloading {
	
	
	/*
	 * 
	 * declare variable as static when the variable/property/attribute/field value is common for all the objects. 
	 * static variable can be accessed directly... no need to create an object of a class
	 * 
		declare variable as non static when the variable/property/attribute/field value is specific for each objects. 
	 * non static variable cannot be accessed directly... we have to create an object and then access it
	 * 
	 * static method can be called directly or using classname.methodname
	 * 
	 * non static method we can access by creating an object of a class and then referencevariable.methodname
	 * 
	 * this keyword is used to differentiate a variable from method variable... if you have a varialbe with same name declared
	 * at method parameter or inside a method and at class level then this.variable points to a variable declared at class level
	 * 
	 */

	String empName;
	int empid;
	double empsal;
	static String companyName="Infosysss";
	String empDesignation;
	
	
	// non static method
	
	//constructor in java
	
	/*public EmployeesWithConstuctor()
	{
		this.empName=null;
		this.empid=0;
		this.empsal=0.0;
		this.empDesignation=null;
	}*/
	
	public OOPS_ConstructorOverloading(String empName,int empid,double empsal,String empDesignation)
	{
		this.empName=empName;
		this.empid=empid;
		this.empsal=empsal;
		this.empDesignation=empDesignation;
	}
	
	
	public void printEmpData()
	{
		System.out.println("Emp Name is "+empName);
		System.out.println("Emp Id is "+empid);
		System.out.println("Emp sal is "+empsal);
		System.out.println("Emp company name is "+companyName);
		System.out.println("Emp designation is "+empDesignation);

	}
	 
	
	
	public static void main(String[] args) {

		// empdesignation, emname, empid, empsal,companyname
		// common memory gets created and is shared with all of the objects
		// classname referencevariablename/vairable name=new classname();
		OOPS_ConstructorOverloading Divya=new OOPS_ConstructorOverloading("Divya",1521,10000,"Software Tester");
		Divya.printEmpData();
		
		System.out.println("************************************************");
		System.out.println("************************************************");

		
		OOPS_ConstructorOverloading Sai=new OOPS_ConstructorOverloading("Sai",1522,15000,"Software Developer");
		Sai.printEmpData();
		
		System.out.println("************************************************");
		System.out.println("************************************************");
		
		OOPS_ConstructorOverloading Dan=new OOPS_ConstructorOverloading("Dan",1523,20000,"BA");
		Dan.printEmpData();
		
		System.out.println("************************************************");
		System.out.println("************************************************");
		
		OOPS_ConstructorOverloading Devi=new OOPS_ConstructorOverloading("Devi",1524,25000,"Data Scientist");
		Devi.printEmpData();
		
		System.out.println("************************************************");
		System.out.println("************************************************");

		
		
		OOPS_ConstructorOverloading JJJ=new OOPS_ConstructorOverloading("JJJ",1525,30000,"Software Tester");
		JJJ.printEmpData();
		
		
		System.out.println("************************************************");
		System.out.println("************************************************");

		//System.out.println(JJJ.empName);
		
	}

}
