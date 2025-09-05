/*Write Java program for the following - 
It should  run till user enters any other option than add or sub or multiply or divide
Prompt user to enter the input operation : (add|subtract|multiply|divide) & 2 numbers(double)
Display the result of the operation.
Use Scanner for accepting all inputs from user. */

import java.util.*;

class Calculator{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
System.out.println("enter the two numbers :");

double a= scan.nextDouble();
double b= scan.nextDouble();
	System.out.println("1. addition of two numbers");
	System.out.println("2. subtraction of two numbers");
	System.out.println("3. multiplication of two numbers");
	System.out.println("4. Division of two numbers");
boolean exit=false;

while(!exit){
int n =scan.nextInt();
switch(n){
case 1:
double add= a+b;
System.out.println(add);

break;
case 2:
double sub= a-b;
System.out.println(sub);

break;

case 3:
double multiplication= a*b;
System.out.println(multiplication);

break;

case 4:
double division= a/b;
System.out.println(division);

break;
default:
exit=true;
break;
}
}
scan.close();
}



}

