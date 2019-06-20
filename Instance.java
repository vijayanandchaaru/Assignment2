class Instan { 

 public int a;
 public String b;
 static int va;

            }
public class Instance { 

	public static void main(String [] args) {

	Instan one = new Instan();

	one.b="anand";
	Instan.va=12;
	System.out.println(one.b+"  " +one.a+"   "+Instan.va);

	}

//Instance variable program
}