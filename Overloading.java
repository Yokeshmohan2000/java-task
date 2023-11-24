class Overloading{


  Overloading(){
      System.out.println("default");	
  }
  
  Overloading(String s,int i ){
      
      System.out.println(s + i);
  }
  
  Overloading(int i,String s){
     
      System.out.println(i + s);
  }
  
  Overloading(String s){
  
  System.out.println(s);
 
  } 
  Overloading( int i){
      
      System.out.println(i);
  }

  //call Main method

  public static void main(String args[]){
    
   Overloading obj1 = new Overloading(50);
   Overloading obj2 = new Overloading();
   Overloading obj3 = new Overloading("Wellcome");
   Overloading obj4 = new Overloading(50,"Wellcome");
   Overloading obj5 = new Overloading("Wellcome",50); 
    
  }
	
}