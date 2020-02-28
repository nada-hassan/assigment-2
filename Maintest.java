package eg.edu.alexu.csd.datastructure.hangman.cs88;

import java.util.Scanner;

class Maintest {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		hangman obj = new hangman();	
	  System.out.println("enter a letter");
	Scanner input = new Scanner(System.in);
    char m;
	m = input.next().charAt(0);
	obj.setMaxWrongGuesses(8);
    try {
		obj.guess(m);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}