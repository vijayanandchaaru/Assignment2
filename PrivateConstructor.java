class Pvtconstructor {

		public String name = "anand"; 
		static Pvtconstructor one = null;
		private Pvtconstructor() {}
		static public Pvtconstructor getInstance () 
		{

		if(one == null)	
		{
			one = new Pvtconstructor();

	     	}
		return one;
		}

}


class  PrivateConstructor   {
	public static void main(String[] args) {
	
	Pvtconstructor y = Pvtconstructor.getInstance();
	System.out.println(y.name);
	}
}
	
	
	

	