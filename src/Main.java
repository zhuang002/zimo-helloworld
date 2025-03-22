
public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		String s = "asdfasfdsafsafdafasfdsa";
		
		// enumerate all chars in a string.
		for (int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			System.out.print(c+",");
		}
		System.out.println();
		
		// find a substring begin with an index;
		s = "Tomorrow is Saturday";
		String substr = s.substring(3);
		System.out.println(substr);
		
		// find a substring from index1 to index2;
		substr = s.substring(4, 7);
		System.out.println(substr);
		
		// find a position of a substring.
		int index = s.indexOf("row");
		System.out.println("The index of 'row' is "+index);
		
		index = s.indexOf("aaa");
		System.out.println("The index of 'aaa' is "+index);
		
		// find all indexes of a substring.
		index = 0;
		while (true) {
			index = s.indexOf("o", index);
			System.out.print(index+",");
			if (index<0) 
				break;
			index++;
		}
		System.out.println();
		
		s = "A boy is a boy.";
		
		String s2 = s.replace("boy", "girl");
		System.out.println(s2);
		
		String[] sAr = s.split(" ");
		for (int i=0;i<sAr.length;i++) {
			System.out.print(sAr[i]+"|");
		}
		
	}

}
