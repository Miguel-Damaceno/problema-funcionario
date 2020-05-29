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
		
		
	
		
		sc.close();
	}

}
