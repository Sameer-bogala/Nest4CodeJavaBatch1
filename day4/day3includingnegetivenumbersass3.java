import java.util.Scanner;

public class day3includingnegetivenumbersass3 {


	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("enter ur number ex=-234569000002:");
          long num=Scan.nextLong();
          System.out.println("your input number:"+num);
          long pnum=Math.abs(num);
          System.out.println(pnum);
          String str=String.valueOf(pnum);
          
          int count=0;
          if(pnum>0) {
        	     for(int i=0;i<str.length();i++) {
    		         if(str.charAt(i)%2==1) {
        		  
   			          count+=1;
   			   
   		           }
   		 
   		 
   	            } ;
   	         System.out.println("the required output is :");
              System.out.println("the odd value digits="+count);
              count=0;
        	     for(int i=0;i<str.length();i++) {
        		  //System.out.println(str.charAt(i)%2==0);
        		    if(str.charAt(i)%2==0) {
        			   count+=1;
        			
        		       }
        	  };
            
            System.out.println("the even value digits="+count);
            count=0;
        	   
          }
         else {
        	 System.out.println("enter a valid number:"); 
          }
	}

}