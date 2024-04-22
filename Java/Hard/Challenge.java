// Seven Boom!
// Create a function that takes an array of numbers and return "Boom!" if the digit 7 appears in the array. Otherwise, return "there is no 7 in the array".

/* Examples
sevenBoom([1, 2, 3, 4, 5, 6, 7]) ➞ "Boom!"
 */// 7 contains the number seven.

// sevenBoom([8, 6, 33, 100]) ➞ "there is no 7 in the array"
// None of the items contain 7 within them.

// sevenBoom([2, 55, 60, 97, 86]) ➞ "Boom!"
// 97 contains the number seven.



public class Challenge {
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


