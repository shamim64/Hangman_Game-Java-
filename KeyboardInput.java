import java.util.Scanner;

public class KeyboardInput extends Keyboard {
	
		public KeyboardInput()
		{
			super();
		}  
	   
		public void keyChosen(String key)
		{
			keyList.add(key);
		} 
	  
		public boolean hasBeenChosen(String key)
		{
			chosen = keyList.contains(key);
			return chosen;
		}   
	   
		public char getNewLetter() 
		{
				   
			char a;
			boolean chosen;
			String aTmp;  
			
			do
			{   
				System.out.println("Enter a Letter: ");
				Scanner scan = new Scanner(System.in);
				a = scan.next().charAt(0); 				
				aTmp = "" + a;
				chosen = hasBeenChosen(aTmp);
				if(!chosen)
					keyChosen(aTmp);
				else
				{   
					System.out.println("You've already used that one. Please enter a new Letter");
	               
				}	           
	                       
	        }
	      
			while(chosen);
			
			return a;  
		}

}
