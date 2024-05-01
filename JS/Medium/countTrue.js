/* How Much is True?

Create a function which returns the number of true values there are in an array.
 */

/* function countTrue(arr) {
	let count = 0;
    for (let index = 0; index < arr.length; index++) {
        if (arr[index] == true) {
            count++;
        }
        
    }return count;
}

console.log(countTrue([true, false, false, true, false]));
console.log(countTrue([false, false, false, false]));
console.log(countTrue([])); */



// A Redundant Function

// Write a function redundant that takes in a string str and returns a function that returns str.


function redundant(str) {
        return function()
        {
            return str;
        }
}

const f1 = redundant("apple")
const f2 = redundant("pear")
const f3 = redundant("")

console.log(f1());
console.log(f2());
console.log(f3());