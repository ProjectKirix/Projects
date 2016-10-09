import java.util.Scanner;

public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1 = new Person(10, "Rick");
		Person person2 = new Person(10, "David");
		
		System.out.println(person1.toString());
		System.out.println(person2.toString());
		
		Scanner ks = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String nameNew = ks.nextLine();
		System.out.println("Fuck you "+nameNew);
	}

}
