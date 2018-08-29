
import java.util.Scanner;

public class UserInput {

	private Scanner input;
	private String promptMessage;
	private String helpMessage;

	public void setPromptMessage(String promptMessage) {
		this.promptMessage = promptMessage;
	}
	
	public UserInput() {
		input = new Scanner(System.in);
	}

	public String promptUserToGetString() {
		return promptUserToGetString("");
	}

	public String promptUserToGetString(String helpMessage) {
		this.helpMessage = helpMessage;
		boolean outputShouldBeANumber = false;
		String userEnteredData = promptUserForAValue(outputShouldBeANumber);
		return userEnteredData;
	}

	public int promptUserToGetNumber() {
		helpMessage = "Please enter a number in digit form (Ex: 1, 2, 3, etc)";
		boolean outputShouldBeANumber = true;
		String userEnteredData = promptUserForAValue(outputShouldBeANumber);
		return Integer.parseInt(userEnteredData);
	}
	
	private String promptUserForAValue(boolean outputShouldBeANumber) {
		boolean isInvalidValue = true;
		String userEnteredData;
		do {
			System.out.print(promptMessage);
			userEnteredData = input.nextLine();
			isInvalidValue = checkOutputForInvalidValues(userEnteredData, outputShouldBeANumber);
		} while (isInvalidValue);
		System.out.println();
		return userEnteredData;
	}

	private void checkOutputForQuit(String output) {
		if (output.equalsIgnoreCase("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}
	}

	private boolean checkOutputForInvalidValues(String output, boolean outputShouldBeNumber) {
		checkOutputForQuit(output);
		if (!checkOutputForBlank(output) && !checkOutputForHelp(output)) {
				if (outputShouldBeNumber) {
					return !checkOutputCanConvertToInteger(output);
				}
				return false;
		}
		return true;
	}

	private boolean checkOutputForBlank(String output) {
		boolean userEnteredBlank = false;
		if (output.equals("")) {
			System.out.println("You did not enter a value.");
			userEnteredBlank = true;
		}
		return userEnteredBlank;
	}

	private boolean checkOutputForHelp(String output) {
		boolean userAskedForHelp = true;
		if (output.equalsIgnoreCase("help")) {
			userAskedForHelp = returnHelpMessage(output);
		} else {
			userAskedForHelp = false;
		}
		return userAskedForHelp;
	}
	
	private boolean returnHelpMessage(String output) {
		boolean userReceivedHelp = true;
		if (helpMessage.equals("")) {
			System.out.println("There is no 'help' for this command.");
			System.out.print("Do you want to save this as your answer?  Enter Y to use as answer.");
			String verify = input.nextLine();
			if (verify.equalsIgnoreCase("Y")) {
				System.out.println("Answer saved as " + output);
				userReceivedHelp = false;
			}
		} else {
			System.out.println(helpMessage);
		}
		return userReceivedHelp;
	}

	private boolean checkOutputCanConvertToInteger(String output) {
		try {
			Integer.parseInt(output);
			return true;
		} catch (NumberFormatException ex) {
			System.out.println("Your entry is not a whole number in digit form.");
			return false;
		}
	}

}
