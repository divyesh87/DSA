// Initializing global variables , Output can be modified by changing values of n and para variables
let para =
  "Hi there. My name is Divyesh. This is my lucky day. I like coding so much. This is it.";
let n = 3;
let output = "";

// The approach was to create an array containig all the sentences and the sentences array contains all the words in a sentence
// These values will be modified by the function written in main
wordsArray = [];
sentencesArray = [];

// The main function changes the value of words array and Sentences array initialized above
function main() {

  function generateSentenceArray(string) {
    localArray = [];
    wordToPush = "";
    for (let i = 0; i < string.length; i++) {
      if (string[i] != " ") {
        wordToPush += string[i];
        if (i == string.length - 1) localArray.push(wordToPush);
      } else {
        localArray.push(wordToPush);
        wordToPush = "";
      }
    }
    localArray = localArray.filter((ch) => ch != "");
    wordsArray.push(localArray);
  }

  function generateParaArray() {
    senetencesToPush = "";
    for (let j = 0; j < para.length; j++) {
      if (para[j] != ".") {
        senetencesToPush += para[j];
        if (j == para.length - 1) {
          generateSentenceArray(senetencesToPush);
        }
      } else {
        generateSentenceArray(senetencesToPush);
        senetencesToPush = "";
      }
    }
    sentencesArray = wordsArray;
  }
  generateParaArray();
}

main();

// After changing the values of wordsArray and SentencesArray we loop over the sentencesArray to reverse the sentences
sentencesArray.forEach((sentence) => {
  len = sentence.length - n;
  if (!(len < 0)) {
    sliced_array = sentence.slice(0, len);
    remaining_portion = sentence.slice(len, sentence.length);
    reversed_array = sliced_array.reverse();
    sentence = reversed_array.concat(remaining_portion);
    for (let z = 0; z < sentence.length; z++) {
      output += ` ${sentence[z]}`;
    }
    output += ".";
  }
});

// At last we log the output
console.log(output);
