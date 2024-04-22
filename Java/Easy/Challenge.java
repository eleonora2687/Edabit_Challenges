// How Much is True?

// Create a function which returns the number of true values there are in an array.


public class Challenge {
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
}