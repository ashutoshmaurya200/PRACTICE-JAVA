/*4.1 Write Java program - 
Display food menu to user. User will select items from menu along with the quantity. (eg 1. Dosa 2. Samosa 3. Idli ... 0 . Generate Bill ) Assign fixed prices to food items(hard code the prices)
When user enters 'Generate Bill' option(0) , display total bill & exit.*/

import java.util.*;
class GenerateBill{
	public static void main(String[] args){

	System.out.println("welcome to the menu");
	System.out.println("1. Dosa ,price = 50 rs");
	System.out.println("2. Samosa ,price =10rs");
	System.out.println("3. Idli , price = 20rs");
        System.out.println("4. Generate the total bill");

	Scanner sc= new Scanner(System.in);
	
	boolean exit =false;
	int sum=0;
	while(!exit){
	int n =sc.nextInt();
	switch(n){
	case 1:
	System.out.println("enter the quantity of Dosa ");
	int a= sc.nextInt();
	sum=sum+a*50;
		break;

	case 2:
	System.out.println("enter the quantity of Samosa ");
	int b= sc.nextInt();
	sum=sum+b*10;

		break;

	case 3:
	System.out.println("enter the quantity of Idli ");
	int c= sc.nextInt();
	sum=sum+c*50;
		break;

	default:
	System.out.println("the total bill = " +sum);
	exit =true; 
		break;



	}




}

sc.close();
	


}





}