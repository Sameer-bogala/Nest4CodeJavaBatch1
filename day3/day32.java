import java.util.Scanner;

public class day32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan=new Scanner(System.in);
		System.out.println("enter ur first String:");
		String str1=Scan.next();
		System.out.println("enter ur second string:");
		String str2=Scan.next();
		
     int length1=str1.length();
     int length2=str2.length();
     if((length1<=4) && (length2<=4)) {
     System.out.println("your inputs are:");
     
     System.out.println("str1= "+str1);
     System.out.println("str2= "+str2);
     System.out.println("lengthof string1= "+length1);
     System.out.println("length of string2= "+length2);
     String result1=str1.replace(str1.substring(0,2),str2.substring(length2-2,length2));
     String result2=result1.replace(str1.substring(length1-2,length1),str2.substring(0,2));
      System.out.println("the required outputs are:");
     //System.out.println(result1);
     System.out.println("replaced Str1 = "+result2);
     String result3=str2.replace(str2.substring(0,2),str1.substring(length1-2,length1));
     String result4=result3.replace(str2.substring(length2-2,length2),str1.substring(0,2));
     //System.out.println(result3);
     System.out.println("replaced str2 = "+result4);
     }
     else {
    	 System.out.println(" warning:enter both strings with length 4");
     }
	}
}
