//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _01_random._5_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below
public static void main(String[] args) {
	

	// 2. Get the user to enter a question for the 8 ball to answer
	String input = JOptionPane.showInputDialog("Ask the magic 8 ball a yes or no question?");
	// 3. Make a variable and initialize it to a random number.
	//     ** You will need to make a random object!
	//     Limit the random numbers to be between 0 and 3

	Random randomMaker = new Random();
	
	int randomNumber = randomMaker.nextInt(5);
	
	

	int life;
life = new Random().nextInt(4);
	System.out.println(randomNumber);
	int randomChoice = life;
	if (randomChoice == 0) {
		JOptionPane.showMessageDialog(null, "YES");
	}
	if (randomChoice == 1) {
		JOptionPane.showMessageDialog(null, "NO");
	}
		if (randomChoice == 2) {
		JOptionPane.showMessageDialog(null, "MAYBE YOU SHOULD ASK GOOGLE?");
		}
		if (randomChoice == 3) {
			JOptionPane.showMessageDialog(null, "I HOPE NOT?");
		}
   
		
		
	// 4. If the random number is 0
	
	// -- tell the user "Yes"

	// 5. If the random number is 1

	// -- tell the user "No"

	// 6. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

	// 7. If the random number is 3

	// -- write your own answer

	}
}