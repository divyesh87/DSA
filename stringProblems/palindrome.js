string = "deed";

function palindrome(string) {
    for (let i = 0; i < string.length; i++) {
        if (!(string[i] == string[(string.length - 1) - i])) {
            return false;
        }   
    }
    return true;
}

console.log(palindrome(string));