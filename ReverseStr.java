import java.util.Scanner; 
class ReverseStr{
public static void main(String[] args){
String str = "life", nstr=" ";
char ch ;

     for(int i=0; i<str.length(); i++){
	ch = str.charAt(i);
	nstr = ch+nstr;	

      }

   System.out.println(nstr);
  }
} 