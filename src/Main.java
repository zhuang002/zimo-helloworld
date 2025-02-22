
public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		/*
		 * declaration of array:
		 * 
		 * type[] veriable;
		 * 
		 * type is a primitive type or a class.
		 * veriable is a veriable name.
		 * 
		 * 
		 */
		
		// integer,boolean,char, double, String arrays
		int[] a;
		a = new int[10];
		
		boolean[] b = new boolean[20];
		
		char[] c = new char[30];
		
		double[] d = new double[5];
		
		String[] s = new String[3];
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(s);
		
		
		System.out.println("Content of a ====================");
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		
		System.out.println("Content of b ====================");
		for (int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println();
		
		System.out.println("Content of c ====================");
		for (int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}
		System.out.println();
		
		System.out.println("Content of d ====================");
		for (int i=0;i<d.length;i++) {
			System.out.print(d[i]+" ");
		}
		System.out.println();
		
		System.out.println("Content of s ====================");
		for (int i=0;i<s.length;i++) {
			System.out.print(s[i]+" ");
		}
		System.out.println();
		
		// to access array element, using arrayName[index]; 
		// index is an integer to access an element, starting from 0;
		System.out.println("Now assign value to a array");
		for (int i=0;i<a.length;i++) {
			a[i] = 5*i;
		}
		a[3] = 10000;
		System.out.println("Content of a ====================");
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		
		System.out.println("Now assign value to b array");
		for (int i=1;i<b.length;i++) {
			b[i] = !b[i-1];
		}
		b[3] = false;
		System.out.println("Content of b ====================");
		for (int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
		
		System.out.println();
		
		System.out.println("Now assign value to c array");
		c[0] = 'A';
		for (int i=1;i<c.length;i++) {
			c[i] = (char) (c[i-1]+3);
		}
		c[3] = '&';
		System.out.println("Content of c ====================");
		for (int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}
		
		System.out.println();
		
		System.out.println("Now assign value to s array");
		s[0] = "Alen";
		s[1] = "Berry";
		s[2] = "Carry";
		System.out.println("Content of b ====================");
		for (int i=0;i<s.length;i++) {
			System.out.print(s[i]+" ");
		}
		
		System.out.println();
		
		
	}

}
