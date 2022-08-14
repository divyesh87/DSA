let string = "i.like.this.program.very.much.";
let wordsArray = [];
let word = "";
let output = "";

for (let i in string) {
  if (string[i] != ".") {
    word += string[i];
    if (i == string.length - 1) {
      wordsArray.push(word);
    }
  } else {
    wordsArray.push(word);
    word = "";
  }
}
wordsArray = wordsArray.filter((element) => element != " ").reverse();

wordsArray.forEach((word) => {
  let w = "";
  for (let i in word) {
    w += word[i];
  }
  output += `${w}.`;
  w = "";
});

console.log(output);
