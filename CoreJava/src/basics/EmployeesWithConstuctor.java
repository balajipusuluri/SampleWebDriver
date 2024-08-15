package basics;

public class EmployeesWithConstuctor {


	String empName;
	int empid;
	double empsal;
	static String companyName="Infosysss";
	String empDesignation;
	double bonus;
	
	public EmployeesWithConstuctor(String empName,int empid,double empsal,String empDesignation)
	{
		this.empName=empName;
		this.empid=empid;
		this.empsal=empsal;
		this.empDesignation=empDesignation;
	}
	
	public EmployeesWithConstuctor(String empName,int empid,double empsal,String empDesignation,double bonus)
	{
		this.empName=empName;
		this.empid=empid;
		this.empsal=empsal;
		this.empDesignation=empDesignation;
		this.bonus=bonus;
	}
	
	
	public void printEmpData()
	{
		System.out.println("Emp Name is "+empName);
		System.out.println("Emp Id is "+empid);
		System.out.println("Emp sal is "+empsal);

		if(bonus>0)
		{
			System.out.println("Your performance is good - bonus for your peformance is "+bonus);
		}
		
		System.out.println("Emp company name is "+companyName);
		System.out.println("Emp designation is "+empDesignation);

	}
	 
	
	
	public static void main(String[] args) {

		// empdesignation, emname, empid, empsal,companyname
		// common memory gets created and is shared with all of the objects
		// classname referencevariablename/vairable name=new classname();
		EmployeesWithConstuctor Divya=new EmployeesWithConstuctor("Divya",1521,10000,"Software Tester");
		Divya.printEmpData();
		
		System.out.println("************************************************");
		System.out.println("************************************************");

		
		EmployeesWithConstuctor Sai=new EmployeesWithConstuctor("Sai",1522,15000,"Software Developer");
		Sai.printEmpData();
		
		System.out.println("************************************************");
		System.out.println("************************************************");
		
		EmployeesWithConstuctor Dan=new EmployeesWithConstuctor("Dan",1523,20000,"BA");
		Dan.printEmpData();
		
		System.out.println("************************************************");
		System.out.println("************************************************");
		
		EmployeesWithConstuctor Devi=new EmployeesWithConstuctor("Devi",1524,25000,"Data Scientist",50000);
		Devi.printEmpData();
		
		System.out.println("************************************************");
		System.out.println("************************************************");

		
		
		EmployeesWithConstuctor JJJ=new EmployeesWithConstuctor("JJJ",1525,30000,"Software Tester");
		JJJ.printEmpData();
		
		
		System.out.println("************************************************");
		System.out.println("************************************************");

		//System.out.println(JJJ.empName);
		
	}

}
