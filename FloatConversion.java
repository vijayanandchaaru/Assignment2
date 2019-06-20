public class FloatConversion
			{

  	public static void main(String[] args) {

		    Float obj = new Float(10.50);
    		    byte bte = obj.byteValue();
                    System.out.println("Float convert to byte : "+bte);
		    
		    short sot = obj.shortValue();
                    System.out.println("Float convert to sort : "+sot);

                   int i =  obj.intValue();
                   System.out.println("Float convert to Integer : "+i);

                   float flt = obj.floatValue();
                   System.out.println("Float convert to float : "+flt);

                   double dou = obj.doubleValue();
                   System.out.println("Float convert to Double : "+dou);

  }
}