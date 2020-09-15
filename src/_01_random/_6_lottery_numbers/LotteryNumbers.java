package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
public static void main(String[] args) {
	
	Random randomMaker = new Random();
	int randomNumber = randomMaker.nextInt(6);
	Random randomMoker = new Random();
	int RN2 = randomMoker.nextInt(100);
	Random randomMuker = new Random();
	int RN3 = randomMuker.nextInt(100);
	Random randomMiker = new Random();
	int RN4 = randomMiker.nextInt(100);
	Random randomMpker = new Random();
	int RN5 = randomMpker.nextInt(100);
	Random randomMyker = new Random();
	int RN6 = randomMyker.nextInt(100);
	Random randomMxker = new Random();
	int RN7 = randomMxker.nextInt(100);
	
JOptionPane.showMessageDialog(null, "Your lottery number is "+ RN2 + ", " + RN3 + ", " + RN4 + ", " + RN5 + ", "+ RN6 + ", " + RN7 );
			
	
	
if (RN2 == 28 && RN3 == 99 && RN3 == 1 && RN4 ==1 && RN5 ==21&& RN6 ==99&& RN7 ==34) {
	JOptionPane.showMessageDialog(null, "You Won!!!!!!!!!!!!!!!!!!!!!!!!!\n!!!!!!!!!!!");
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}}
