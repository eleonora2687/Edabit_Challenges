'use strict'

/* Seven Boom!

Create a function that takes an array of numbers and return "Boom!" if the digit 7 appears in the array. Otherwise, return "there is no 7 in the array".

 */

/* function sevenBoom(arr) {
    let exists=false;
    for (let index = 0; index < arr.length; index++) {
        let num=arr[index].toString().length;
        for (let index1= 0; index1 < num; index1++) {
            if (arr[index]%10==7) {
                exists=true;
                break;
            }
            else{
                arr[index]=Math.floor(arr[index]/10);
            }
        }
        if (exists==true) {
            break;
        }
    }if(exists==true)
    {
        return "Boom!";
    }
    return "there is no 7 in the array"
}

console.log(sevenBoom([1, 2, 3, 4, 5, 6, 7]));
console.log(sevenBoom([8, 6, 33, 100]));
console.log(sevenBoom([2, 55, 60, 97, 86]));
console.log(sevenBoom([76, 55, 44, 32]));
 */



// Recursion: Left Shift by Powers of Two

// The left shift operation is similar to multiplication by powers of two, thus, the process is repetitive and can be done recursively.

// Sample calculation using the left shift operator (<<):

// 10 << 3 = 10 * 2^3 = 10 * 8 = 80
// -32 << 2 = -32 * 2^2 = -32 * 4 = -128
// 5 << 2 = 5 * 2^2 = 5 * 4 = 20
// Write a recursive function that mimics (without the use of <<) the left shift operator and returns the result from the two given integers.


function shiftToLeft(x, y) {
    if (y==0) {
        return x;
    }
	return shiftToLeft(2*x, y-1);
}


console.log(shiftToLeft(5, 2));
console.log(shiftToLeft(10, 3));
console.log(shiftToLeft(-32, 2));
console.log(shiftToLeft(-6, 5));
console.log(shiftToLeft(12, 4));
console.log(shiftToLeft(46, 6));
console.log(shiftToLeft(57, 0));
console.log(shiftToLeft(79, 1));