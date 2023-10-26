let display = document.getElementById("screen");
    let currentInput = "";
    let currentOperation = "";

    function appendToDisplay(value) {
        if(value=='x') value = '*'

        if(currentInput[currentInput.length-1]=='*' || currentInput[currentInput.length-1]=='+' || currentInput[currentInput.length-1]=='-' || currentInput[currentInput.length-1]=='/'){
            if(value=='*'||value=='/'||value=='-'||value=='+'){
                currentInput = currentInput.substring(0,currentInput.length-1) + value;
            }else{
                currentInput += value;
            }
        }else if(currentInput.includes(".") && value =='.'){
                currentInput +='';
        
        }else{

            currentInput += value;
        }

        display.innerHTML = currentInput;
    }

    function clearDisplay() {
        currentInput = "";
        display.innerHTML = "";
    }

    function calculateResult() {
        try {
            let result = eval(currentInput);
            display.innerHTML = result;
            currentInput = ""+result;
        } catch (error) {
            display.value = "Error";
            currentInput = "";
        }
    }