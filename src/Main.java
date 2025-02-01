import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean b1, b2, b3;  
		int i1, i2, i3;
		double d1, d2, d3;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please input i1:");
		i1 = sc.nextInt();
		
		System.out.print("Please input i2:");
		i2 = sc.nextInt();
		
		System.out.print("Please input i3:");
		i3 = sc.nextInt();
		
		b1 = (i1 == i2); // == is a comparison operation between 2 numbers. the result is a boolean value.
		System.out.println("i1 equals to i2 is "+b1);
		
		b2 = (i2 > i3); // > is 'greater than'
		System.out.println("i1 greater than i2 is "+b1);
		
		b3 = (i1 <= i3); // <= is 'less or equal to'
		System.out.println("i1 less or equal to i2 is "+b1);
		
		System.out.println("i1 not equal to i2 is "+(i1!=i2));
		
		// comparison operations : ==, <, >, >=, <=, != 
	
		System.out.print("Please input d1:");
		d1 = sc.nextDouble();
		
		System.out.print("Please input i2:");
		d2 = sc.nextDouble();
		
		System.out.print("Please input i3:");
		d3 = sc.nextDouble();
		
		b1 = (d1 == d2); // == is a comparison operation between 2 numbers. the result is a boolean value.
		System.out.println("d1 equals to d2 is "+b1);
		
		b2 = (d2 > d3); // > is 'greater than'
		System.out.println("d1 greater than d3 is "+b1);
		
		b3 = (d1 <= d3); // <= is 'less or equal to'
		System.out.println("d1 less or equal to d3 is "+b1);
		
		System.out.println("d1 not equal to d2 is "+(d1!=d2));
		
		i1 = 4;
		d1 = 4.1;
		b1 = (i1 == d1);
		System.out.println("4 equals 4.1 is "+(i1==d1));
				
		
		
	}

}
