num1 = float(input('Please enter the first number:\n'))
sign = input('Please enter the sign (+, -, /, *):\n')
num2 = float(input('Please enter the second number:\n'))
result = None

if sign == '/' and num2 == 0 :
  print("When sign is / then second number must not be equal to 0")
elif sign == '+':
    result = num1 + num2
elif sign == '-':
    result = num1 - num2
elif sign == '*':
    result = num1 * num2
elif sign == '/':
    result = num1 / num2
else:
    print("Something went wrong!")
    
if (result != None):
    print(str(num1) + " " + sign + " " + str(num2) + " = " + str(result))
else:
    print(result)