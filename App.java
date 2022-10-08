import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a word or phrase: ");
		String ui = kb.nextLine();
		AsteriskLogger Log1 = new AsteriskLogger();
		SpacedLogger Log2 = new SpacedLogger();
		//String test = "Hello";

		Log1.Log(ui);
		System.out.println("\n");
		Log1.Error(ui);
		System.out.println("\n");
		Log2.Log(ui);
		System.out.println("\n");
		Log2.Error(ui);

	}

}
