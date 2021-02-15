package _03_char._3_pi_aloud;

import java.io.IOException;
import java.util.Scanner;

public class PiAloud {
	/***********  SOUND ***************
	 * Some computers are unable to play sounds. 
	 * If you cannot play sound on this computer, set canPlaySounds to false.
	 * If you are not sure, ask your teacher 
	 * *****************/
	boolean canPlaySounds = false;
	
	// 1. Make a main method and make sure your program can run

	public static void main(String[] args) {
		
	// 2. Make a String variable to hold 20 digits of Pi. You could use http://www.piday.org/million/ to get this.

		String piDigits = "3.1415926535897932384";
	

		for (int i = 0; i < piDigits.length(); i++) {
			
		char userInput = getInputFromUser();
		
		System.out.println(piDigits.charAt(i));
		
		if (userInput == piDigits.charAt(i)) {
			
		System.out.println("Correct.");
			
		}
		
		else System.out.println("Incorrect.");
		
		}
		
	// 4. Print ALL the digits of the Pi String, putting each digit on a new line  (hint: use a loop)

	// 5. Skip this step if your computer cannot play sounds. 
	//		if (canPlaySounds) {
	//				 Use the speak() method to speak each digit of Pi.   
	//		}
	
	
	// [CHALLENGE]
	// *6. Get a character from the user using the getInputFromUser() method
	// *7. Compare the user's char to the next digit of Pi
	// *8. If they are correct, print out "correct". If they are not, print "incorrect" 
	
	
	}
	
	/********************  Use these methods. DON'T CHANGE THE CODE BELOW  ******************/

	static void speak(char characterToSpeak) {
		
		if (System.getProperty("os.name").contains("Windows")) {
			String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
					+ characterToSpeak + "');\"";
			try {
				Runtime.getRuntime().exec(cmd).waitFor();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			try {
				Runtime.getRuntime().exec("say " + characterToSpeak).waitFor();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private static void pause(int seconds) {
		try {
			Thread.sleep(1000 * seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	static char getInputFromUser() {
		Scanner scanner = new Scanner(System.in);
		return scanner.next().toCharArray()[0];
	}

}


