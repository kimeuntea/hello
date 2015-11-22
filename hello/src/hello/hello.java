package hello;
/*git teset*/
public class hello {
	public static void main(String[] args) {
		System.out.println("������ ");
		for (int i = 1; i < 10; i++) {
			System.out.println("\n");
			for (int j = 2; j < 6; j++) {
				System.out.print(j + "*" + i + "=" + i * j + "\t");
			}
		}
		System.out.println("\n\n");
		for (int i = 1; i < 10; i++) {
			System.out.println("\n");
			for (int j = 6; j < 10; j++) {
				System.out.print(j + "*" + i + "=" + i * j + "\t");
			}
		}
	}
}

