
public class Pig_Latin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ex1 = translate("Boromir"); // begin with consonant
		String ex2 = translate("Arogorn"); // begin with vowel
		String ex3 = translate("Merry"); // begin with consonant
		String ex4 = translate("Frodo"); // consonant cluster word
		String ex5 = translate("Eowyn"); // begin with vowel
		String ex6 = translate("Thranduil"); // consonant cluster word
		String ex7 = translate("Oin"); // contains all vowels
		String ex8 = translate("nymphly"); // contains no vowel
		
		System.out.println(ex1);
		System.out.println(ex2);
		System.out.println(ex3);
		System.out.println(ex4);
		System.out.println(ex5);
		System.out.println(ex6);
		System.out.println(ex7);
		System.out.println(ex8);

	}
	// List of vowels to search for
	static boolean isVowel(char ch) {
		return (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o'
				|| ch == 'U' || ch == 'u');
	}

	static String translate(String s) {
		// the index of the first vowel is stored
		int stringlength = s.length();
		int index = -1;
		for (int i = 0; i < stringlength; i++) {
			if (isVowel(s.charAt(i))) {
				index = i;
				break;
			}
		}
		// Only runs when vowels are present
		if (index == -1)
			return "Not applicable, Pig Latin words must contain at least 1 vowel";

		return s.substring(index).toLowerCase() + s.substring(0, index).toLowerCase() + "ay";
	}
}
