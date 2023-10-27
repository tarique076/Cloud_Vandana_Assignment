package com.pangramCheck;

import java.util.Scanner;

public class PangramCheck {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Enter sentence");
	        String input = sc.nextLine();
	        
	        boolean isPangram = checkPangram(input);
	        
	        if (isPangram) {
	            System.out.println("The input is a pangram.");
	        } else {
	            System.out.println("The input is not a pangram.");
	        }
	        
	        sc.close();
	    }

	    public static boolean checkPangram(String input) {

	    	boolean[] lettersPresent = new boolean[26];
	        

	    	input = input.toLowerCase();
	        
	    	for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);
	            if ('a' <= ch && ch <= 'z') {
	                lettersPresent[ch - 'a'] = true;
	            }
	        }
	        
	        for (boolean present : lettersPresent) {
	            if (!present) {
	                return false;
	            }
	        }
	        
	        return true;
	    }
}
