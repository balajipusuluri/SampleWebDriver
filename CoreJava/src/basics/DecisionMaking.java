package basics;

public class DecisionMaking {



	public static void main(String[] args) {

		int a=3;
		int b=3;

		// either a> b or a<b or a==b

		boolean isSoftwareEmployee=false;

		/*if(isSoftwareEmployee)
		{
			System.out.println("is a software employee");
		}
		else
		{
			System.out.println("is not a software employee");
		}*/


		String result=isSoftwareEmployee?"is a software employee":"is not a software employee";
		System.out.println("***************************");
		System.out.println(result);


		if(a>b/*false*/) // 3>3 false 
		{
			System.out.println("a is greater than b");
		}
		else
			if(a<b/*false*/) // 3<3 false
			{
				System.out.println("a is less than b");
			}
			else
			{
				System.out.println("a is equal to b");
			}

		if(isSoftwareEmployee) // true or false
		{
			System.out.println("he/she is a software employee");
		}

		int dishNumber=3;

		if(dishNumber==1)
		{
			System.out.println("Idly");
		}
		else
			if(dishNumber==2)
			{
				System.out.println("Dosa");
			}
			else
				if(dishNumber==3)
				{
					System.out.println("Puri");
				}
				else
					if(dishNumber==4)
					{
						System.out.println("Wada");
					}

		System.out.println("*****************Switch Case************************");

		switch(dishNumber)
		{
			case 1: System.out.println("Idly");
			break;
			case 2: System.out.println("Dosa");
			break;
			case 3: System.out.println("Puri");
			break;
			case 4: System.out.println("Wada");
			break;
		}
		
		
		String monthName="March";
		
		
		switch(monthName)
		{
			case "Jan": System.out.println(1);
			break;
			case "Feb": System.out.println(2);
			break;
			case "March": System.out.println(3);
			break;
		}
		
		
	}

}
