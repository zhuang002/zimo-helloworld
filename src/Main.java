import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean a,b,c,d;  // names in purple are reserved words(保留字). They have special meaning in 
		// programming language.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please input boolean value a:");
		a = sc.nextBoolean();
		System.out.print("Please input boolean value b:");
		b = sc.nextBoolean();
		System.out.print("Please input boolean value c:");
		c = sc.nextBoolean();
		
		d = a && b; // && is the operator for And operation. 
		System.out.println("a and b is:" + d);
		
		d = a || b; // || is the operator for Or operation.
		System.out.println("a or b is:" + d);
		
		d = a && b || c;
		System.out.println("(a && b || c) is:" + d);
		
		d = a || (b && c);
		System.out.println("(a || (b && c)) is:" + d);
		
		d = (a || b) && (a || c);
		System.out.println("((a || b) && (a || c)) is:" + d);
		
		d = !(a || c);
		System.out.println("(!(a || c)) is:" + d);
		
		d = !a && !c;
		System.out.println("(!a && !c) is:" + d);
		
		
	}

}
