

import java.util.Scanner;

public class Inputs {
	
	private Scanner input;
	
	public Inputs() {
		input = new Scanner(System.in);
	}
	
	public String getString(String prompt) {
		boolean isEmpty = true;
		String output;
		do {
			System.out.print(prompt);
			output = input.nextLine();
			checkQuit(output);
			if (output.equals("")) {
				System.out.println("You did not enter a value.");
			} else if (output.toLowerCase().equals("help")) {
				System.out.println("There is no 'help' for this command.");
				System.out.print("Do you want to save this as your answer?  Enter Y to use as answer.");
				String verify = input.nextLine();
				if (verify.equals("Y")) {
					isEmpty = false;
				}
			} else {
				isEmpty = false;
			}
		} while (isEmpty);
		System.out.println();
		return output;
	}
	
	public String getString(String prompt, String help) {
		boolean isEmpty = true;
		String output;
		do {
			System.out.print(prompt);
			output = input.nextLine();
			checkQuit(output);
			if (output.equals("")) {
				System.out.println("You did not enter a value.");
			} else if (output.toLowerCase().equals("help")) {
					System.out.println(help);
			} else {
				isEmpty = false;
			}
		} while (isEmpty);
		System.out.println();
		return output;
	}

	public int getNumber(String prompt) {
		boolean isEmpty = true;
		int answer = 0;
		String output;
		do {
			System.out.print(prompt);
			output = input.nextLine();
			checkQuit(output);
			if (output.equals("")) {
				System.out.println("You did not enter a value.");
			} else if (output.toLowerCase().equals("help")) {
				System.out.println("Please enter a number in digit form (Ex: 1, 2, 3, etc)");
			} else {
				try {
					answer = Integer.parseInt(output);
					isEmpty = false;
				} catch (NumberFormatException ex) {
					System.out.println("Your entry is not a number in digit form.");
				}
			}
		} while(isEmpty);
		System.out.println();
		return answer;
	}
	
	public void checkQuit(String output) {
		if (output.toLowerCase().equals("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}
	}
}
