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


public class Program {
    
    
    public static int[] arrayOfMultiples(int num, int length) {
		int [] mult=new int[length];
        for (int i = 0; i < length; i++) {
            mult[i]=num*(i + 1);
        }return mult;
	}}
    

    