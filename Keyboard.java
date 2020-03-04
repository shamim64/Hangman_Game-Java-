import java.util.ArrayList;

public abstract class Keyboard {
	
	 ArrayList<String> keyList ; 
	    boolean  chosen;	    
	    
	    public Keyboard()
	    {
	        keyList = new ArrayList<String>();
	    }	    
	   
	    public abstract void keyChosen(String key);	   
	    public abstract boolean hasBeenChosen(String key); 	    
	    public abstract char getNewLetter();	                        
    
}
