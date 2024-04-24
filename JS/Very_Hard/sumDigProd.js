// Product of Digits of Sum

// Create a function that takes one, two or more numbers as arguments and adds them together to get a new number. 
// The function then repeatedly multiplies the digits of the new number by each other, yielding a new number, until the product is only 1 digit long. 
// Return the final product.


function sumDigProd() {
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

