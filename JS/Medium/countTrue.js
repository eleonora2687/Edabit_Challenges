/* How Much is True?

Create a function which returns the number of true values there are in an array.
 */

function countTrue(arr) {
	let count = 0;
    for (let index = 0; index < arr.length; index++) {
        if (arr[index] == true) {
            count++;
        }
        
    }return count;
}

console.log(countTrue([true, false, false, true, false]));
console.log(countTrue([false, false, false, false]));
console.log(countTrue([]));