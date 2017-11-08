import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		
		System.out.println("Hello ASE2017 - How are you? :)");
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		name = in.nextLine();
		HelloUser.greetUser(name);
	}

}
