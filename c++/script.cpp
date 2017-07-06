#include <iostream>
#include <conio.h>
void main () 
{
	double num1, num2, res;
    char opr;

    cout << "First Number :" << endl;
    cin >> num1;

	cout << "Oprator : allowed ( +, -, *, /)" << endl;
    cin >> opr;

    cout << "Second Number :" << endl;
    cin >> num2;

    if (opr != '+' && opr != '-' && opr != '*' && opr != '/') {
        cout << "Allowed oprators are (+, -, *, /)";
        getch();
        return;
    } else if (opr == '/' && num2 == 0) {
        cout << "When oprator is /, Then Second number musn't be zero";
        getch();
        return;
    } else if (opr == '+'){
        res = num1 + num2;
    } else if (opr == '-') {
        res = num1 - num2;
    } else if (opr == '*') {
        res = num1 * num2;
    } else if (opr == '/') {
        res = num1 / num2;
    }

    cout << "Your result is : \n";
    cout << res;

    getch();
}