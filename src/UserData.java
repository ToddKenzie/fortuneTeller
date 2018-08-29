

public class UserData {
	
	private String firstName;
	private String lastName;
	private int age;
	private int birthMonth;
	private String favoriteColor;
	private int numSiblings;
	private UserInput userDataRequest;
	
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
		userDataRequest = new UserInput();
		setFirstName();
		setLastName();
		setAge();
		setBirthMonth();
		setFavoriteColor();
		setNumSiblings();
	}

	private void setFirstName() {
		userDataRequest.setPromptMessage("Please enter your First Name: ");
		String name = userDataRequest.promptUserToGetString();
		firstName = name.substring(0,1).toUpperCase() + name.substring(1);
	}
	
	private void setLastName() {
		userDataRequest.setPromptMessage("Please enter your Last Name: ");
		String name = userDataRequest.promptUserToGetString();
		lastName = name.substring(0,1).toUpperCase() + name.substring(1);
	}
	
	private void setAge() {
		userDataRequest.setPromptMessage("Please enter your age: ");
		age = userDataRequest.promptUserToGetNumber();
	}
	
	private void setBirthMonth() {
		userDataRequest.setPromptMessage("Please enter your birth month in digit form (January = 1, etc): ");
		birthMonth = userDataRequest.promptUserToGetNumber();
	}
	
	private void setFavoriteColor() {
		userDataRequest.setPromptMessage("Please enter your favorite ROYGBIV color.  (Enter 'help' for more info): ");
		String helpMessage = "ROYGBIV colors are red, orange, yellow, green, blue, indigo, and violet.\n";
		favoriteColor = userDataRequest.promptUserToGetString(helpMessage);
	}
	
	private void setNumSiblings() {
		userDataRequest.setPromptMessage("Please enter the number of siblings you have: ");
		numSiblings = userDataRequest.promptUserToGetNumber();
	}
	
	public String toString() {
		return "firstName: " + firstName + ", lastName: " + lastName + ", age: " + age 
				+ ", birthMonth: " + birthMonth + ", favoriteColor: " + favoriteColor
				+ ", numSiblings: " + numSiblings;
	}
}
