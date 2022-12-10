import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("Por favor, informe seu primeiro nome:");
		String nomeCliente = sc.next();
		System.out.println("Por favor, informe seu sobrenome:");
		String sobrenomeCliente = sc.next();
		System.out.println("Por favor, informe o número da agência de sua preferência:");
		String agencia = sc.next();
		System.out.println("Por favor, crie um número da conta:");
		int conta = sc.nextInt();
		System.out.println("Por favor, realize um depósito para possuir um valor inicial:");
		double saldo = sc.nextDouble();
		System.out.println("Olá " + nomeCliente + " " + sobrenomeCliente + ", obrigado por criar sua conta no PontualBank. Sua agência é a de número " + agencia + " e sua conta é a de número " + conta + ", com saldo inicial de R$" + saldo + ".");
	}
}