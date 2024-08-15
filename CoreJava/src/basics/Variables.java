package basics;

public class Variables {
	
	public static void main(String[] args) {
		
		String name="Devi";
		// datatype variablename=value
		int salary=1000;
		float temperature=100.5f;
		double temperature2=96.5;
		boolean isSoftwareEmployee=false;
		char gender='f';
		
		
		System.out.println("Name is "+name);
		System.out.println(name+"'s Salary is "+salary);
		System.out.println(name+"'s temperature is "+temperature);
		System.out.println("is"+name+" a Software Employee? "+isSoftwareEmployee);
		
		
		// "is" Devi a Software Employee  
		
		System.out.println(name+"'s Gender is "+gender);

		
		// if temperature is greater than 99
		
		System.out.println("Checking"+ name+"'s Temperature......");

		
		if(temperature>99)
		{
			System.out.println(name+" is suffering with fever and his/her temperature is "+temperature);
		}
		else
		{
			System.out.println(name+" has a normal temperature and he/she is doing good, temperature is "+temperature);

		}
		
		

	}

}
