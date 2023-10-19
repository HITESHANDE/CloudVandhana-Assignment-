let display=document.getElementById("display");
console.log(display);
let btn=document.getElementById("button");
btn.addEventListener("click",()=>{
    let givenString=document.getElementById("input").value;
    // console.log(givenString);
   let arr= givenString.split(" ");
   let arr1="";
    for(let i=0;i<arr.length;i++){
        let res=reverseString(arr[i]);
        arr1+=res+" ";
    }
    // console.log(arr1);   
    display.textContent=`${arr1}`;
})
function reverseString(value){
    let value1="";
    for (let index = 0; index < value.length; index++) {
        value1=value.charAt(index)+value1;
    }
    return value1;
}