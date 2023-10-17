package ExampleProblems;

import java.util.HashMap;
import java.util.Scanner;

public class ConvertingRomanToNumber {
	static HashMap<Character, Integer> roman = new HashMap<Character, Integer>();

	public static void main(String[] args) {
		// Inserting The Roman Object
		roman.put('I', 1);
		roman.put('V', 5);
		roman.put('X', 10);
		roman.put('L', 50);
		roman.put('C', 100);
		roman.put('D', 500);
		roman.put('M', 1000);
		// taking input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Roman Value You Want To Het The Number Of :");
		String value = sc.nextLine();
		String actual = value.toUpperCase();
		// method call to convert roman to number
		int result = convertRomanToNumber(actual);
		System.out.println("The Number Of Roman Value " + actual + " is " + result);
	}

	private static int convertRomanToNumber(String actual) {
		int presentValue = 0;
		int Value = 0;
		for (int i = actual.length() - 1; i >= 0; i--) {
			int number = roman.get(actual.charAt(i));
			if (number < presentValue) {
				Value -= number;
			} else {
				Value += number;
			}
			presentValue = number;
		}
		return Value;
	}

}