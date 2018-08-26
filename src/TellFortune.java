

import java.text.NumberFormat;
import java.util.Locale;

public class TellFortune {
	
	private double bankBalance;
	private String vacationHome;
	private String transportation;
	private int yearsToRetirement;
	private NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.US);
	
	public TellFortune(int age, int numSiblings, String favoriteColor, int birthMonth) {
		setYearsToRetirement(age);
		setVacationHome(numSiblings);
		setTransportation(favoriteColor);
		setBankBalance(birthMonth);
	}

	public String toString() {
		return "yearsToRetirement: " + yearsToRetirement + ", vacationHome: " + vacationHome
				+ ", transportation: " + transportation + ", bankBalance: " + bankBalance;
	}
	
	public String fortuneTold(String firstName, String lastName) {
		System.out.println("Your Fortune:");
		String output = firstName + " " + lastName + " will retire in " + yearsToRetirement;
		output += " years with " + currency.format(bankBalance) + " in the bank, ";
		output += "a vacation home in " + vacationHome + ", and travel by " + transportation + ".";
		return output;
	}
	
	private void setYearsToRetirement(int age) {
		if (age % 2 == 0) {
			yearsToRetirement = 25;
		} else {
			yearsToRetirement = 30;
		}
	}
	
	private void setVacationHome(int numSiblings) {
		if (numSiblings < 0) {
			vacationHome = "Detroit, Michigan";
		} else if (numSiblings == 0) {
			vacationHome = "Munich, Germany";
		} else if (numSiblings == 1) {
			vacationHome = "Orlando, Florida";
		} else if (numSiblings == 2) {
			vacationHome = "Paris, France";
		} else {
			vacationHome = "Osaka, Japan";
		}
	}
	
	private void setTransportation(String favoriteColor) {
		switch (favoriteColor.toLowerCase()) {
		case "red":
			transportation = "Ferrari";
			break;
		case "orange":
			transportation = "Mini Cooper";
			break;
		case "yellow":
			transportation = "schoolbus";
			break;
		case "green":
			transportation = "Smart Car";
			break;
		case "blue":
			transportation = "sailboat";
			break;
		case "indigo":
			transportation = "private jet";
			break;
		case "violet":
			transportation = "Dodge Viper";
			break;
		default:
			transportation = "motor scooter";
		}
	}
	
	private void setBankBalance(int birthMonth) {
		bankBalance = 0;
		switch (birthMonth) {
		case 9:
			bankBalance += 50.50;
		case 1:
			bankBalance += 96.95;
		case 3:
			bankBalance += 303030.30;
		case 6:
			bankBalance += 9876.54;
		case 4: 
			bankBalance += 22244.44;
		case 11:
			bankBalance += 79252.53;
		case 8:
			bankBalance += 10503.01;
		case 5:
			bankBalance += 12345.67;
		case 7:
			bankBalance += 512021.5;
		case 2:
			bankBalance += 752.11;
		case 10: 
			bankBalance += 842551.36;
		case 12:
			bankBalance += 1925364.75;
			break;
		default:
			break;
		}
		
	}	
	
}
