// Bitwise Operations

// A decimal number can be represented as a sequence of bits. To illustrate:

// 6 = 00000110
// 23 = 00010111
// From the bitwise representation of numbers, we can calculate the bitwise AND, bitwise OR and bitwise XOR. Using the example above:

// bitwiseAND(6, 23) ➞ 00000110

// bitwiseOR(6, 23) ➞ 00010111

// bitwiseXOR(6, 23) ➞ 00010001
// Write three functions to calculate the bitwise AND, bitwise OR and bitwise XOR of two numbers.


function bitwiseAND(n1, n2) {
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

