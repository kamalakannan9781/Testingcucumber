package programs;

public class duplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="kamkkl";	
        String[] words=input.split("");
        for(int i=0;i<words.length;i++)
        {
        	if(words[i]!=null)
        	{
        		for(int j=i+1;j<words.length;j++)
        		{
        			System.out.println("words[i] value :"+words[i]);
        			System.out.println("words[j] value :"+words[j]);
        			if(words[i].equalsIgnoreCase(words[j]))
        			{
        				words[j]=" ";
        			}
        			System.out.println();
        		}
        	}
        }
        for(int k=0;k<words.length;k++)
        {
        	System.out.println(words[k]);
        }
	}

}
