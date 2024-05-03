// Product of Digits of Sum

// Create a function that takes one, two or more numbers as arguments and adds them together to get a new number. 
// The function then repeatedly multiplies the digits of the new number by each other, yielding a new number, until the product is only 1 digit long. 
// Return the final product.


/* function sumDigProd() {
	let sum=0;
    for (let index = 0; index < arguments.length; index++) {
        sum+=arguments[index];
        
    }

    if (sum.toString().length == 1) {
        return sum;
    } else {
        let res = 10;
        while (res.toString().length > 1) {
            res = 1;
            while (sum!=0) {
                res*=sum%10;
                sum=Math.floor(sum/10);
            }
            sum=res;

        }
        return res;}
    
}

console.log(sumDigProd(0));
console.log(sumDigProd(9));
console.log(sumDigProd(9, 8));
console.log(sumDigProd(999, 999));
console.log(sumDigProd(999, 2222));
console.log(sumDigProd(8, 16, 89, 3));
console.log(sumDigProd(16, 28));
console.log(sumDigProd(26, 497, 62, 841));
console.log(sumDigProd(8618, -2));
console.log(sumDigProd(17737, 98723, 2));
console.log(sumDigProd(123, -99));
console.log(sumDigProd(9, 8));
console.log(sumDigProd(167, 167, 167, 167, 167, 3));
console.log(sumDigProd(111111111));
console.log(sumDigProd(98526, 54, 863, 156489, 45, 6156));
console.log(sumDigProd(1, 2, 3, 4, 5, 6));

 */



// Working 9 to 5
// Write a function that calculates overtime and pay associated with overtime.

// Working 9 to 5: regular hours
// After 5pm is overtime
// Your function gets an array with 4 values:

// Start of working day, in decimal format, (24-hour day notation)
// End of working day. (Same format)
// Hourly rate
// Overtime multiplier
// Your function should spit out:

// $ + earned that day (rounded to the nearest hundreth)


/* function overTime(arr) {
	function overTime(arr) {
        if (arr[0]<17 && arr[1]<=17) {
            return "$"+((arr[1]-arr[0])*arr[2]).toFixed(2);
        } else if(arr[0]<17 && arr[1]>17){
            return "$"+((17-arr[0])*arr[2] + (arr[1]-17)*arr[2]*arr[3]).toFixed(2);
        } else if(arr[0]<17 && arr[1]>17){
            return "$"+((17-arr[0])*arr[2] + (arr[1]-17)*arr[2]*arr[3]).toFixed(2);
        }else{
            return "$"+((arr[1]-arr[0])*arr[2]*arr[3]).toFixed(2);
        }
    }
}


console.log(overTime([9, 17, 30, 1.5]));
console.log("$"+overTime([16, 18, 30, 1.8]));
console.log("$"+overTime([13.25, 15, 30, 1.5]));
console.log("$"+overTime([9, 18, 40, 2]));
console.log("$"+overTime([13, 20, 32.5, 2]));
console.log("$"+overTime([9, 13, 25, 1.5]));
console.log("$"+overTime([11.5, 19, 40, 1.8]));
console.log("$"+overTime([10.5, 17, 32.25, 1.5]));
console.log("$"+overTime([18, 20, 32.5, 2]));
console.log("$"+overTime([13.25, 15, 30, 1.5]));
console.log("$"+overTime([13, 21, 38.6, 1.8]));
 */


