import java.util.Properties;
class Syspro { 
	public static void main(String [] args) {
	Properties p = System.getProperties();
	p.forEach((k,v)->System.out.println(k +"="+v)) ;
	}
}