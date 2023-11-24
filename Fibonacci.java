import java.util.Scanner;
class Fibonacci{
public static void main(String args[]){
System.out.println("Enter  series num");
Scanner scan = new Scanner(System.in);
int end = scan.nextInt();

int a = -1;
int b = 1;
int c = 0;
for( int i = 0; i <= end; i++){
	c = a+b;
	  a = b;
	  b = c; 		
 //System.out.println("the Fibonacci value is :"+c);	
}
}
}