class Student18 implements Cloneabale{
int rollno;
String name;

Student18(int rollno,String name){
this.rollno=rollno;
this.name=name;
}

public object clone()throws CloneNotSupportException{
return super.clone();
}

public static void main(String args[]){
try{
Student18 s1=new Student18(101,"amit");

Student18 s2=(Student18)s1.clone();

System18 s2=(Student18)s1.clone();

System.out.println(s1.rollno+""+s1.name)
}
}
}