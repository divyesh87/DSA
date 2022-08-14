// Given an array of integers
// Find how many jumps it takes to reach the end of an array
// The value at index[i] is how many spots to jump at a time
// For eg given here, we start at index 0, add 1 to it, reach index , further add index[2] until we reach end
// define a var counter to count steps
// Time complexity: Big O(n);

array = [1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9];

function countSteps(array) {
    let count = 0;
    endReached = false;
    let i = 0;

    while (!endReached) {

        if (i >= array.length - 1) {
            endReached = true;
            return count;
        }
        else if (array[i] == 0) {
            return "cant reach end";
        }
        i += array[i];
        count++;
    }
}

console.log(countSteps(array));
