let array = [0, 1, 2, 3, 4, 5, 6];
let D = 3;

const elements = array.splice(0, D);
array = [...array, ...elements];

console.log(array);
