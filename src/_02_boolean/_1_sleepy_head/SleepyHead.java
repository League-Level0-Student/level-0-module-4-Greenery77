package _02_boolean._1_sleepy_head;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class SleepyHead {

	public static void main(String[] args) {

		// boolean variables can only hold one of two values - true or false

		/************************  SLEEPY HEAD  **************************/
		boolean isWeekend = false;
		// Write code to ask the user what day it is.
        
		String whatDay = JOptionPane.showInputDialog(null, "What day is it?");
		
		// Set the boolean isWeekend based on the value they enter
		
		if (whatDay.equalsIgnoreCase("saturday") || whatDay.equalsIgnoreCase ("sunday")){
			
		isWeekend = true;
		
	
			
		}
		
		// If it is the weekend, tell the user they get to sleep in.
		
		if (isWeekend){
			
		JOptionPane.showMessageDialog(null, "Congrats. Sleep in :) ");
			
		}
		
		// If it is not the weekend, tell them to get out of bed and go to school!
		
		else {
			
		JOptionPane.showMessageDialog(null, "Remember to go to school and wake up early.");
			
		}
		
		/************************   STAR STUDENT  **************************/

		boolean passedExam;
		passedExam = false;
		// Write code to ask the user what percentage they scored in their last exam

		String examScore = JOptionPane.showInputDialog(null, "What score did you get on your most recent exam?");
		int examScoreInt = Integer.parseInt(examScore);
		
		// If they scored more than 70, they passed the exam.
		// Set the boolean passedExam based on their score.
		
		if (examScoreInt >= 70 ) {
			
		passedExam = true;
			
		}

		
		// If the user passed the exam, congratulate them
		
		if (passedExam){
		
		JOptionPane.showMessageDialog(null, "Great job!");
			
		}
		
		// otherwise, wish them better luck next time.
		
		else {
			
		JOptionPane.showMessageDialog(null, "Better luck next time.");
			
		}
		
		/************************  GAME OVER  **************************/

		boolean gameIsOver = false;
		// This code will repeat until gameIsOver is changed to true
		while (!gameIsOver) {
			// Ask the user if the game is over. 
			
			String gameOver = JOptionPane.showInputDialog("Is the game over?");
			if (gameOver.equalsIgnoreCase("yes")){
				
				gameIsOver = true;
				
			}
			
			// If they answer "yes", change gameIsOver to true

		}
		// Tell the user "game is over" 
		
		JOptionPane.showMessageDialog(null, "The game is over.");
		
		
		/***********************   RED SQUARE  ********************/
		
		boolean isRed = false;
		// Ask the user what color to draw with. Based on their answer, set the isRed variable
		
		String drawColor = JOptionPane.showInputDialog("What color do you want to draw with?");
		
		if (drawColor.equalsIgnoreCase("Red")) {
			
		isRed = true;
			
		}
	
		boolean isSquare = false;
		// Now ask the user what shape to draw. Based on their answer, set the isSquare variable
	
		String whatShape = JOptionPane.showInputDialog("What shape do you want to draw?");
		
		if (whatShape.equalsIgnoreCase("Square")) {
			
		isSquare = true;
			
		}
		
		if (isSquare && isRed) {
			
		drawRedSquare();
			
		}
		
		// Now you MUST use the && operator to join the booleans for this code. 
		// Ask your teacher if you are not sure how
		// Use an if statement to ONLY draw a red square when it has been requested (use the method below)
		// otherwise, tell the user you don't know how to draw that shape
		

	}

	
	static void drawRedSquare() {
		Robot rob = new Robot();
		// Complete the rest of this method
		
		rob.hide();
		rob.penDown();
		rob.setPenColor(255, 0, 0);
		rob.setSpeed(120);
		
		for (int i = 0; i < 4; i++) {
		
		rob.move(50);
		rob.turn(90);
			
		}
	}	
}