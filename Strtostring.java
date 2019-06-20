class Demo {

public String name;
public String dept;
public Integer age;

Demo(String name,String dept,Integer age) {

this.name = name;
this.dept = dept;
this.age =  age;
}
public String toString()
{
return String.format("%-20s%-20s%-20s",this.name,this.dept,this.age);

}
}

class Strtostring {
	public static void main(String [] args) {
		Demo d = new Demo("anand","cse",21);
		String str = String.format("%-20s%-20s%-20s","Name","Department","Age");
		System.out.println(str);
		System.out.println(d);
	}
}