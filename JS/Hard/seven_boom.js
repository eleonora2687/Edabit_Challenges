/* Seven Boom!

Create a function that takes an array of numbers and return "Boom!" if the digit 7 appears in the array. Otherwise, return "there is no 7 in the array".

 */

function sevenBoom(arr) {
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
