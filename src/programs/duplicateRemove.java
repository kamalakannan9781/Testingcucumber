package programs;

import java.util.LinkedHashSet;
import java.util.Set;

public class duplicateRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="kkaammaall";
		char[] chars=str.toCharArray();
		Set<Character> charset=new LinkedHashSet<Character>();
		for(char c:chars)
		{
			charset.add(c);
		}
		StringBuilder sb = new StringBuilder();
		for(Character character:charset)
		{
			sb.append(character);
		}
		System.out.println(sb.toString());
				

	}

}
