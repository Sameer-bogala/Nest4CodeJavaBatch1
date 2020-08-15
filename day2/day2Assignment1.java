
public class day2Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       float resultheight=heightConverter(5,11);
       float resultweight=weightConverter(60);
       System.out.println("helloworld");
       System.out.println("Height in cm :"+resultheight+"cm");
       System.out.println("weight in pounds :"+resultweight+"pounds");
	}
public static float heightConverter(int heightFeetPart,int InchPart) {
	    
      
      double centiMeters=(heightFeetPart*(12*2.54))+(InchPart*2.54);
       float resultcm=(float)centiMeters;//external type conversion
       return resultcm;
}
public static float weightConverter(int weight) {
	double pounds=(weight*2.2); 
	float resultpd=(float)pounds;//external type conversion
	return resultpd;
}
}