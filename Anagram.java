/** Functions for checking if a given string is an anagram. */
public class Anagram {
	public static void main(String args[]) {
		// Tests the isAnagram function.\
		System.out.println(randomAnagram("listen"));
		System.out.println(isAnagram("silent","listen"));  // true
		System.out.println(isAnagram("William Shakespeare","I am a weakish speller")); // true
		System.out.println(isAnagram("Madam Curie","Radium came")); // true
		System.out.println(isAnagram("Tom Marvolo Riddle","I am Lord Voldemort")); // true

		// Tests the preProcess function.
		System.out.println(preProcess("What? No way!!!"));
		
		// Tests the randomAnagram function.
		System.out.println("silent and " + randomAnagram("silent") + " are anagrams.");
		
		// Performs a stress test of randomAnagram 
		String str = "1234567";
		Boolean pass = true;
		//// 10 can be changed to much larger values, like 1000
		for (int i = 0; i < 10; i++) {
			String randomAnagram = randomAnagram(str);
			System.out.println(randomAnagram);
			pass = pass && isAnagram(str, randomAnagram);
			if (!pass) break;
		}
		System.out.println(pass ? "test passed" : "test Failed");
	}  

	// Returns true if the two given strings are anagrams, false otherwise.
	public static boolean isAnagram(String str1, String str2) {
		str1=preProcess(str1);
		str2=preProcess(str2);
		if (str1.length()!=str2.length()) {
			return false;
		}
		// Replace the following statement with your code
		int i=0;
		int z=0;
		while (i<str1.length()) {
			z=0;
			boolean found=false;
			while (z<str2.length()&&!found) {
				if (str1.charAt(i)==str2.charAt(z)) {
					found=true;
				}
				z++;
			}
			if (!found) {
				return false;
			}
			i++;
		}


		return true;
	}
	   
	// Returns a preprocessed version of the given string: all the letter characters are converted
	// to lower-case, and all the other characters are deleted, except for spaces, which are left
	// as is. For example, the string "What? No way!" becomes "whatnoway"
	public static String preProcess(String str) {
		// Replace the following statement with your code
		str=str.toLowerCase();
		str=str.replace(" ", "");
    for (int i = 0; i < str.length(); i++) 
		{
			char current=str.charAt(i);
			if (!Character.isLetter(current)) {
				str= str.substring(0, i) + str.substring(i + 1);
				i--;
			}
		}
		return str;
	} 
	   
	// Returns a random anagram of the given string. The random anagram consists of the same
	// characters as the given string, re-arranged in a random order. 
	public static String randomAnagram(String str) {
		//create random number from 0 to length -1
		//take it, push it to new string, 
		int length=str.length();
		// delete it 
		int i=0;
		String returnstring="";
		while (str.length()!=0) {
			int randomIndex = (int) (Math.random() * str.length());
			returnstring=returnstring+str.charAt(randomIndex);
			str= str.substring(0, randomIndex) + str.substring(randomIndex + 1);
		}

		return returnstring;
	}
}
