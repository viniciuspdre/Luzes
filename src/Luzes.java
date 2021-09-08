import java.util.Scanner;

public class Luzes {
	public static void main (String[] args) {
		String sur, luz, branca = "Branca", preta = "Preta";
		Scanner scan = new Scanner(System.in);
			System.out.printf("Olá usuário, esse programa indica a cor que você veria dependendo da luz que será refletida em uma superfície.%nEscolha entre as superfícies branca, preta ou alguma outra.%n");
			sur = scan.nextLine();
			System.out.printf("Me diga qual a cor da luz.%n");
			luz = scan.nextLine();
				if (sur.equalsIgnoreCase(branca)) {
					System.out.println("A cor que você verá será: " + luz + ".");
				}
				if (sur.equalsIgnoreCase(preta)) {
					System.out.println("A cor vista será preta, já que ela absorve todas as cores.");
				}
				if (sur.equalsIgnoreCase(luz)) {
					System.out.printf("A cor vista será: %s.", luz);
				}
				if (!sur.equalsIgnoreCase(luz)) {
					System.out.println("A cor vista será preta.");
				}
	}
}
