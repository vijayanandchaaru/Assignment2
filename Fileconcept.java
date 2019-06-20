import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
class Fileconcept {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int choice;
		File myfile = new File("E://files/Fileone.txt");
		FileWriter fWriter = null;
		BufferedWriter bWriter = null;
		PrintWriter prin = null;
		do {
		System.out.println("1.File creation \n2.File delete");
		choice = sc.nextInt();
		sc.nextLine();
		switch(choice) {
		case 1:
		{
		System.out.println("File creation");
		try {
		if(!myfile.exists())
			{
			myfile.createNewFile();
			System.out.println("File created");
			System.out.println("Enter the String to store in file");
			String contents = sc.nextLine(); 
			fWriter = new FileWriter(myfile);
			bWriter = new BufferedWriter(fWriter);
			bWriter.write(contents);
			bWriter.close();
			fWriter.close();

	
			}
		else
			{
	
		System.out.println("File is already exit");
		System.out.println("Enter the String ");
		String str = sc.nextLine();
		fWriter = new FileWriter(myfile);
		bWriter = new BufferedWriter(fWriter);
		//prin = new PrintWriter(fWriter);	
		bWriter.write(str);
		bWriter.newLine();
		          }
		bWriter.close();
		prin.close();
		fWriter.close();
		}catch (Exception e)
			{
			System.out.println("error");
			}
		break;
		}
		case 2:
		{
		System.out.println("File deletion");
		try {
		if(myfile.delete())
		System.out.println("File is Deleted successfully");
		else 
		System.out.println("File is not fountd");
		}
		catch (Exception e)
		{
		System.out.println(e.getMessage());	
		}
		break;
		}
		}
		}while(choice <=2);
	}
}