package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have

	String nickelAmount = JOptionPane.showInputDialog("How many nickels do you have?");
		
		// Convert their answer to an int.   Hint: Integer.parseInt()  

	int nickelNumber = Integer.parseInt(nickelAmount);
	
		// Ask the user how many dimes they have, and convert their answer

	String dimesAmount = JOptionPane.showInputDialog("How many dimes do you have?");
	
	int dimesNumber = Integer.parseInt(dimesAmount);	
	
		// Ask the user how many quarters they have, and convert their answer

    String quartersAmount = JOptionPane.showInputDialog("How many quarters do you have?");
	
	int quartersNumber = Integer.parseInt(quartersAmount);	
	
		// Calculate how much money the user has.  Hint: Use a double variable 

	double totalAmount = quartersNumber * .25; 
	totalAmount += dimesNumber * .10;
	totalAmount += nickelNumber * .05;
	
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)

	JOptionPane.showMessageDialog(null, "In total, you have $" + totalAmount);
	
	}
}

