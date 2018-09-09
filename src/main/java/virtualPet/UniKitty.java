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
		this.beautyLevel = 4;
		this.hungerLevel = 4;
		this.positivityLevel = 4;
		this.boredomLevel = 1;
	}

	public void feed() {
		System.out.println("What would you like to feed your sweet little adorable UniKitty?");
		System.out.println("1 a can of tuna");
		System.out.println("2 a rainbow sparkle cupcake");
		System.out.println("3 a mouse");
		String foodChoice = input.nextLine();
		if (foodChoice.equals("1")) {
			beBored();
			beHungry();
		} else if (foodChoice.equals("2")) {
			hungerLevel -= 3;
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
		boredomLevel -= 2;
	}

	public void tick() {
		hungerLevel += 2;
		if ((int) (Math.random() * 3) + 1 == 1) {
			primping();
		} else {
			boredomLevel += 2;
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
			beUnPositive();
		} else {
			beBored();
			boredomLevel += 3;
		}

	}

	public void reaction() {

	}
	
	public String showPositivity() {
		return ("Bad-" + showLevel(getPositivityLevel()) + "-Great!");
	}
	
	public String showLevel(int quality) {
		String level = "";
		for (int i = 0; i < quality; i++ ) {
			level += "|";
		}
		for (int i = 0; i< 10-quality; i--) {
			level += ".";
		}
		return level;
				
				
	}

	public String getStatus() {
		return "Positive Thinking " + getPositivityLevel() + "\nTummy Grumbles" + gethungerLevel() + "\nYawn Factor"
				+ getBoredomLevel() + "\nBeauty" + getBeautyLevel();
	}

	public void beOffended() {
		// ASCII art
		System.out.println("I can't believe you think I'd appreciate that! As if!");
	}

	public void beInsulted() {
		// art
		System.out.println("I can't even look at you right now! How could you say that to me?!");
	}

	public void beHungry() {
		// ASCII art
		System.out.println("My tummy is so rumbly! It's making me think unpositive thoughts! That's just a drag!");
	}

	public void beBored() {
		// art
		System.out.println("Meow? Sigh.");
	}

	public void bePretty() {
		// ASCII art
		System.out.println("Sometimes I think I could spend ALL DAY just looking at myself in the mirror!");
	}

	public void bePrimped() {
		// ASCII art
		System.out.println(
				"I'm so naturally lovely and charming, it's hard work to do myself justice.\nLuckily I'm also a natural genius!");
	}

	public void beUnPositive() {
		// ASCII art
		System.out.println(
				"It's hard work being me, and you're not helping matters any! I'm losing my natural positivity!");
	}

	public void beVain() {
		// ASCII art
		System.out.println("I'm glad you recognize even a little of how amazing I truly am!");
	}

	public void beAngry() {
		// ASCII art
		System.out.println(
				"I'm just so angry with you right now! Why are you such a meanie?? This pout is going to give me wrinkles!");
	}

	public void beVeryAngry() {
		// ASCII art
		System.out.println(
				"I don't think I can take much more of this terrible treatment! \nYou'd better shape up, mister, or I'll have to take things into my own hands!");
	}

	public void beRunningAway() {
		// ASCII art
		System.out.println("I think I've been very patient with you, but this is the last straw! I'm leaving!");
		System.out.println("\n\n\n\n\n\nUniKitty has run away. I hope you're proud of yourself.");
		System.exit(0);
	}

}
