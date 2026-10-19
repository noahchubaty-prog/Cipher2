import java.util.Scanner;

public class Caesar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Give me a message");
		Scanner in = new Scanner(System.in);
		String message = in.nextLine();

		System.out.println("Enter a Shift");
		int shift = in.nextInt();
		
		String output = "";
		for (int i = 0; i < message.length(); i++) {
			char letter = message.charAt(i);
			if (letter >= 'A' && letter <= 'Z') {
				letter = (char) (letter + shift);
				if (letter>'Z') {
					letter -=26;
				}
			}
			output+=letter;
		}
System.out.println(output);
		// Read in message Hi Everyone

		// Read in shift

		// Loop through message
		// if letter is alphabetic
		// apply shift
		// if letter is past 'Z'
		// subtract 26
		// add letter to output

		// print output

	}
}
