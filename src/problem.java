import java.util.Locale;
import java.util.Scanner;

public class problem {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		double horatrab, valorhora, horatotal=0, custototal=0;
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
		horatotal = horatrab + horatotal;
	
		System.out.printf("Valor por hora: ");
		valorhora = sc.nextDouble();
		
		while (valorhora < 0) {
			System.out.println("Valor invalido");
			System.out.printf("Valor por hora: ");
			valorhora = sc.nextDouble();
		}
		custototal = (valorhora * horatrab) + custototal;
		
		System.out.printf("Digitar outro (S/N)? ");
		digitar = sc.next().charAt(0);
		
		while (digitar == 's' || digitar == 'S') {
			System.out.printf("Nome: ");
			nome = sc.next();
			
			System.out.printf("Horas trabalhadas: ");
			horatrab = sc.nextDouble();
			
			while (horatrab < 0) {
				System.out.println("Valor invalido");
				System.out.printf("Horas trabalhadas: ");
				horatrab = sc.nextDouble();
			}
			horatotal = horatrab + horatotal;
			
			System.out.printf("Valor por hora: ");
			valorhora = sc.nextDouble();
			
			while (valorhora < 0) {
				System.out.println("Valor invalido");
				System.out.printf("Valor por hora: ");
				valorhora = sc.nextDouble();
			}
			custototal = (valorhora * horatrab) + custototal;
			
			System.out.printf("Digitar outro (S/N)? ");
			digitar = sc.next().charAt(0);
			
		}
		
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
		
		
		/* Tratativas 1/2 */
		while (opcao != 4) {
			if (opcao == 1) {
				System.out.println("");
				System.out.println("Total de horas = " + horatotal);
				System.out.println("");
			}
			else if (opcao == 2) {
				System.out.println("");
				System.out.printf("Custo total = R$ %.2f%n", custototal);
				System.out.println("");
			}
			
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
