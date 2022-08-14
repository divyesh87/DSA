import { sortedarray } from "./bubbleSort.js"

let array = [7, 10, 4, 20, 15];
let k = 4;

sortedarray(array);
function kthSmallest(array) {
    return array[k - 1];
}

console.log(kthSmallest(array));