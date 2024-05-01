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

function matchHouses(step) {
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
