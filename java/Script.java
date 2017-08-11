import java.util.Scanner;

public class Script {
    
    private double num1;
    private char   operation;
    private double num2;
    private double result;

    public double sum() {
        return num1 + num2;
    }

    public double sub() {
        return num1 - num2;
    }

    public double mul() {
        return num1 * num2;
    }

    public double div() {
        return num1 / num2;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Script  s       = new Script();

        System.out.print("Please enter the first number: ");
        String fInput = scanner.next(); // firstInput
        s.num1 = Double.parseDouble(fInput);

        System.out.print("Please enter the operation: ");
        String operation = scanner.next();
        s.operation = operation.charAt(0); // Convert `String` to `Char`

        System.out.print("Please enter the second number: ");
        String sInput = scanner.next(); // secondInput
        s.num2 = Double.parseDouble(sInput);

        if (s.operation == '/' && s.num2 == 0) {
            System.out.print("You can not divide by 0");
            return;
        }

        if (s.operation == '+') {
            s.result = s.sum();
        } else if (s.operation == '-') {
            s.result = s.sub();
        } else if (s.operation == '*') {
            s.result = s.mul();
        } else if (s.operation == '/') {
            s.result = s.div();
        } else {
            System.out.print("Operation not found, Try one of (+, -, *, /)");
            return;
        }
        
        System.out.print( fInput + ' ' + operation + ' ' + sInput  + " = "  +  s.result);
    }
}