import java.util.Scanner;

public class Luzes {
	public static void main (String[] args) {
		String sur, luz, branca = "Branca", preta = "Preta";
		Scanner scan = new Scanner(System.in);
			System.out.printf("Ol� usu�rio, esse programa indica a cor que voc� veria dependendo da luz que ser� refletida em uma superf�cie.%nEscolha entre as superf�cies branca, preta ou alguma outra.%n");
			sur = scan.nextLine();
			System.out.printf("Me diga qual a cor da luz.%n");
			luz = scan.nextLine();
				if (sur.equalsIgnoreCase(branca)) {
					System.out.println("A cor que voc� ver� ser�: " + luz + ".");
				}
				if (sur.equalsIgnoreCase(preta)) {
					System.out.println("A cor vista ser� preta, j� que ela absorve todas as cores.");
				}
				if (sur.equalsIgnoreCase(luz)) {
					System.out.printf("A cor vista ser�: %s.", luz);
				}
				if (!sur.equalsIgnoreCase(luz)) {
					System.out.println("A cor vista ser� preta.");
				}
	}
}
