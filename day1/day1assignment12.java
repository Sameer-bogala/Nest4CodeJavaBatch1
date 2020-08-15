
public class day1assignment12 {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
	       double result=calu(15.5,4.5,30,5);
	        System.out.println("helloworld");
	        System.out.println("thefinalanswer is"+result);
		}
	    public static double calu(double item1,double item2,double item3 ,double tax) {
	    	double sumProd=item1+item2+item3;
	    	double taxAmount=(tax/100)*sumProd;
	    	double finalAmount=taxAmount+sumProd;
	    	return finalAmount;
	    }
	}
