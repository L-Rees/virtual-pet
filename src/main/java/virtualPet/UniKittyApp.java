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
				compliment();
				String compliment = input.nextLine();
				System.out.println("\n\n\n");
				unikitty.complimentResponse(compliment);
			}else if (menuChoice.equals("2")) {
				System.out.println("What would you like to feed your sweet little adorable UniKitty?");
				System.out.println("1 a can of tuna");
				System.out.println("2 a rainbow sparkle cupcake");
				System.out.println("3 a mouse");
				String foodChoice = input.nextLine();
				System.out.println("\n\n\n");
				unikitty.feed(foodChoice);
			} else if (menuChoice.equals("3")) {
				unikitty.beVain();
			}
			unikitty.tick();
			unikitty.reaction();
			unikitty.getStatus();
		}
		unikitty.beExiting();
		input.close();
	}

	public static void compliment() {
		System.out.println("What compliment would you like to use?");
		System.out.println("1 UniKitty, you're so lovely you make my heart happy!");
		System.out.println("2 You're very well preserved for your age.");
		System.out.println("3 It's so refreshing to meet someone who doesn't care how they look!");
		System.out.println("4 You're like a beautiful painting made of magic and sparkles!");
		System.out.println("5 Good UniKitty!");
		System.out.println("6 I think you're almost as cool as Emmett.");
	}

}
