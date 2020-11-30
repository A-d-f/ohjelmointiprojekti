import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		String vastaus;
		tulostaOtsikko();
		
		
		System.out.println(" ");
		System.out.println("Haluatko tilata s‰mpyl‰n?(k/e)?");
		vastaus=in.nextLine();
		
	}
	
	

	
	
public static void tulostaOtsikko() {
	System.out.println("__________         __                 __   .__.__               .__          \r\n" + 
				"\\______   \\_____ _/  |_  ____   ____ |  | _|__|  |  __ __  ____ |  | _____   \r\n" + 
				" |     ___/\\__  \\\\   __\\/  _ \\ /    \\|  |/ /  |  | |  |  \\/  _ \\|  | \\__  \\  \r\n" + 
				" |    |     / __ \\|  | (  <_> )   |  \\    <|  |  |_|  |  (  <_> )  |__/ __ \\_\r\n" + 
				" |____|    (____  /__|  \\____/|___|  /__|_ \\__|____/____/ \\____/|____(____  /\r\n" + 
				"                \\/                 \\/     \\/                              \\/");
}
} //Main p‰‰ttyy




