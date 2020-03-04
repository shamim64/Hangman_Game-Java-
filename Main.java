import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);        
	    int totalMistake = 0;
	    boolean b = false;
	    
	    showWelcome();
	    SecretWord word = new SecretWord();
	    System.out.println("Your clue: " + word.getClue());
	    KeyboardInput input = new KeyboardInput();
	    while (totalMistake < 7 && !word.isSolved())
	    {
	        System.out.println(word);
	        char c = input.getNewLetter();
	        if (!word.update(c))
	            totalMistake = totalMistake +1;
	        System.out.println("You already had "+ totalMistake + " mistakes");	        
	        mistake(totalMistake);	        
	    }
	    
	    if (word.isSolved())
	        System.out.println(word+"\nGreat, you have done it.");
	    else{ 
			System.out.println("Sorry, you've reached to your maximum number of incorrect guesses. GAME OVER!");
	    }
	    
	}
	     
	public static void showWelcome()
    {
        System.out.println( "Welcome to Hangman Game !!!" );
    }	
		
	public static void mistake(int totalMistake)
	{
		if (totalMistake == 1) { 
			System.out.println("         ____________");
			System.out.println("        |      |     |");
			System.out.println("        |            |");
			System.out.println("        |            |");
			System.out.println("        |            |");
			System.out.println("       	|            |");
			System.out.println("         ____________");
			System.out.println("");
		} else if (totalMistake == 2) { 
			System.out.println("         ____________");
			System.out.println("        |      |     |");
			System.out.println("        |      O     |");
			System.out.println("        |            |");
			System.out.println("        |            |");
			System.out.println("       	|            |");
			System.out.println("         ____________");
			System.out.println("");
		} else if (totalMistake == 3) { 
			System.out.println("         ____________");
			System.out.println("        |      |     |");
			System.out.println("        |      O     |");
			System.out.println("        |      |     |");
			System.out.println("        |            |");
			System.out.println("       	|            |");
			System.out.println("         ____________");
			System.out.println("");
		} else if (totalMistake == 4) { 
			System.out.println("         ____________");
			System.out.println("        |      |     |");
			System.out.println("        |      O     |");
			System.out.println("        |     -|-    |");
			System.out.println("        |            |");
			System.out.println("       	|            |");
			System.out.println("         ____________");
			System.out.println("");
		} else if (totalMistake == 5) { 
			System.out.println("         ____________");
			System.out.println("        |      |     |");
			System.out.println("        |      O     |");
			System.out.println("        |     -|-    |");
			System.out.println("        |      |     |");
			System.out.println("       	|            |");
			System.out.println("         ____________");
			System.out.println("");
		}
		else if (totalMistake == 6) { 
			System.out.println("         ____________");
			System.out.println("        |      |     |");
			System.out.println("        |      O     |");
			System.out.println("        |     -|-    |");
			System.out.println("        |      |     |");
			System.out.println("       	|     /      |");
			System.out.println("         ____________");
			System.out.println("");
		}
		else if (totalMistake == 7) {
			System.out.println("         ____________");
			System.out.println("        |      |     |");
			System.out.println("        |      O     |");
			System.out.println("        |     -|-    |");
			System.out.println("        |      |     |");
			System.out.println("       	|     / \\    |");
			System.out.println("         ____________");
			System.out.println("");
		}
		
	}

}
