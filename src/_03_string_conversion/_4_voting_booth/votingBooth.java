package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class votingBooth {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("How old are you in years");
		
		int heightToRide = Integer.parseInt(input);
		if (heightToRide > 17) {
			String yeet = JOptionPane.showInputDialog( "You may vote for Jack or jill.");
		JOptionPane.showMessageDialog(null, "well to bad, " + yeet + " lost");
		}
		else {
			JOptionPane.showMessageDialog(null, "Nobody cares what you think");
		
		}
	}}
