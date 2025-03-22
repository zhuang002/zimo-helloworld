import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		Scanner sc = new Scanner(System.in);
		
		String type = sc.nextLine(); // read in the type to be converted: I for integer, D for double, B for boolean
		// H for hex, O for oct, 
		
		String line = sc.nextLine();
		
		String[] numbers = line.split(",");
		
		for (int i=0;i<numbers.length;i++) {
			String data = numbers[i];
			char c = type.charAt(0);
			if (c == 'I') {
				int ii = Integer.parseInt(data);
				System.out.print(ii + "|");
			} else if (c == 'D') {
				double dd = Double.parseDouble(data);
				System.out.print(dd+"|");
			} else if (c == 'B') {
				boolean bb = Boolean.parseBoolean(data);
				System.out.print(bb+"|");
			} else if (c == 'H') {
				int ii = Integer.parseInt(data,16);
				System.out.print(ii + "|");
			} else if (c == 'O') {
				int ii = Integer.parseInt(data, 8);
				System.out.print(ii+"|");
				
			}
		}

	}

}
