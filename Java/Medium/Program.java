// How Many Solutions Does This Quadratic Have?

// A quadratic equation a x² + b x + c = 0 has either 0, 1, or 2 distinct solutions for real values of x. Given a, b and c, you should return the number of solutions to the equation.

/* public class Challenge {

    public static void main(String[] args) {
        System.out.println(solutions(1, 0, -1));
        System.out.println(solutions(1, 0, 0));
        System.out.println(solutions(1, 0, 1));
    }
    public static int solutions(int a, int b, int c) {
		if (Math.pow(b, 2) - 4*a*c > 0) {
            return 2;
        } else if(Math.pow(b, 2) - 4*a*c == 0){
            return 1;
        }
        else return 0;
  }
} */


// Array of Multiples

// Create a function that takes two numbers as arguments (num, length) and returns an array of multiples of num until the array length reaches length.


/* public class Program {
    
    
    public static int[] arrayOfMultiples(int num, int length) {
		int [] mult=new int[length];
        for (int i = 0; i < length; i++) {
            mult[i]=num*(i + 1);
        }return mult;
	}}
    

     */



// Find the Other Two Side Lengths

// Given the shortest side of a 30° by 60° by 90° triangle, find out the other two sides. Return the longest side and medium-length side in that order.

// 30° by 60° by 90° triangles always follow this rule: let's say the shortest side length is x units, the hypotenuse would be 2x units and the other side would be x * square root of 3.


/* public class Program {
    public static void main(String[] args) {
        System.out.println(otherSides(1));
        System.out.println(otherSides(12));
        System.out.println(otherSides(2));
        System.out.println(otherSides(3));
        System.out.println(otherSides(5));
        System.out.println(otherSides(7));
        System.out.println(otherSides(17));
        System.out.println(otherSides(1));
        System.out.println(otherSides(1));
    }
    public static double[] otherSides(int n) {
            double[] sides= new double[2];
            sides[0]=2*n;
            sides[1]=Math.sqrt(3)*n;
            return sides;

    }
  } */



// War of Numbers
// There's a great war between the even and odd numbers. Many numbers already lost their lives in this war and it's your task to end this. 
// You have to determine which group sums larger: the evens, or the odds. The larger group wins.

// Create a function that takes an array of integers, sums the even and odd numbers separately, then returns the difference between the sum of the even and odd numbers.

/* public class Program {
    public static void main(String[] args) {
        System.out.println(warOfNumbers(new int[]{2, 8, 7, 5}));
        System.out.println(warOfNumbers(new int[]{12, 90, 75}));
        System.out.println(warOfNumbers(new int[]{5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243}));
        System.out.println(warOfNumbers(new int[]{654,7,23,3,78,4,56,34}));
        System.out.println(warOfNumbers(new int[]{1,2,3,4,5,6,7,8,9}));
        System.out.println(warOfNumbers(new int[]{97,83,209,141,134,298,110,207,229,275,115,64,244,278}));
        System.out.println(warOfNumbers(new int[]{332,92,35,315,109,168,320,230,63,323,16,204,105,17,226,157,245,44,223,136,93}));
        System.out.println(warOfNumbers(new int[]{322,89,36,310,297,157,251,55,264,244,200,304,25,308,311,269,303,257,6,311,307,310,50,46,54,237,59,105,267}));
        System.out.println(warOfNumbers(new int[]{50,100,149,1,200,199,3,2}));
    }
    public static int warOfNumbers(int[]numbers){
          int sum1=0, sum2=0;
          for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]%2==0) {
                sum1+=numbers[i];
            }
            else{
                sum2+=numbers[i];
            }
          }return Math.abs(sum2-sum1);
    }
  } */




// Perfect Square Patch
// Create a function that takes an integer and outputs an n x n square solely consisting of the integer n.

/* public class Program {
	public static int[][] squarePatch(int n) {
		int[][] arr=new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j]=n;
            }
        }return arr;
	}
} */


