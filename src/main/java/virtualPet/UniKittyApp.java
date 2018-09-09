package virtualPet;

import java.util.Scanner;

public class UniKittyApp {

	public static void main(String[] args) {
		UniKitty unikitty = new UniKitty();
		Scanner input = new Scanner(System.in);
		
		System.out.println(unikitty.showPositivity());
	}

}
