class Callingfun {
	public int data = 5;
	void display( Callingfun p) {
		p.data = p.data + 10;
	}
	public static void main(String args[] ) {
	Callingfun obj = new Callingfun();
	System.out.println("Before Calling the function is :"+obj.data);	
          obj.display(obj);

	System.out.println("After calculating value from function is :"+obj.data);
	}

}		