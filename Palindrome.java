import java.util.*;
import java.io.*;

public class Palindrome {
public static void main(String args[]) {
	Scanner s =new Scanner(System.in);
	String input = s.next();
	int count = input.length();
	for ( int i=0;i<input.length();i++) {
		for (int j=i+2;j<=input.length();j++) {
			String sub = input.substring(i, j);
			String rev = "";
			for (int k=sub.length()-1;k>=0;k--) {
				rev = rev + sub.charAt(k);
			}
			if(sub.equals(rev)) {
				count = count + 1 ;
			} 
		}
	}
	System.out.println(count);
}
}
