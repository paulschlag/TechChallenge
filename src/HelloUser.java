import java.util.Scanner;

public class HelloUser {
	
	public static String userName;
	
	public static void main(String name) {
		userName = name;
	}
	
	public static void greetUser(String name) {
		System.out.println("Hello, "+name);		
	}
}
