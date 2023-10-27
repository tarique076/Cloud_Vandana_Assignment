package com.romanInt;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInt {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a valid roman no.");

		String roman = sc.next();

		int ans = romanToInt(roman);
		
		if (ans != -1)
			System.out.println(ans);
		else
			System.out.println("Not a valid Roman No.");
		sc.close();

	}

	public static int romanToInt(String str) {
		if (str == null || str.length() == 0) {
			return -1;
		}

		// Create a map to store the values of Roman numerals
		Map<Character, Integer> romanMap = new HashMap<>();
		romanMap.put('I', 1);
		romanMap.put('V', 5);
		romanMap.put('X', 10);
		romanMap.put('L', 50);
		romanMap.put('C', 100);
		romanMap.put('D', 500);
		romanMap.put('M', 1000);

		int result = 0;
		int prevValue = 0;

		for (int i = str.length() - 1; i >= 0; i--) {

			if (str.charAt(i) != 'I' && str.charAt(i) != 'V' && str.charAt(i) != 'X' && str.charAt(i) != 'L'
					&& str.charAt(i) != 'C' && str.charAt(i) != 'D' && str.charAt(i) != 'M') {
				return -1;
			}
			int currentValue = romanMap.get(str.charAt(i));

			if (currentValue < prevValue) {
				result -= currentValue;
			} else {
				result += currentValue;
			}

			prevValue = currentValue;
		}

		return result;
	}

}
