///let example of default constructor
//which display the default values and parameterized constructor

    class Student3{
    //int i;
    //String name;
							//method to display the value of id and name
    
    void display(int i , String name) {System.out.println(i+" "+name);}

    public static void main(String args[]){
    
 							 //creating object

    Student3 s1 = new Student3();
    Student3 s2 = new Student3();

 							 
							
                                                       //display values of the object and passing values
  
    s1.display(111,"yoki");
    s2.display(111,"ragu");
    }
}