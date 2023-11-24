import java.util.Scanner;
public class TimeConversion {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Second you want convert into hour,Minutes");
        short second=sc.nextShort();
        System.out.println(second+"second in Hour = "+second/3600);
        System.out.println(second+" second in Minutes= "+second/60);
        
    }
    
}