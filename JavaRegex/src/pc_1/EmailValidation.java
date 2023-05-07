package pc_1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
public class EmailValidation {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the email");
		String str=scanner.next();
		
		Pattern pattern=Pattern.compile("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$");
	    Matcher macher = pattern.matcher(str);
	    System.out.println(macher.matches());

	    if(macher.matches()) {
	    	System.out.println("Entered email is vailed");
	    }
	    else {
	    	System.out.println("Pls entered valid email");
	    }

	}

}
