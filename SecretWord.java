
public class SecretWord extends Word {
	
	public SecretWord()
	{
		super();
	}
	public String getClue()
	{
		return clue;
	}
	
	public String toString()
	{
		return visible;
	}
	
	public boolean update(char c)
	{
		char[] secretArray = new char[secret.length()];
        char[] visibleArray = new char[secret.length()];
        String s="";
        boolean contains=false;        
        
        for(int i=0;i<secret.length();i++)
        {
            secretArray[i]=secret.charAt(i);
            visibleArray[i]=visible.charAt(i);
        }        
       
        for(int k=0;k<secret.length();k++)
        {
            
            if(secretArray[k]==c)
            {
                visibleArray[k]=c;
                contains=true;
            }
        }
       
        for(int m=0;m<secret.length();m++)
        {
            s=s+visibleArray[m];
        }
        visible=s;
        
        return contains;
	}
	
	public boolean isSolved()
	{
		return secret.equalsIgnoreCase(visible);
	}	

}
