package stringmanipulations;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class StringOperations {

	@Test
	public void findDuplicateElements() {
		String[] names = { "bks", "ctc", "bbsr", "bks", "hello", "ctc", "bbsr", "shiv" };

		HashSet<String> nonDuplicates = new HashSet();
		HashSet<String> duplicates = new HashSet();

		for (String name : names) {
			if (!nonDuplicates.add(name)) {
				duplicates.add(name);
			}
		}

		System.out.println(duplicates);
	}

	@Test
	public void occuranceOfEveryCharacter() {
		String name = "hello i am bikas bikas";

		char[] charArray = name.toCharArray();

		Map<Character, Integer> charCounts = new LinkedHashMap();

		for (char c : charArray) {
			charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
		}

		for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {

			if (entry.getValue() > 1) {
				System.out.print(entry.getKey() + " :" + entry.getValue());
			}
		}
		System.out.println();
	}

	@Test
	public void reverseTheWords() {
		String sentence = "Nothing new is happening in this world drama";

		String[] words = sentence.split(" ");

		for (String word : words) {
			System.out.print(new StringBuilder(word).reverse().toString() + " ");
		}
		System.out.println();
		// Assert.fail();
	}

	@Test
	public void basicStringOperations() {
		String str = "Hello i am";

		System.out.println(str.concat(" Bikash"));
		System.out.println(str.substring(1, str.length()));
		System.out.println(str.compareTo("Hello i am bikash"));
	}

	@Test
	public void firstNonRepeatingChar() {
		String str = "ywmrHello Hello";
		char[] charArray = str.toCharArray();

		for (char c : charArray) {
			if (str.indexOf(c) != str.lastIndexOf(c)) {
				System.out.println("The first repeating character is : " + c);
				break;
			}
		}
	}

	@Test
	public void findDuplicateCharacters() {
		String str = "Drama is predestined";

		char[] charArray = str.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			for (int j = 1; j < charArray.length; j++) {
				if (charArray[i] == charArray[j]) {
					System.out.print(charArray[i]);
					break;
				}
			}
		}
		System.out.println();
	}

	@Test
	public void findLengthOfString() {
		String str = "Hello Bikash";
		int length = 0;

		char[] strArray = str.toCharArray();

		for (char c : strArray) {
			length++;
		}

		System.out.println("The length of string is : " + length);
	}

	@Test
	public void removeDuplicatesFromString() {
		String name = "Hi I am Bikash kumar sethy Hi I am";
		Set<Character> nonDuplicates = new LinkedHashSet<Character>();

		for (int i = 0; i < name.length(); i++) {
			nonDuplicates.add(name.charAt(i));
		}

		Iterator<Character> iterate = nonDuplicates.iterator();
		while (iterate.hasNext()) {
			System.out.print(iterate.next());

		}

		System.out.println();
	}

	@Test
	public void findVowelsAndConsonents() {
		String name = "apple ";
		Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
		int vowelsCount = 0;
		int consonent = 0;

		char[] nameArray = name.replaceAll("\\s", "").toCharArray();

		for (int i = 0; i < nameArray.length; i++) {
			if (vowels.contains(nameArray[i])) {
				vowelsCount++;
			} else {
				consonent++;
			}
		}

		System.out.println("Total vowels : " + vowelsCount);
		System.out.println("Total consonents : " + consonent);

	}

	@Test(description = "trim() : removes the leading and trailing spaces")
	public void trimString() {
		String sentence = "           I am a very happy and care free soul       ";
		System.out.println(sentence.trim());
	}

	@Test
	public void subString() {
		String sentence = "I am a very wealthy soul";

		System.out.println(sentence.substring(1,8));
		System.out.println(sentence.substring(5));
	}
	
	@Test
	public void indexOfTest() {
		String sentence = "I am a pure soul";
		System.out.println(sentence.indexOf("a"));
	}
	
	@Test
	public void repeatCharacter() {
		String name = "Bikash kumar";
		char[] charArray = name.toCharArray();
	}

}
