import java.util.Scanner;
class Sri{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);

System.out.println("Enter First Number");
int num1 = scan.nextInt();

System.out.println("Enter a Second number");
int num2 = scan.nextInt();

System.out.println("Enter Third number");
int num3 = scan.nextInt();

System.out.println("Enter Fourth number");
int num4 = scan.nextInt();

int big1 = num1>num4 ?  num1 :num4;

int big2 = num2>num3 ? num2 :num3;


int orgbig = big1>big2 ? big1 : big2;

System.out.println("The big number is :"+big1); 
}
}