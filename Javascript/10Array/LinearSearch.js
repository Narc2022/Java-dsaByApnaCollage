
let arr = [12,24,87,56,45,36,58];
let search = 45;

for (let i = 0; i < arr.length-1; i++) {
    if (arr[i]===search) {
        console.log("Location of search : " + i);
    }
}