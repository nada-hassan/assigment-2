package eg.edu.alexu.csd.datastructure.hangman.cs88;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class hangman implements IHangman {
	public int size = 62;
	int m;
   public  String word = selectRandomSecretWord();
	
	public void readfile (String r[]) {
		try{ BufferedReader br = new BufferedReader(new FileReader("dictionary.txt"));
	    String line = br.readLine();
	    int i=0;
		while (line != null && i < size){
			
			r[i]= line;
			line = br.readLine();
			i++;
	    }br.close();
		}
     catch (IOException e) {
    	 e.printStackTrace();
     }
	}
	
	
	public void setDictionary(String[] words) {
		readfile(words);

}
	
		
	public String selectRandomSecretWord() {
		 String words[] = new String [size];
		 setDictionary(words);
		 Random rand = new Random();
		 return words[rand.nextInt(size)]; 
		
	}
	

	public String guess(Character c) throws Exception{
		int i=0;
		int j=0;
	
		int length = word.length();
		char places [] = new char[length];
		String st =new String();
		for(i=0; i < length ; i++) {
			places[i]= '-';
		}
		
		int g=m;
		while(g != 0) {
	    c = Character.toLowerCase(c);
	    if ( c!= null) {	
		for(i=0; i < length ; i++) {
			if (word.charAt(i) == c) {
				places[i] = c;
				j++;
			}	
		}
		if (j==0) {
			g--;
		}	
		j=0;}
       st = new String(places);
       System.out.println(st);
       if(st.contains("-")) { }
		else
	    { System.out.println("you won");
		 break;}
       if(g==0) {
    	   throw new Exception("you lost");
    	  // System.out.println("you lost"); 
    	   //break;
       }
       System.out.println("enter another letter");
       Scanner input= new Scanner(System.in);
       c = input.next().charAt(0);
		
	  
		}
	    
		String fs = new String(places);
	return fs;
	}
		

	public void setMaxWrongGuesses(Integer max) {
	     m= max; 
	}
		}
