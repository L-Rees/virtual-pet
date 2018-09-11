package virtualPet;

import java.util.Scanner;

public class UniKitty {

	Scanner input = new Scanner(System.in);

	private String name;
	private int beautyLevel;
	private int hungerLevel;
	private int positivityLevel;
	private int boredomLevel;

	public String getName() {
		return name;
	}

	public int gethungerLevel() {
		return hungerLevel;
	}

	public int getBoredomLevel() {
		return boredomLevel;
	}

	public int getPositivityLevel() {
		return positivityLevel;
	}

	public int getBeautyLevel() {
		return beautyLevel;
	}

	public UniKitty(String name, int beautyLevel, int hungerLevel, int positivityLevel, int boredomLevel) {
		this.name = name;
		this.beautyLevel = beautyLevel;
		this.hungerLevel = hungerLevel;
		this.positivityLevel = positivityLevel;
		this.boredomLevel = boredomLevel;

	}

	public UniKitty() {
		this.name = "UniKitty";
		this.beautyLevel = 2;
		this.hungerLevel = 1;
		this.positivityLevel = 2;
		this.boredomLevel = 2;
	}

	public void feed() {
		System.out.println("What would you like to feed your sweet little adorable UniKitty?");
		System.out.println("1 a can of tuna");
		System.out.println("2 a rainbow sparkle cupcake");
		System.out.println("3 a mouse");
		String foodChoice = input.nextLine();
		System.out.println("\n\n\n");
		if (foodChoice.equals("1")) {
			beBored();
			beHungry();
		} else if (foodChoice.equals("2")) {
			hungerLevel -= 5;
			beVain();
		} else {
			hungerLevel += 1;
			beHungry();
			beUnPositive();
		}

	}

	// Unikitty chooses to do this
	public void primping() {
		bePrimped();
		beautyLevel += 3;
		positivityLevel += 2;
		boredomLevel -= 3;
	}

	public void tick() {

		hungerLevel += 2;
		if ((int) (Math.random() * 3) + 1 == 1) {
			System.out.println("Unikitty decided to do a little primping!");
			primping();
		} else {
			boredomLevel += 1;
		}
		try {
			Thread.sleep(3500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void compliment() {
		System.out.println("What compliment would you like to use?");
		System.out.println("1 UniKitty, you're so lovely you make my heart happy!");
		System.out.println("2 You're very well preserved for your age.");
		System.out.println("3 I can barely tell you're so tired!");
		System.out.println("4 You're like a beautiful painting made of magic and sparkles!");
		System.out.println("5 Good UniKitty!");
		System.out.println("6 I think you're almost as cool as Emmett.");
		String compliment = input.nextLine();
		System.out.println("\n\n\n");

		if (compliment.equals("1") || compliment.equals("4")) {
			beVain();
			positivityLevel += 2;
			boredomLevel -= 3;
		} else if (compliment.equals("2")) {
			beInsulted();
			positivityLevel -= 3;
			boredomLevel += 3;
		} else if (compliment.equals("3")) {
			beOffended();
			positivityLevel -= 3;
			boredomLevel += 3;
		} else if (compliment.equals("6")) {
			beAngry();
			positivityLevel -= 4;
		} else {
			beBored();
			boredomLevel += 3;
		}

	}

	public void reaction() {
		if (gethungerLevel() == 6) {
			System.out.println("I'm hungry!");
			beUnPositive();
		} else if (gethungerLevel() == 7) {
			System.out.println("I'm getting hungrier!");
			beAngry();
		} else if (gethungerLevel() == 8 || gethungerLevel() == 9) {
			System.out.println("You'd better feed me!");
			beHungry();
			beVeryAngry();
		} else if (gethungerLevel() >= 10) {
			beRunningAway();
		} else if (getBoredomLevel() > 7) {
			beBored();
		} else if (getBeautyLevel() > 10) {
			bePrimped();
		} else if (getPositivityLevel() > 10) {
			bePretty();
		}

	}

	public String showPositivity() {
		return ("Positivity:\n    Bad-" + showLevel(getPositivityLevel()) + "-Just Great\n");
	}

	public String showHunger() {
		return ("Hunger:\n   Good-" + showLevel(gethungerLevel())) + "-Starving\n";
	}

	public String showBoredom() {
		return ("Boredom:\nAwesome-" + showLevel(getBoredomLevel())) + "-Yawnsville\n";
	}

	public String showBeauty() {
		return ("Beauty:\n   Uggo-" + showLevel(getBeautyLevel())) + "-An angel\n";
	}

	public String showLevel(int quality) {
		String level = "";
		for (int i = 0; i < quality; i++) {
			level = level + "|";
		}
		for (int i = 0; i < 10 - quality; i++) {
			level = level + ".";
		}
		return level;

		// Bad-||||......-Great!
	}

	public void getStatus() {
		System.out.println(
				"UNIKITTY STATUS:\n" + showPositivity() + showBeauty() + "\n\n" + showHunger() + showBoredom());
	}

	String asciiName = "  _    _       _ _    _ _   _         \n" + " | |  | |     (_) |  (_) | | |        \n"
			+ " | |  | |_ __  _| | ___| |_| |_ _   _ \n" + " | |  | | '_ \\| | |/ / | __| __| | | |\n"
			+ " | |__| | | | | |   <| | |_| |_| |_| |\n" + "  \\____/|_| |_|_|_|\\_\\_|\\__|\\__|\\__, |\n"
			+ "                                 __/ |\n" + "                                |___/ \n";

	public void intro() {
		System.out.println(asciiName);
		bePretty();
		getStatus();
	}

	String catBike = "                 ________________ \n" + "                | You're NOT my  |_____    __ \n"
			+ "                | friend anymore |     |__|  |_________ \n"
			+ "     /\\         |________________| Good|::|  |        / \n"
			+ "   /\\||/\\       |                \\.____|::|__| BYE  <	\n"
			+ "  ( o_o  )_     |                      \\::/  \\._______\\ \n" + "   (u--u   \\_)  | \n"
			+ "    (||___   )==\\ \n" + "  ,dP\"/b/=( /P\"/b\\ \n" + "  |8 || 8\\=== || 8 \n" + "  `b,  ,P  `b,  ,P \n"
			+ "    \"\"\"`     \"\"\"` \n";

	public void beOffended() {

		String saying = "I can't believe you think I'd appreciate that! As if!";
		String offendedCat = "      /\\   \n" + "    /\\|| /\\ \n" + "   (       ) \n" + "   /  >.<  \\ \n"
				+ "   \\__ 0 __/   " + saying + "\n" + "     /   \\  /\n" + "    / ___ \\/ \n" + "    \\/___\\/ \n";
		System.out.println(offendedCat);
	}

	public void beInsulted() {

		String saying = "I can't even look at you right now! How could you say that to me?!";
		String insultedCat = "      /\\   \n" + "    /\\|| /\\ \n" + "   ( <o o> ) \n" + "   /  >.<  \\ \n"
				+ "   \\__ O __/  " + saying + "\n" + "     /   \\  /\n" + "    / ___ \\/ \n" + "    \\/___\\/ \n";
		System.out.println(insultedCat);
	}

	public void beHungry() {

		String saying = "My tummy is so rumbly! It's making me think unpositive thoughts!";
		String hungryCat = "      /\\   \n" + "    /\\|| /\\ \n" + "   (  -  - ) \n" + "   /  >.<  \\ \n"
				+ "   \\__ ~~__/  " + saying + "\n" + "     /   \\  /\n" + "    / ___ \\/ \n" + "    \\/___\\/ \n";
		System.out.println(hungryCat);
	}

	public void beBored() {

		String saying = "Meow? Sigh.";
		String boredCat = "      /\\   \n" + "    /\\|| /\\ \n" + "   ( <o o> ) \n" + "   /  >o<  \\ \n"
				+ "   \\__ ~ __/   " + saying + "\n" + "     /   \\  /\n" + "    / ___ \\/ \n" + "    \\/___\\/ \n";
		System.out.println(boredCat);
	}

	public static void bePretty() {

		String saying = "Sometimes I think I could spend ALL DAY just looking at myself in the mirror!";
		String prettyCat = "      /\\   \n" + "    /\\|| /\\ \n" + "   (  . .  ) \n" + "   /  >.<  \\ \n"
				+ "   \\__\\_/__/  " + saying + "\n" + "     /   \\  / \n" + "    / ___ \\/ \n" + "    \\/___\\/ \n";
		System.out.println(prettyCat);
	}

	public void bePrimped() {

		String saying1 = "I'm so naturally lovely and charming, it's hard work to do myself justice.";
		String saying2 = "Luckily I'm also a natural genius!";

		String primpedCat = "      /\\   \n" + " *  /\\|| /\\  *  \n" + "   (  _  _ ) \n" + "   /  ___  \\   * "
				+ saying1 + "\n" + "   \\__\\_/__/ " + saying2 + "\n" + "  *  /   \\  /\n" + "    / ___ \\/   *\n"
				+ " *  \\/___\\/  *\n";
		System.out.println(primpedCat);
	}

	public void beUnPositive() {

		String saying = "It's hard work being me, and you're not helping matters any! I'm losing my natural positivity!";
		System.out.println(saying);
	}

	public void beVain() {

		String saying = "I'm glad you recognize even a little of how amazing I truly am!";
		String vainCat = "      /\\   \n" + "    /\\|| /\\ \n" + "   (  ^ ^  ) \n" + "   /   }o{ \\ \n"
				+ "   \\__   __/   " + saying + "\n" + "     /   \\  /\n" + "    / ___ \\/ \n" + "    \\/___\\/ \n";
		System.out.println(vainCat);
	}

	public void beAngry() {

		String saying = "I'm just so angry with you right now! Why are you such a meanie??";
		String angryCat = "      /\\   \n" + "    /\\|| /\\ \n" + "   (  \\ /  ) \n" + "   /  o,o  \\ \n"
				+ "   \\__~~~__/  " + saying + "\n" + "     /   \\  /\n" + "    / ___ \\/ \n" + "    \\/___\\/ \n";
		System.out.println(angryCat);
	}

	public void beVeryAngry() {

		String saying = "I don't think I can take much more of this terrible treatment!";
		String saying2 = "You'd better shape up, mister, or I'll have to take things into my own hands!";
		String veryAngryCat = "      /\\   \n" + "    /\\|| /\\ \n" + "   (  \\ /  ) \n" + "   /  o,o  \\ \n"
				+ "   \\__~~~__/   " + saying + "\n" + "     /   \\  /  " + saying2 + "\n" + "    / ___ \\/ \n"
				+ "    \\/___\\/ \n";
		System.out.println(veryAngryCat);
	}

	public void beRunningAway() {

		System.out.println("I think I've been very patient with you, but this is the last straw! I'm leaving!");
		System.out.println(catBike);
		System.out.println("\n\n\n\n\n\nUniKitty has run away. I hope you're proud of yourself.");
		System.exit(0);
	}

	public void beExiting() {
		System.out.println(catBike);
		System.exit(0);
	}
}
