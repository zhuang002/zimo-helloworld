import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please input a:");
		double a=sc.nextDouble();
		System.out.print("Please input b:");
		double b=sc.nextDouble();
		
		double c = a+b;
		System.out.println("a is "+a+". b is "+b+". a+b="+c);
		
		c = a-b;
		System.out.println("a is "+a+". b is "+b+". a-b="+c);
		
		c = a*b;
		System.out.println("a is "+a+". b is "+b+". a*b="+c);

		c = a/b;
		System.out.println("a is "+a+". b is "+b+". a/b="+c);
		
		System.out.print("c is "+c+".");
		c = c*b;
		System.out.println(" b is "+b+". c*b="+c);
		
		// a, b, c are variables. the name of a variable must start with an alphabet. a1 b2 are valid
		// variable names. studentName is also a valid variable name. 1b, 1student are not valid 
		// variable names. &bc, *bb are not valid variable names either. 
		
		// here = is assignment(赋值) statement(语句). it is not to compare 2 numbers. 
		
		// next problem: can an integer be converted to a double? answer: yes.
		
		int i = 4;
		a = i;
		
		System.out.println("i is "+i+". a is "+a);
		
		// next problem: can a double be converted to an integer? answer: yes.
		
		a = 4.3;
		// i = a; this is wrong. because you may miss something when convert double to int.
		// if we force to convert, then we need type cast. (强制转换类型)
		i = (int)a;
		System.out.println("a is "+a+". i is "+i);
		
		// using // before a line means the line is comment.
		//next problem: how to cast a negative double.
		a = -4.3;
		i = (int)a;
		System.out.println("a is "+a+". i is "+i);
		
	}

}
