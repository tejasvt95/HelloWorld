import java.util.Scanner;

public class HelloClassExample {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print("Input your Name:");
		String name = input.next();
		System.out.println();
		System.out.println("Hello \n"+(name)+"");

	}

}
