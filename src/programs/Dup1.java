package programs;

import java.util.Scanner;

public class Dup1 {

	public static void main(String[] args) {
        String str;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the string");

        str=s.nextLine();
        String result="";
        char c=str.charAt(0);
        result=result+c;

        for(int i=1; i<str.length(); i++) {
            char d = str.charAt(i);
            for(int j=0; j<i+1; j++) {
                if(d != result.charAt(j)) {
                    result=result+d;
                }
            }
         }
         System.out.println(result);
    }


}
