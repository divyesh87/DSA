// Given an array containimg non zero integers 
// Find a subarray whose sum equals to given sum, 20 in this case 
// The sub array should be contiguous 
// Given eg 1-10 integers , required sum is 20 ; index[1] to index[5] is the output
// Time complexity is Big O(n)


array = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
sum = 20;

function findSubArray(array) {

    // Outer for loop gives starting point to keep adding
    for (let i = 0; i < array.length; i++) {

        // after every loop we reset counters to find sub-array
        let contiguous_sum = 0;
        let subarray = [];

        // Inner for loop to keep adding the numbers to the starting point 
        for (let j = 0; j < array.length; j++) {

            contiguous_sum += array[i + j];
            subarray.push(i + j)

            // checking if condition is met
            if (contiguous_sum == sum) return subarray;
            // Better design , better algo by breaking
            else if (contiguous_sum > sum) break;
        }

        // We reacched the end of the list, and the sub-array is not found 
        if (i == array.length - 1) return "does not exist";
    }
}

console.log(findSubArray(array));
