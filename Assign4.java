import java.util.Scanner;
public class Assign4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a letter:");
		String s =input.nextLine();
		
		//Check that it's a single letter//
		if (s.length() !=1) {
			System.out.println("You must enter exactly one letter.");
			System.exit(1);
		}
	
		//Change letter to Uppercase//
		
		char ch = Character.toUpperCase(s.charAt(0));
		int number = 0;
		if (Character.isLetter(ch)) {
			if (ch >= 'W')
				number = 9;
			else if (ch >='T')
				number = 8;
			else if (ch >= 'P')
				number = 7;
			else if (ch >= 'M')
				number = 6;
			else if (ch >= 'J')
				number = 5;
			else if (ch >= 'G')
				number = 4;
			else if (ch >= 'D')
				number = 3;
			else if (ch >= 'A')
				number = 2;
			System.out.println("The corresponding keypad number is " + number);
		}
		else {
			System.out.print(ch + " is not a valid input.");
		}
	}

}
