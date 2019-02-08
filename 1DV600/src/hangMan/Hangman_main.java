package hangMan;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Hangman_main {
	private static Random rnd = new Random();
	private static int choice;
	private static int guessNr;
	private static char c;
	private static Scanner scan = new Scanner(System.in);
	private static ArrayList<Character> charList = new ArrayList<Character>();
	private static ArrayList<Character> charList1 = new ArrayList<Character>();
	private static ArrayList<Character> guessedList = new ArrayList<Character>();

	public static void main(String[] args) {
		ArrayList<String> wordList = new ArrayList<String>();
		wordList.add("monkaS");
		wordList.add("poggers");
		wordList.add("Silence");
		charList1 = randomWord(wordList);
		System.out.println("The word contains: " + charList.size() +  " characters");
		
		while(guessNr < 8) {
			System.out.println("Guesses left: " + (8 - guessNr));
			System.out.print("Gussed letters: ");
			for(int i = 0;i < guessedList.size();i++) {
				System.out.print(guessedList.get(i) + " ");
			}
			String text = scan.next();
			c = text.charAt(0);
				if(charList.contains(c)) {
					guessedList.add(c);
					System.out.println("The word contains: " +  c);
				}
				else {
					System.out.println("The word does not contain: " + c);
					guessedList.add(c);
					guessNr ++;
				}
		}

	}
	
	public static ArrayList<Character> randomWord(ArrayList<String> list) {
		choice = rnd.nextInt(3);
		
		for(int i = 0;i < list.get(choice).length();i++) {
		charList.add(list.get(choice).charAt(i));
		}
		return charList;
		
	}

}
