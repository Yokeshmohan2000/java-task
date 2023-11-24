import java.util.Scanner;
class ScannerExample{
public static void main(String args[]){
Scanner scan  = new Scanner(System.in);
System.out.println("enter your email :");
String email = scan.nextLine();
System.out.println("enter your phoneNumber");
long phoneNumber = scan.nextLong();
System.out.println("-------------");
System.out.println("your email is "+email);
System.out.println("your phoneNumber is"+phoneNumber);
 
}
}