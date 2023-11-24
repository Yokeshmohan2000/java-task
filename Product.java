import  java.util.Scanner;

class Product{
   public static void main(String args[]){

   Scanner scan = new Scanner(System.in);

   System.out.println("Enter a first number");
   int num1 =  scan.nextInt();
   
   System.out.println("Enter a second number");
   int num2 = scan.nextInt();
  
   int newvalue = num1*num2;
   
System.out.println(newvalue); 
}
}