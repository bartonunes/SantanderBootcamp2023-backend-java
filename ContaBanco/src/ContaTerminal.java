import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
//		String agencia;
//		String nomeCliente;
//		double saldo;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor, digite o n�mero da Ag�ncia!");
		int numero = sc.nextInt();
		
		
		System.out.println("Por favor, digite o nome da Ag�ncia!");
		String	agencia = sc.next();
		
		System.out.println("Por favor, digite o seu Nome!");
		String nomeCliente = sc.next();
		
		System.out.println("Por favor, digite o Saldo!");
		Double saldo = sc.nextDouble();
		
		System.out.println("Ol� " + nomeCliente +" obrigado por criar uma conta no nosso banco, "
		+ "sua ag�ncia � "+agencia+" conta "+numero+ " e seu saldo � "+ saldo+" j� dispon�vel para saque."); 
		
	}
}
