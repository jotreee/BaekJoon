import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int count = 0;
		
		for (int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i));
			count ++;
			
			if (count == 10) {
				System.out.println();
				count = 0;
			}
		}
	}
}