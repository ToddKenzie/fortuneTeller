

public class FortuneTellerMain {

	public static void main(String[] args) {
		
		UserData user = new UserData();
		TellFortune teller = new TellFortune(user.getAge(), user.getNumSiblings(), 
				user.getFavoriteColor(), user.getBirthMonth());
		
//		System.out.println(user);
//		System.out.println(teller);
		
		System.out.println(teller.fortuneTold(user.getFirstName(), user.getLastName()));
		
	}
}
