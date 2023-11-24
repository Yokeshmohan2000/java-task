class  RecrusionEx{
public int sum(int num){
if(num==1){

return 1;
}else{
 
return sum(num-1)+num;
}
}

  public static void main(String args[]){
  //object create
  RecrusionEx obj = new RecrusionEx();
  System.out.println(obj.sum(4));
  }
}