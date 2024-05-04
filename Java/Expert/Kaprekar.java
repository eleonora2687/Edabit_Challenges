// Kaprekar's Constant

// 6174 is known as one of Kaprekar's constants, after the Indian mathematician D. R. Kaprekar. Number 6174 is notable for the following rule:

// Take any four-digit number, using at least two different digits (leading zeros are allowed).
// Arrange the digits in descending and then in ascending order to get two four-digit numbers, adding leading zeros if necessary.
// Subtract the smaller number from the bigger number.
// Go back to step 2 and repeat.
// The above process, known as Kaprekar's routine, will always reach its fixed point, 6174, in at most 7 iterations. Once 6174 is reached, the process will continue yielding 7641 – 1467 = 6174. For example, choose 3524:

// 5432 - 2345 = 3087
// 8730 - 0378 = 8352
// 8532 - 2358 = 6174
// 7641 - 1467 = 6174
// Write a recursive function that will return the number of times it will take to get from a number to 6174 (the above example would equal 3).


/* public class Kaprekar {
    public static void main(String[] args) {
        System.out.println(kaprekar(3524, 0));
        System.out.println(kaprekar(1112, 0));
        System.out.println(kaprekar(4560, 0));
        
    }
    public static int kaprekar(int num, int counter) {
		if (num == 6174) {
            return counter;
        } else {
            int n1 = maxi(num);
            int n2 = mini(num);
            int sub = n1-n2;
            if (sub < 1000) {
                sub *= 10;
            }
            return kaprekar(sub, counter + 1);
        }
    }
    public static int maxi(int num)
    {
        
        int sortedNumber = 0;
        for (int i = 9; i >= 0; i--) {
            int tmpNumber = num;
            while (tmpNumber > 0) {
                int digit = tmpNumber % 10;
                if (digit == i) {
                    sortedNumber *= 10;
                    sortedNumber += digit;
                }
                tmpNumber /= 10;
            }
        }
        return sortedNumber;
        }

    public static int mini(int num)
    {
        int sortedNumber = 0;
        for (int i = 0; i <= 9; i++) {
            int tmpNumber = num;
            while (tmpNumber > 0) {
                int digit = tmpNumber % 10;
                if (digit == i) {
                    sortedNumber *= 10;
                    sortedNumber += digit;
                }
                tmpNumber /= 10;
            }
        }
        return sortedNumber;
    }
}
 */



//  Sherlock and the Valid String

//  Sherlock considers a string to be valid if all characters of the string appear the same number of times. It is also valid if he can remove just 1 character at 1 index in the string, 
//  and the remaining characters will occur the same number of times. Given a string str, determine if it is valid. If so, return "YES", otherwise return "NO".

// For example, If str = "abc", the string is valid because the frequencies of characters are all the same. If str = "abcc", the string is also valid, because we can remove 1 "c" 
// and have one of each character remaining in the string. However, if str = "abccc", the string is not valid, because removing one character does not result in the same frequency of 
// characters.

