// How Much is True?
// Create a function which returns the number of true values there are in an array.


/* public class Challenge {
    public static void main(String args[])
    {
        System.out.println(countTrue(new boolean[] { true, false, false, true, false }));
        System.out.println(countTrue(new boolean[] {false, false, false, false}));
        System.out.println(countTrue(new boolean[] {}));
    
    }

	public static int countTrue(boolean[] arr) {
		int counter = 0;
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i] == true)
                counter ++;
        }return counter;
	}
} */



// Get Word Count
// Create a method that takes a string and returns the word count. The string will be a sentence.


/* public class Challenge {
    public static void main(String args[])
    {
        System.out.println(countWords("Just an example here move along"));
        System.out.println(countWords("This is a test"));
        System.out.println(countWords("What an easy task, right"));
        System.out.println(countWords("It's high noon"));
        System.out.println(countWords("Is this easy mode"));

    
    }

	public static int countWords(String s) {

	    int counter = 0, i = 0;

        while (i < s.length()) {
            if (s.charAt(i) == ' ') {
                counter ++;
            }
    
            i++;
        }return counter + 1;
	}
} */



// Check if String Ending Matches Second String
// Create a function that takes two strings and returns true if the first string ends with the second string; otherwise return false.


/* public class Challenge {
    public static void main(String args[])
    {
        System.out.println(checkEnding("abc", "bc"));
        System.out.println(checkEnding("abc", "d"));
        System.out.println(checkEnding("samurai", "zi"));
        System.out.println(checkEnding("feminine", "nine"));
        System.out.println(checkEnding("convention", "tio"));
        System.out.println(checkEnding("convention", "tio"));
        System.out.println(checkEnding("cooperative", "ooper"));
        System.out.println(checkEnding("extraterrestrial", "xtraterrestrial"));
        System.out.println(checkEnding("access", "ss"));
        System.out.println(checkEnding("motorist", "is"));

    }

	public static boolean checkEnding(String str1, String str2) {
        boolean end_match = true;
        for (int i = 0; i < str2.length(); i++) {
            if (str1.charAt(str1.length() - 1 - i) != str2.charAt(str2.length() - 1 - i)) {
                end_match = false;
                break;
            }
        }
        if (end_match == true) {
            return true;
        }return false;
    }
	    
} */


// Triangular Number Sequence

// This Triangular Number Sequence is generated from a pattern of dots that form a triangle. The first 5 numbers of the sequence, or dots, are:

// 1, 3, 6, 10, 15
// This means that the first triangle has just one dot, the second one has three dots, the third one has 6 dots and so on.

// Write a function that returns the number of dots when given its corresponding triangle number of the sequence.


/* public class Challenge {
    public static void main(String[] args) {
        System.out.println(triangle(1));
        System.out.println(triangle(2));
        System.out.println(triangle(3));
        System.out.println(triangle(6));
        System.out.println(triangle(8));
        System.out.println(triangle(215));
        System.out.println(triangle(2153));

    }
	public static int triangle(int n) {
		int start = 1, first = 2;
        for (int i = 0; i < n - 1; i++) {
            start += first;
            first ++;
        }return start;
  }
} */

