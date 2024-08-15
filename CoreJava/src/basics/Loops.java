package basics;

public class Loops {

	public static void main(String[] args) {

		
		
		/*System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");*/
		
		// While, do while and For loop
		
		//1,2,3,4,5,6,7,8,9,10 - 1...10
		
		// While loop
		
		int count=1;
		
		while(count<=11) // i<=10 true 2<=10 true
		{
			System.out.println("Hello");
			count=count+1; // count++;
		}
		
		System.out.println("****************************************");
		
		// for loop
		
		for(int countt=1;countt<=11;countt++)
		{
			System.out.println("Hello");
		}
		
		System.out.println("****************************************");

		
		// do while
		
		//1....1000
		
		int counttt=1;
		
		do
		{
			System.out.println("Hello");
			counttt=counttt+1; // count++;
		}
		while(counttt<=11);
		
		
		// print even numbers from 1 to 20
		
		// 
		
		for(int num=1;num<=20;num++)
		{
			int remainder=num%2;
			
			if(remainder==0) {
				System.out.println(num);
			}
			
		}
		
		
		// print even numbers from 1 to 20
		
				for(int num=1;num<=20;num++)
				{
					int remainder=num%2;
					
					if(remainder!=0) {
						System.out.println(num);
					}
					
				}
				
				
				System.out.println("**************************");
				
				
				// print number is even or odd
				
				for(int num=1;num<=20;num++)
				{
					int remainder=num%2;
					
					String evenOrOdd=remainder==0?"is Even number":"is Odd Number";
					
					System.out.println(num+" "+evenOrOdd);
					
				}
				
				
				// 1 .. 30 1234....13 > 7 and divisible by 7
				
				System.out.println("Print numbers starting from 1 till number is divisible by 7 and number > 7");

				
				for(int num=1;num<=30;num++)
				{
					int remainder=num%7; // reaminder==0 and num>7
					
					if(remainder==0 && num>7 )
					{
						System.out.println("Done with printing numbers");
						break;
					}
					else
					{
						System.out.println(num);
	
					}
					
				}
				
			
				
	}

}
