 class StringMethod{
public static void main(String args[]){
 String value = ("Batch 20 is Toxic");
 System.out.println(value.contains("Toxic"));
 System.out.println(value.concat("My Birth"));
 System.out.println(value.equals("Batch 20 is toxic"));
 System.out.println(value.equalsIgnoreCase("Batch 20 is TOXIC"));
 System.out.println(value.toUpperCase());
 System.out.println(value.toLowerCase());
 System.out.println(value.length());
 System.out.println("charAt():"+ value.charAt(4));

 //CamapreTo()
 System.out.println("compareTo():"+ value.compareTo(val));
 System.out.println("comparreToIgnoreCase(): " + value.compareignoreCase(value));

	
}
}