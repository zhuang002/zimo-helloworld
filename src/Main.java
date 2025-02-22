
public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		// concept of char
		// int, char, boolean, double are primitive types.
		char a = 'A';
		char b = '#';
		
		System.out.println(a);
		System.out.println(b);
		
		// concept of string
		//String, Scanner are a Classes
		String s1 = "abcde";
		String s2 = "BjSdf ddassdf";
		
		System.out.println(s1);
		System.out.println(s2);
		
		
		// the + operation of Strings;
		String s = s1+s2;
		System.out.println(s);
		
		
		// the + operation of String and char.
		s = s1+a;
		System.out.println(s);
		
		s = a+s1;
		System.out.println(s);
		
		// the + operation of String and int
		s = s1+45;
		System.out.println(s);
		
		s= 45+s1;
		System.out.println(s);
		
		// the + operation of String and boolean
		s = s1+true;
		System.out.println(s);
		
		s= false + s1;
		System.out.println(s);
		
		// the + operation of String and double;
		s = s1+2.5/3;
		System.out.println(s);
		
		
		// ASCII code for characters.
		int i1 = a+1;
		System.out.println(i1);
		
		System.out.println(a+1);
		
		double d1 = a+1.5;
		System.out.println(d1);
		
		char c = (char) (a+1);
		System.out.println(c);
		
		
		System.out.println(b+1);
	}

}
