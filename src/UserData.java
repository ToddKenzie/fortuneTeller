

public class UserData {
	
	private String firstName;
	private String lastName;
	private int age;
	private int birthMonth;
	private String favoriteColor;
	private int numSiblings;
	private String promptMessage;
	private Inputs input;
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getBirthMonth() {
		return birthMonth;
	}
	
	public String getFavoriteColor() {
		return favoriteColor;
	}
	
	public int getNumSiblings() {
		return numSiblings;
	}

	public UserData() {
		input = new Inputs();
		setFirstName();
		setLastName();
		setAge();
		setBirthMonth();
		setFavoriteColor();
		setNumSiblings();
	}

	private void setFirstName() {
		promptMessage = "Please enter your First Name: ";
		String name = input.promptUserToGetString(promptMessage);
		firstName = name.substring(0,1).toUpperCase() + name.substring(1);
	}
	
	private void setLastName() {
		promptMessage = "Please enter your Last Name: ";
		String name = input.promptUserToGetString(promptMessage);
		lastName = name.substring(0,1).toUpperCase() + name.substring(1);
	}
	
	private void setAge() {
		promptMessage = "Please enter your age: ";
		age = input.promptUserToGetNumber(promptMessage);
	}
	
	private void setBirthMonth() {
		promptMessage = "Please enter your birth month in digit form (January = 1, etc): ";
		birthMonth = input.promptUserToGetNumber(promptMessage);
	}
	
	private void setFavoriteColor() {
		promptMessage = "Please enter your favorite ROYGBIV color.  (Enter 'help' for more info): ";
		String helpMessage = "ROYGBIV colors are red, orange, yellow, green, blue, indigo, and violet.\n";
		favoriteColor = input.promptUserToGetString(promptMessage, helpMessage);
	}
	
	private void setNumSiblings() {
		promptMessage = "Please enter the number of siblings you have: ";
		numSiblings = input.promptUserToGetNumber(promptMessage);
	}
	
	public String toString() {
		return "firstName: " + firstName + ", lastName: " + lastName + ", age: " + age 
				+ ", birthMonth: " + birthMonth + ", favoriteColor: " + favoriteColor
				+ ", numSiblings: " + numSiblings;
	}
}
