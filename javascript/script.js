const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});
let num1, num2, sign, result;
function clac(n1, s, n2) {
    n1 = Number(n1);
    n2 = Number(n2);
    var res;
    switch (sign) {
        case '+':
            res = n1 + n2;
            break;
        case '-':
            res = n1  - n2;
            break;
        case '*':
            res = n1  * n2;
            break;
        case '/':
            res = n1  / n2;
            break;
    }
    return res;
}
rl.question('Please enter the first number? ', (answer) => {
    num1 = answer;
    rl.question("Please enter the sign?", (answer) => {
        sign = answer;
        rl.question("Please enter the second number", (answer) => {
            num2 = answer;
            rl.close();
            if (sign === '/' && num2 == 0) {
                console.log("When sign is / num2 must not be 0")
            } else {
                result = clac(num1, sign, num2);
                console.log(`${num1} ${sign} ${num2} = ${result}`);
            }
        });
    });
});