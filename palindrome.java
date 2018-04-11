/*--------------------------------------------------------------------------------------*/
/*  palindrome.java  -  Palindromes 101                                              */
/*                                                                                      */
/*--------------------------------------------------------------------------------------*/
/*  Author:  Kshitij Shah                                                               */
/*  Date:    March 8 2017                                                               */
/*--------------------------------------------------------------------------------------*/
/*  Input:   String                                                                     */
/*  Output:  Y/N if palindrome                                                          */
/*--------------------------------------------------------------------------------------*/

import java.io.*;
import java.util.*;
import java.text.*;

public class palindrome {

    static boolean pal(String a, int b, int c) {
	if (c <= 1) {
	    return true;
	} else if (a.charAt(b) == a.charAt(c - 1)) {
	    boolean pali;
	    if (b > c) {
		return true;
	    }
	    return pali = pal (a, b + 1, c - 1);
	} else {
	    return false;
	}
    }


    public static void main (String str[]) throws IOException
    {
	BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
	
	System.out.println("Palindrome Checker: Enter a non-empty String:");
	System.out.print("What is the string you want to test?:  ");
	String a = stdin.readLine();
	int b = 0, c = a.length();
	if (pal(a, b, c) == true) {
	    System.out.println ("String is palindrome");
	} else {
	    System.out.println ("String is not palindrome");
	}
    }
}

