package basics;

public class ArraysDemo {

	public static void main(String[] args) {

		//1...50
		
		/*int evennumber1=2;
		int evennumber2=4;
		int evennumber3=6;
		int evennumber4=8;
		int evennumber5=10;*/
		
		
		int evenNumbers[]= {2,4,6,8,10,5,8,5}; // 0 1 2 3 4 /// size of array is 8
		
		String names[]= {"Divya","Devi","Sai","Daniel","Vishnu","Santhu"}; // 0 1 2 3 4 5 // size of array is 6
		
		System.out.println(evenNumbers[0]);
		System.out.println(evenNumbers[1]); // trying to access value 4 by passsing its index location/position
		System.out.println(evenNumbers[2]);
		System.out.println(evenNumbers[3]);
		System.out.println(evenNumbers[4]);
		
		System.out.println(names[2]);
		
		int evenNumberss[]=new int[5];
		
		evenNumberss[0]=10;
		evenNumberss[1]=20;
		evenNumberss[2]=30;
		evenNumberss[3]=40;
		evenNumberss[4]=50;
		
		
		// 0 evenNumbers.length
		
		for(int indexPosition=0;indexPosition<=evenNumbers.length-1;indexPosition++)
		{
			System.out.println(evenNumbers[indexPosition]);
		}
		
		
		
	}

}
