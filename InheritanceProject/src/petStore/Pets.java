package petStore;

public class Pets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		pet mypet = new pet(1, "Mickey", "21/06/2019", false, 300);
		
		Dog myDog  = new Dog (2, "Pluto", "21/06/2019", false, 300);
		
		System.out.println(mypet.toString());
		System.out.println(myDog.toString());
		System.out.println(myDog.feedingInstructions());
		
		
		
		
		
	}

}
