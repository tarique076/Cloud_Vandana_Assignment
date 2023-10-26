var inputArr = [5,8,0,6,1,3,9];

function descSort(arr){
    for(let i=0; i<arr.length; i++){
        for(let j=0; j<arr.length-i-1; j++){
            if(arr[j]<arr[j+1]) swap(arr,j, j+1);
        }
    }
}

function swap(arr, i, j){
    let temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}

descSort(inputArr)

console.log(inputArr);