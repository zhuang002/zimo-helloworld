import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please input a:");
		int a=sc.nextInt();
		System.out.print("Please input b:");
		int b=sc.nextInt();
		
		int c = a+b;
		System.out.println("a is "+a+". b is "+b+". a+b="+c);
		
		c = a-b;
		System.out.println("a is "+a+". b is "+b+". a-b="+c);
		
		c = a*b;
		System.out.println("a is "+a+". b is "+b+". a*b="+c);

		c = a/b;
		System.out.println("a is "+a+". b is "+b+". a/b="+c);

		// a mod b = r; get remainder r by b devide by a. 
		c = a % b;
		System.out.println("a is "+a+". b is "+b+". a%b="+c);

	}

}
