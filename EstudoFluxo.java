import java.util.Scanner;

public class EstudoFluxo {

	public static void main(String[] args) {
		// permite ler dados de entrada
		// do usuário ou de um arquivo de texto em um programa Java.
		Scanner scan = new Scanner(System.in); // estância Scanner
		int idade = 0;

		while (idade == 0) { // O while bloco de código a ser repetido
								// enquanto a condição for verdadeira
			try {
				System.out.println("Qual a Sua Idade?");
				idade = scan.nextInt();
			} catch (Exception z) {
				System.out.println("Por favor, insira apenas números.");
				scan.next();// scan.next() limpa o buffer do scanner
				// O método "next()" então lê o próximo token
				// (ou seja, o próximo conjunto de caracteres 
				//separados por espaços em branco,
				// como uma palavra ou um número)
				// e retorna esse valor como uma string.
			}
		}
		System.out.println("Sua idade é " + idade);
		if (idade <= 20) {
			System.out.println("Você é muito Novo :( ");
		}
		else {
			System.out.println("Acesso Liberado!.");
		}

		if (idade == 0) {
			System.out.println("Por favor Insira apenas Número");
		}

	}
}
