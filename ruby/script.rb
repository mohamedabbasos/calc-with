puts "Please, Enter the first number ?"
num1 = gets.chomp.to_f
puts "Please, Enter the sign (+, -, *, /) ?"
sign = gets.chomp
puts "Please, Enter the second number ?"
num2 = gets.chomp.to_f

if sign == "/" && num2 == 1 then
    puts "When sign is / then the second number must not be zero!"
elsif sign == "+" then
    res = num1 + num2
    puts "The result of "  + num1.to_s  + " " + sign.to_s  + " " + num2.to_s  + " = " + res.to_s
elsif sign == "-" then
    res = num1 - num2
    puts "The result of "  + num1.to_s  + " " + sign.to_s  + " " + num2.to_s  + " = " + res.to_s
elsif sign == "*" then
    res = num1 * num2
    puts "The result of "  + num1.to_s  + " " + sign.to_s  + " " + num2.to_s  + " = " + res.to_s
elsif sign == "/" then
    res = num1 / num2
    puts "The result of "  + num1.to_s  + " " + sign.to_s  + " " + num2.to_s  + " = " + res.to_s
end