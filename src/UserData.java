

public class UserData {
	
	private String firstName;
	private String lastName;
	private int age;
	private int birthMonth;
	private String favoriteColor;
	private int numSiblings;
	private String prompt;
	private Inputs input;
	
	public UserData() {
		input = new Inputs();
		setFirstName();
		setLastName();
		setAge();
		setBirthMonth();
		setFavoriteColor();
		setNumSiblings();
	}

	public String toString() {
		return "firstName: " + firstName + ", lastName: " + lastName + ", age: " + age 
				+ ", birthMonth: " + birthMonth + ", favoriteColor: " + favoriteColor
				+ ", numSiblings: " + numSiblings;
	}
	
	private void setFirstName() {
		prompt = "Please enter your First Name: ";
		String name = input.getString(prompt);
		firstName = name.substring(0,1).toUpperCase() + name.substring(1);
	}
	
	private void setLastName() {
		prompt = "Please enter your Last Name: ";
		String name = input.getString(prompt);
		lastName = name.substring(0,1).toUpperCase() + name.substring(1);
	}
	
	private void setAge() {
		prompt = "Please enter your age: ";
		age = input.getNumber(prompt);
	}
	
	private void setBirthMonth() {
		prompt = "Please enter your birth month in digit form (January = 1, etc): ";
		birthMonth = input.getNumber(prompt);
	}
	
	private void setFavoriteColor() {
		prompt = "Please enter your favorite ROYGBIV color.  (Enter 'help' for more info): ";
		String help = "ROYGBIV colors are red, orange, yellow, green, blue, indigo, and violet.\n";
		favoriteColor = input.getString(prompt, help);
	}
	
	private void setNumSiblings() {
		prompt = "Please enter the number of siblings you have in digit form: ";
		numSiblings = input.getNumber(prompt);
	}
	
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
}
