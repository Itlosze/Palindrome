import java.util.InputMismatchException;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String inputWord = "";
		System.out.println("--- Palindrome check ---");
		System.out.println("Enter a word: ");
		try (Scanner scanner = new Scanner(System.in)) {
			try {
				inputWord = scanner.next();
				if (isPalindrome(inputWord)) {
					System.out.println("Yes, the "+inputWord+" word is a palindrome");
				}else {
					System.out.println("No, the "+inputWord+" word is not a palindrome");
				}
			} catch (InputMismatchException e) {
				System.out.println("Is not a string");
			}
		}
	}

	public static boolean isPalindrome(String word) {
		int i = 0;
		int j = word.length() - 1;
		while (j > i) {
			if (word.charAt(i) != word.charAt(j)) {
				return false;
			}
			++i;
			--j;
		}
		return true;
	}
}
