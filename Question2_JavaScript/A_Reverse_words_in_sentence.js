var input = "This is a sunny day";

function reverseWords(input){
    let arr = input.split(" ");

    let ans = "";
    for(let i=0; i<arr.length; i++){
        ans += rev(arr[i]) + " ";
    }
    return ans;
}
function rev(str){
  let revStr = "";
  for(let i=str.length-1; i>=0; i--){
    revStr += str[i];
  }
  return revStr;
}
console.log(reverseWords(input));