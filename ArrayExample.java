import java.util.Arrays;
class ArrayExample{
public static void main(String args[]){
int val[] = {4,11,2,5,3,6,7,8,9};
int val2[] = {1,2,3,4};

//copyof
int val3[] = Arrays.copyOf(val2,7);
System.out.println("copyOf :" + Arrays.toString(val3));

//Array equals
System.out.println("Array equals :" + Arrays.equals(val,val2));

//String split
String data = "yoki,bala,ragu,hari,arun,ganesh";
String name[] = data.split(",");
System.out.println(data);
System.out.println(Arrays.toString(name));

//deepEquals
int t1[][] = {{1,2},{3,4}};
int t2[][] = {{1,2},{3,4}};
System.out.println(Arrays.equals(t1,t2));
System.out.println(Arrays.deepEquals(t1,t2));

//forEach
for(int i : val){
System.out.print(i+" ");

//star 
  for(int j=0; j<=5; j++){
  	 
     for(int k=0; k<=5; k++){
     System.out.print("*");
     }
      System.out.println(" ");	
  }
}
}
}