import java.util.Scanner;

public class Ex01 {
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int[] vetor = new int[5];
		for(int i = 0; i<5; i++) {
			System.out.print("Informe um n�mero: ");
			vetor[i]= entrada.nextInt();
		}
		System.out.println("\n\nAqui est� o vetor: \n##############");
		
		for(int i = 0;i<5;i++) {
			System.out.print(vetor[i]+" ");
		}
		System.out.println("\n##############");
		entrada.close();
	}
}
