
import java.util.Scanner;

public class Inputs {

	private Scanner input;

	public Inputs() {
		input = new Scanner(System.in);
	}

	public String promptUserToGetString(String promptMessage) {
		return promptUserToGetString(promptMessage, "");
	}

	public String promptUserToGetString(String promptMessage, String helpMessage) {
		boolean isInvalidValue = true;
		String output;
		do {
			System.out.print(promptMessage);
			output = input.nextLine();
			checkOutputForQuit(output);
			isInvalidValue = checkOutputForInvalidValues(output, helpMessage, false);
		} while (isInvalidValue);
		System.out.println();
		return output;
	}

	public int promptUserToGetNumber(String promptMessage) {
		boolean isInvalidValue = true;
		String helpMessage = "Please enter a number in digit form (Ex: 1, 2, 3, etc)";
		String output;
		do {
			System.out.print(promptMessage);
			output = input.nextLine();
			checkOutputForQuit(output);
			isInvalidValue = checkOutputForInvalidValues(output, helpMessage, true);
		} while (isInvalidValue);
		System.out.println();
		return Integer.parseInt(output);
	}

	public void checkOutputForQuit(String output) {
		if (output.equalsIgnoreCase("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}
	}

	public boolean checkOutputForInvalidValues(String output, String helpMessage, boolean outputShouldBeNumber) {
		if (!checkOutputForBlank(output)) {
			if (!checkOutputForHelp(output, helpMessage)) {
				if (outputShouldBeNumber) {
					return !checkOutputCanConvertToInteger(output);
				}
				return false;
			}
		}
		return true;
	}

	public boolean checkOutputForBlank(String output) {
		boolean userEnteredBlank = false;
		if (output.equals("")) {
			System.out.println("You did not enter a value.");
			userEnteredBlank = true;
		}
		return userEnteredBlank;
	}

	public boolean checkOutputForHelp(String output, String helpMessage) {
		boolean userAskedForHelp = true;
		if (output.equalsIgnoreCase("help")) {
			if (helpMessage.equals("")) {
				System.out.println("There is no 'help' for this command.");
				System.out.print("Do you want to save this as your answer?  Enter Y to use as answer.");
				String verify = input.nextLine();
				if (verify.equals("Y")) {
					System.out.println("Answer saved as " + output);
					userAskedForHelp = false;
				}
			} else {
				System.out.println(helpMessage);
			}
		} else {
			userAskedForHelp = false;
		}
		return userAskedForHelp;
	}

	public boolean checkOutputCanConvertToInteger(String output) {
		try {
			Integer.parseInt(output);
			return true;
		} catch (NumberFormatException ex) {
			System.out.println("Your entry is not a whole number in digit form.");
			return false;
		}
	}

}
