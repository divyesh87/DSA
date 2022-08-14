// given an array conatainig integers
// return the index of two numbrs such that both add up to target
// for eg here target = 12; , nums[1] + nums[5] will add to 12
// The time complexity is Big O(n^2); 


let nums = [2, 3, 6, 7, 8, 9];
let target = 12;


function getAnswer() {
    for (let i = 0; i < nums.length; i++) {

        for (let j = 0; j < nums.length; j++) {

            if ((i == j)) continue;
            if ((nums[i] + nums[j]) == target) return [i, j];

        }
    }
}

console.log(getAnswer());