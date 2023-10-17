package ExampleProblems;

import java.util.Scanner;

public class PangramOrNot {
	public static void main(String[] args) {
		// Taking The User Input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Sentence TO Check Whether It Is A Pangram Sentence Or Not");
		String Sentence = sc.nextLine();
		// Method To Check The Pangram
		boolean result = pangramCheck(Sentence);
		if (result) {
			System.out.println("Your Sentence is a Pangram");
		} else {
			System.out.println("Your Sentence is not a Pangram");
		}
	}

	private static boolean pangramCheck(String str) {
		for (char c = 'a'; c <= 'z'; c++) {
			if (str.indexOf(c) == -1)// indexOf Returns -1 if character is not present in a String
				return false;
		}
		return true;
	}
}
