import java.util.Locale;
import java.util.Scanner;

public class problem {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		double horatrab, valorhora;
		char digitar;
		
		System.out.printf("Nome: ");
		nome = sc.next();
		
		System.out.printf("Horas trabalhadas: ");
		horatrab = sc.nextDouble();
		
		while (horatrab < 0) {
			System.out.println("Valor invalido");
			System.out.printf("Horas trabalhadas: ");
			horatrab = sc.nextDouble();
		}
		
		System.out.printf("Valor por hora: ");
		valorhora = sc.nextDouble();
		
		while (valorhora < 0) {
			System.out.println("Valor invalido");
			System.out.printf("Valor por hora: ");
			valorhora = sc.nextDouble();
		}
		
		System.out.printf("Digitar outro (S/N)? ");
		digitar = sc.next().charAt(0);
		
		/* Impressão do menu */
		System.out.println("");
		System.out.println("MENU");
		System.out.println("1 - Total de horas trabalhadas");
		System.out.println("2 - Custo total");
		System.out.println("3 - Nome da pessoa que ganhou mais");
		System.out.println("4 - Sair");
		System.out.println("Digite uma opção: ");
		
		int opcao;
		opcao = sc.nextInt();
		
		while (opcao != 4) {
			System.out.println("MENU");
			System.out.println("1 - Total de horas trabalhadas");
			System.out.println("2 - Custo total");
			System.out.println("3 - Nome da pessoa que ganhou mais");
			System.out.println("4 - Sair");
			System.out.println("Digite uma opção: ");
			opcao = sc.nextInt();
		}
		
	
		
		sc.close();
	}

}
