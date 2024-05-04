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




// Basic Calculator
// Create a function that takes two numbers and a mathematical operator + - / * and will perform a calculation with the given numbers.

/* public class Challenge {
    public static void main(String[] args) {
        System.out.println(calculator(2, '+', 2));
        System.out.println(calculator(2, '*', 2));
        System.out.println(calculator(4, '/', 2));
        System.out.println(calculator(15, '+', 26));
        System.out.println(calculator(2, '+', 2));
        System.out.println(calculator(2, '/', 0));    
    }
	public static int calculator(int num1, char operator, int num2) {
		if (operator == '/' && num2 == 0) {
            return 0;
        } else if (operator == '+'){
            return num1 + num2;
        } else if(operator == '-'){
            return num1 - num2;
        }else if(operator == '/'){
            return num1/num2;
        }return num1*num2;
  }
} */


// Exists a Number Higher?
// Write a function that returns true if there exists at least one number that is larger than or equal to n.

/* public class Challenge {
    public static void main(String[] args) {
        System.out.println(existsHigher(new int[] {5, 3, 15, 22, 4}, 10));
        System.out.println(existsHigher(new int[] {1, 2, 3, 4, 5}, 8));
        System.out.println(existsHigher(new int[] {4, 3, 3, 3, 2, 2, 2}, 4));
        System.out.println(existsHigher(new int[] {2, 2, 2, 2}, 5));
        System.out.println(existsHigher(new int[] {}, 0));

    }
	public static boolean existsHigher(int[] arr, int n) {
		boolean exists = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= n) {
                exists = true;
                break;
            }
        }
        if (exists == true) {
            return true;
        }return false;
	}
} */



// Shuffle the Name

// Create a method that accepts a string (of a person's first and last name) and returns a string with the first and last name swapped.


public class Challenge {
    public static void main(String[] args) {
        System.out.println(nameShuffle("Donald Trump"));
        System.out.println(nameShuffle("Rosie O'Donnell"));
        System.out.println(nameShuffle("Seymour Butts"));
        System.out.println(nameShuffle("Ebony Greene"));
        System.out.println(nameShuffle("Allison Gonzalez"));
        System.out.println(nameShuffle("Albert Frazier"));
        System.out.println(nameShuffle("Eloise Hopkins"));
        System.out.println(nameShuffle("Donnie Welch"));
        System.out.println(nameShuffle("Vernon Thomas"));
        
    }
    public static String nameShuffle(String s) {
        int i = 0;
        String emptyNewString = new String("");
        for (i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                break;
            }
        }i++;
        for (int j = i; j < s.length(); j++) {
            emptyNewString+=s.charAt(j);
        }
        emptyNewString+=' ';
        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) ==' ') {
                break;
            }
            else{
                emptyNewString+=s.charAt(j);
            }
        }return emptyNewString;

    }
}