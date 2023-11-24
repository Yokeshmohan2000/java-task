import java.util.Arrays;
class ArrayEx{
public static void main(String args[]){
int val[] = new int[3];
val[0]=3;
val[1]=2;
val[2]=1;
System.out.println(val.length);
System.out.println(val[0]);
Arrays.sort(val);
System.out.println(val[0]);
}
}