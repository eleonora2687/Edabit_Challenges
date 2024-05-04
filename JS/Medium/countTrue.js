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


/* function redundant(str) {
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
console.log(f3()); */


// Tile Teamwork Tactics
// In a board game, a piece may advance 1-6 tiles forward depending on the number rolled on a six-sided die. If you advance your piece onto the same tile as another player's piece, both of you earn a bonus.

// Can you reach your friend's tile number in the next roll? Create a function that takes your position a and your friend's position b and returns a boolean representation of whether it's possible to earn a bonus on any die roll.

/* function possibleBonus(a, b) {
	if(a>=b)return false;
	else if(a+1==b)return true;
	else if(a+2==b)return true;
	else if(a+3==b)return true;
	else if(a+4==b)return true;
	else if(a+5==b)return true;
	else if(a+6==b)return true;
	else return false;
			
}


console.log(possibleBonus(3, 7));
console.log(possibleBonus(0, 6));
console.log(possibleBonus(1, 6));
console.log(possibleBonus(2, 6));
console.log(possibleBonus(3, 6));
console.log(possibleBonus(4, 6));
console.log(possibleBonus(5, 6));
console.log(possibleBonus(6, 6));
console.log(possibleBonus(7, 6));
console.log(possibleBonus(23, 27));
console.log(possibleBonus(1, 9));
console.log(possibleBonus(5, 3));
 */



// Right Shift by Division

// The right shift operation is similar to floor division by powers of two.

// Sample calculation using the right shift operator ( >> ):

// 80 >> 3 = floor(80/2^3) = floor(80/8) = 10
// -24 >> 2 = floor(-24/2^2) = floor(-24/4) = -6
// -5 >> 1 = floor(-5/2^1) = floor(-5/2) = -3
// Write a function that mimics (without the use of >>) the right shift operator and returns the result from the two given integers.


/* function shiftToRight(x, y) {
	return Math.floor(x/2**y);
}

console.log(shiftToRight(80, 3));
console.log(shiftToRight(-24, 2));
console.log(shiftToRight(-5, 1));
console.log(shiftToRight(4666, 6));
console.log(shiftToRight(3777, 6));
console.log(shiftToRight(-512, 10));
console.log(shiftToRight(38, 0));
console.log(shiftToRight(192, 4));
console.log(shiftToRight(1024, 5));
 */