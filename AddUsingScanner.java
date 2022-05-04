import java.util.Scanner;
class AddUsingScanner{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your  first double number");
		double a=sc.nextDouble();
		
		System.out.println("Enter your second double number");
		double b=sc.nextDouble();
		
			System.out.println("Sum :"+ (a+b));
			
		System.out.println("My name ");	
		String name=sc.next();


System.out.println("Enter Dept");	
		String dept=sc.next();
                char f=dept.charAt(1);
                System.out.println("Character at first index of the string :"+ f);


		
		
	}
}