// Seven Boom!
// Create a function that takes an array of numbers and return "Boom!" if the digit 7 appears in the array. Otherwise, return "there is no 7 in the array".

// Examples
// sevenBoom([1, 2, 3, 4, 5, 6, 7]) -> "Boom!"
//  7 contains the number seven.


// sevenBoom([8, 6, 33, 100]) -> "there is no 7 in the array"
// None of the items contain 7 within them.

// sevenBoom([2, 55, 60, 97, 86]) -> "Boom!"
// 97 contains the number seven.



/* public class Challenge {
    public static void main(String[] args) {
        System.out.println(sevenBoom(new int[]{2, 6, 7, 9, 3}));
        System.out.println(sevenBoom(new int[]{33, 68, 400, 5}));
        System.out.println(sevenBoom(new int[]{86, 48, 100, 66}));
        System.out.println(sevenBoom(new int[]{2, 55, 60, 97, 86}));
    }
    public static String sevenBoom(int[] arr) {
        boolean exists=false;

        for (int i = 0; i < arr.length; i++) {
            String num = Integer.toString(arr[i]);
            for (int j = 0; j < num.length(); j++) {
                if (arr[i]%10 == 7) {
                    exists=true;
                    break;
                }
                else{
                    arr[i]/=10;
                }
            }
            
        }
        if (exists==true) 
            return "Boom!";
        return "there is no 7 in the array";
        
	}    
}
 */




//  Balanced Words

//  We can assign a value to each character in a word, based on their position in the alphabet (a = 1, b = 2, ... , z = 26). A balanced word is one where the sum of values on the left-hand side of the word equals the sum of values on the right-hand side. For odd length words, the middle character (balance point) is ignored.

//  Write a function that returns true if the word is balanced, and false if it's not.



/* public class Challenge {
    public static void main(String[] args) {
        System.out.println(balanced("zips"));
        System.out.println(balanced("brake"));
        System.out.println(balanced("at"));
        System.out.println(balanced("forgetful"));
        System.out.println(balanced("vegetation"));
        System.out.println(balanced("disillusioned"));
        System.out.println(balanced("abstract"));
        System.out.println(balanced("clever"));
        System.out.println(balanced("seasoning"));
        System.out.println(balanced("measure"));
        System.out.println(balanced("conditionalities"));
        System.out.println(balanced("uptight"));
        System.out.println(balanced("ticket"));
        System.out.println(balanced("calculate"));
        System.out.println(balanced("join"));
        System.out.println(balanced("anesthesiologies"));
        System.out.println(balanced("command"));
        System.out.println(balanced("graphite"));
        System.out.println(balanced("quadratically"));
        System.out.println(balanced("right"));
        System.out.println(balanced("fossil"));
        System.out.println(balanced("sparkling"));
        System.out.println(balanced("dolphin"));
        System.out.println(balanced("baseball"));
        System.out.println(balanced("immense"));
        System.out.println(balanced("pattern"));
        System.out.println(balanced("hand"));
        System.out.println(balanced("radar"));
        System.out.println(balanced("oven"));
        System.out.println(balanced("immutability"));
        System.out.println(balanced("kayak"));
        System.out.println(balanced("bartender"));
        System.out.println(balanced("weight"));
        System.out.println(balanced("lightbulbs"));
        System.out.println(balanced("tail"));
        
    }
    public static boolean balanced(String word) {
          char [] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
          int first=0, second=0, temp=0;
        
          if (word.length()%2==0){
          for (int i = 0; i <= (word.length() - 1)/2; i++) {

            for (int j = 0; j < letters.length; j++) {
                
                if (word.charAt(i) == letters[j]) {
                    temp=j+1;
                    break;
                }
                
            }first+=temp;
          }


          for (int i = word.length()/2; i <word.length(); i++) {
            
            for (int j = 0; j < letters.length; j++) {
                if (word.charAt(i) == letters[j]) {
                    temp=j+1;
                    break;
                }
                
            }second+=temp;
          }
          
          if (first==second) {
            return true;
          }return false;
        }
        else{
            for (int i = 0; i < (word.length() - 1)/2; i++) {

                for (int j = 0; j < letters.length; j++) {
                    
                    if (word.charAt(i) == letters[j]) {
                        temp=j+1;
                        break;
                    }
                    
                }first+=temp;
              }
    
    
              for (int i = word.length()/2+1; i <word.length(); i++) {
                
                for (int j = 0; j < letters.length; j++) {
                    if (word.charAt(i) == letters[j]) {
                        temp=j+1;
                        break;
                    }
                    
                }second+=temp;
              }

              if (first==second) {
                return true;
              }return false;
            }

        }
    }

     */

