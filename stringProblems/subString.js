let string = "GeeksForGeeks";
let subString = "For";
let present = true;

for (i in string) {
  for (let j = 0; j < subString.length; j++) {
    if (!(string[i + j] == subString[j])) {
      present = false;
    }
  }
}

console.log(present);
