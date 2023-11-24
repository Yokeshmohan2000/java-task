import java.util.Scanner;
class Calculator{
public static void main(String args[]){

Scanner scan = new Scanner(System.in);
 System.out.println("Enter a First Number");

int num1 = scan.nextInt();
System.out.println("Enter a Second Number");

int num2 = scan.nextInt();

System.out.println("Enter any Symbol ( + , - , * , / , % ) then perform calculation");

char symbol = scan.next().charAt(0) ;

switch(symbol){
 
  case '+' :
  int add = num1 + num2;
  System.out.println("The Answe is : "+ add);
  break;
  

  case  '-' :
  int sub = num1 - num2;
  System.out.println("The Answe is : "+ sub);
  break;
  

  case '*' :
  int mul = num1 * num2;
  System.out.println("The Answe is : "+ mul);
  break;
  
  
  case '/' :
  int div = num1 / num2;
  System.out.println("The Answe is : "+ div);
  break;
  

  case '%' :
  int rem = num1 % num2;
  System.out.println("The Answe is : "+ rem);
  break;
  
}
}
}