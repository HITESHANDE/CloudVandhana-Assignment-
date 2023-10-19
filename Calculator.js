let body=document.body;
console.log(body);
let display=document.getElementsByClassName("display");
console.log(display);
console.log(display[0].value);

function appendToDisplay(value){
    display[0].value+=value;
}
function clearDisplay(){
display[0].value="";
}
function AnswerDisplay(){
    try{
    let res=eval(display[0].value);
    display[0].value=res;
    }catch{
        console.log("Invalid Calculation");
    //    body.innerHTML+=`"Invalid Calculation";`
    }
}