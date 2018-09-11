package virtualPet;

import java.util.Scanner;

public class UniKittyApp {

	public static void main(String[] args) {
		UniKitty unikitty = new UniKitty();
		Scanner input = new Scanner(System.in);
		
		unikitty.intro();
		String menuChoice = "";
		
		while (!menuChoice.equals("4")) {
			System.out.println("What would you like to do with UniKitty?");
			System.out.println("1 Compliment UniKitty");
			System.out.println("2 Offer UniKitty a snack");
			System.out.println("3 Do nothing but stare at UniKitty's loveliness");
			System.out.println("4 Exit the game and leave UniKitty homeless in the digital void");
			menuChoice = input.nextLine();
			System.out.println("\n\n\n");
			if (menuChoice.equals("1")) {
				unikitty.compliment();
			}else if (menuChoice.equals("2")) {
				unikitty.feed();
			}
			
			unikitty.tick();
			unikitty.reaction();
			unikitty.getStatus();
		}
		unikitty.beExiting();
		input.close();
	}

}
