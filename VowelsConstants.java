package com.feb7;

import java.util.Scanner;

/* 
 * Problem: take one string array and calculate count how many vowels are and constants 
 */

public class VowelsConstants {
	
	
	public static void main(String[] args) {

		   Scanner scanner = new Scanner(System.in);

	        // Taking input of string array
	        System.out.print("Enter the number of strings in the array: ");
	        int n = scanner.nextInt();
	        scanner.nextLine(); // Consume the newline character

	        String[] strings = new String[n];

	        System.out.println("Enter the strings:");
	        for (int i = 0; i < n; i++) {
	            strings[i] = scanner.nextLine();
	        }

	        // Calculate total counts
	        int totalVowels = 0;
	        int totalConsonants = 0;

	        for (String str : strings) {
	            int[] counts = countVowelsAndConsonants(str);
	            totalVowels += counts[0];
	            totalConsonants += counts[1];
	        }

	        // Display total counts
	        System.out.println("Total Vowels across all strings: " + totalVowels);
	        System.out.println("Total Consonants across all strings: " + totalConsonants);

	        scanner.close();
	    }

	    private static int[] countVowelsAndConsonants(String str) {
	        int vowelCount = 0;
	        int consonantCount = 0;

	        for (char ch : str.toCharArray()) {
	            if (isAlphabetic(ch)) {
	                // Check if the character is a vowel
	                if (isVowel(ch)) {
	                    vowelCount++;
	                } else {
	                    consonantCount++;
	                }
	            }
	        }

	        return new int[]{vowelCount, consonantCount};
	    }
		
	

		private static boolean isAlphabetic(char ch) {
		    return Character.isLetter(ch);
		}
		
		private static boolean isVowel(char ch) {
		    char lowerCh = Character.toLowerCase(ch);
		    return lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u';
		}
}
