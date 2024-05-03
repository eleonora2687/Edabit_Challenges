// Bitwise Operations

// A decimal number can be represented as a sequence of bits. To illustrate:

// 6 = 00000110
// 23 = 00010111
// From the bitwise representation of numbers, we can calculate the bitwise AND, bitwise OR and bitwise XOR. Using the example above:

// bitwiseAND(6, 23) ➞ 00000110

// bitwiseOR(6, 23) ➞ 00010111

// bitwiseXOR(6, 23) ➞ 00010001
// Write three functions to calculate the bitwise AND, bitwise OR and bitwise XOR of two numbers.


/* function bitwiseAND(n1, n2) {
    let bitWise="";
    let b1=n1.toString(2), b2=n2.toString(2);
    
    while (b1!=0 || b2!=0) {
        if (b1%2==1 && b2%2==1) {
            bitWise+="1";
        }
        else if(b1%2==0 || b2%2==0)
        {
            bitWise+="0";
        }
        b1=Math.floor(b1/10);
        b2=Math.floor(b2/10)
        
    }
    var splitString = bitWise.split(""); 

    var reverseArray = splitString.reverse(); 

    var joinArray = reverseArray.join(""); 

    var digit = parseInt(joinArray, 2);

    return digit;
}

function bitwiseOR(n1, n2) {
	let bitWise="";
    let b1=n1.toString(2), b2=n2.toString(2);
    
    while (b1!=0 || b2!=0) {
        if (b1%2==1 || b2%2==1) {
            bitWise+="1";
        }
        else if(b1%2==0 && b2%2==0)
        {
            bitWise+="0";
        }
        b1=Math.floor(b1/10);
        b2=Math.floor(b2/10)
        
    }
    var splitString = bitWise.split(""); 

    var reverseArray = splitString.reverse(); 

    var joinArray = reverseArray.join(""); 

    var digit = parseInt(joinArray, 2);

    return digit;
}

function bitwiseXOR(n1, n2) {
	let bitWise="";
    let b1=n1.toString(2), b2=n2.toString(2);
    
    while (b1!=0 || b2!=0) {
        if ((b1%2==1 && b2%2==0) || (b1%2==0 && b2%2==1)){
            bitWise+="1";
        }
        else 
        {
            bitWise+="0";
        }
        b1=Math.floor(b1/10);
        b2=Math.floor(b2/10)
        
    }
    var splitString = bitWise.split(""); 

    var reverseArray = splitString.reverse(); 

    var joinArray = reverseArray.join(""); 

    var digit = parseInt(joinArray, 2);

    return digit;
}

console.log(bitwiseAND(6, 23));
console.log(bitwiseAND(7, 12));
console.log(bitwiseOR(7, 12));
console.log(bitwiseXOR(7, 12));

 */




// Add up the Numbers from a Single Number
// Create a function that takes a number as an argument. Add up all the numbers from 1 to the number you passed to the function. For example, if the input is 4 then your function should return 10 because 1 + 2 + 3 + 4 = 10.

/* function addUp(num) {
        return num*(num+1)/2;
}

console.log(addUp(4));
console.log(addUp(13));
console.log(addUp(600));
console.log(addUp(392));
console.log(addUp(53));
console.log(addUp(897));
console.log(addUp(23));
console.log(addUp(1000));
console.log(addUp(738));
console.log(addUp(100));
console.log(addUp(925));
console.log(addUp(1));
console.log(addUp(999));
console.log(addUp(175));
console.log(addUp(111));
 */


// Matchstick Houses
// This challenge will help you interpret mathematical relationships both algebraically and geometrically.

// Create a function that takes a number (step) as an argument and returns the number of matchsticks in that step. See step 1, 2 and 3 in the image above.

/* function matchHouses(step) {
    if (step == 0) {
        return 0;
    }
    return(step - 1)*5 + 6;
}


console.log(matchHouses(1));
console.log(matchHouses(0));
console.log(matchHouses(4));
console.log(matchHouses(17));
console.log(matchHouses(36));
console.log(matchHouses(15));
console.log(matchHouses(99));
console.log(matchHouses(3));
console.log(matchHouses(87));
 */


// Left Shift by Powers of Two
// The left shift operation is similar to multiplication by powers of two.

// Sample calculation using the left shift operator (<<):

// 10 << 3 = 10 * 2^3 = 10 * 8 = 80
// -32 << 2 = -32 * 2^2 = -32 * 4 = -128
// 5 << 2 = 5 * 2^2 = 5 * 4 = 20
// Write a function that mimics (without the use of <<) the left shift operator and returns the result from the two given integers.



/* function shiftToLeft(x, y) {
    return x*Math.pow(2, y);
}

console.log(shiftToLeft(5, 2));
console.log(shiftToLeft(10, 3));
console.log(shiftToLeft(-32, 2));
console.log(shiftToLeft(-6, 5));
console.log(shiftToLeft(12, 4));
console.log(shiftToLeft(46, 6));
console.log(shiftToLeft(79, 1));
 */



// Find the Smallest and Biggest Numbers
// Create a function that takes an array of numbers and return both the minimum and maximum numbers, in that order.


/* function minMax(arr) {
    var mM=[];
    let m=arr[0], M =arr[0];

    for (let index = 1; index < arr.length; index++) {
        if(m>arr[index]){
        m=arr[index];
        }
        if(M<arr[index]){
            M=arr[index];
        }
    }
    mM.push(m);
    mM.push(M);
    return mM;
}

console.log(minMax([1, 2, 3, 4, 5]));
console.log(minMax([2334454, 5]));
console.log(minMax([1]));
console.log(minMax([14, 35, 6, 1, 34, 54]));
console.log(minMax([1.346, 1.6532, 1.8734, 1.8723]));
console.log(minMax([0.432, 0.874, 0.523, 0.984, 0.327, 0.2345]));
console.log(minMax([13, 72, 98, 43, 24, 65, 31]));
console.log(minMax([-54, -23, -54, -21]));
console.log(minMax([-0.473, -0.6834, -0.1287, 0.5632]));
console.log(minMax([0, 0, 0, 0]));
 */


