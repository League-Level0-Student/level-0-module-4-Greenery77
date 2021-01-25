package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class DoubleTestScores {
public static void main(String[] args) {
	
	// 1. Write code to ask the user for their test score. 
	
	String testScore = JOptionPane.showInputDialog(null, "What score did you get on your test?");
	
	double testScoreInt = Double.parseDouble(testScore);
	
	// 2. Write code to ask the user for their test score. 
	
	if (testScoreInt >= 70) {
	
	JOptionPane.showMessageDialog(null, "Wow! Thats a great score.");
	
	}
	
	else if (testScoreInt < 70 && testScoreInt > 30) {
		
	JOptionPane.showMessageDialog(null, "Umm you might want to study for the next test or something.");
	
	}
	
	else {
		
	JOptionPane.showMessageDialog(null, "You're either failing on purpose or you really dont get it.");
	
	}
	
}
	
	
}
