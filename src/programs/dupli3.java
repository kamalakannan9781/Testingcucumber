package programs;

import java.util.ArrayList;

public class dupli3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "kamakam";
		StringBuilder sb = new StringBuilder();
        sb.append(str);
		char cha[]=str.toCharArray();
		
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				
				if(cha[i]>cha[j])
				{
					System.out.println(sb.deleteCharAt(j));
				}
			}
		}
		for(int k=0;k<cha.length;k++)
		{
			System.out.println("value after removing is :"+cha[k]);
		}
	}

}
