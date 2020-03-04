
public abstract class Word {
	
	 String clue, visible, secret;
	 
	 public Word()
	 {
	     String [] wordList = {"jackfruit", "java", "cse215l","13"};	     
	     String [] clueList = {"National Fruit: ", "Course Title: ", "Course Code: ","Course Section: "};
	     
	     int rand = (int)(Math.random()*4);
	     secret = wordList[rand];
	     clue = clueList[rand];
	     int wordLength = secret.length();	     
	     visible = "";
	    
	     for(int i=0;i<secret.length();i++)
	     {
	         char c = secret.charAt(i);	         
	         if (c ==' ')
	             visible+=c;
	         else
	             visible+='_';
	     }
	 }

	 public abstract String getClue();
	 public abstract String toString();	     
	 public abstract boolean update(char c);	     
	 public abstract boolean isSolved();	     

}
