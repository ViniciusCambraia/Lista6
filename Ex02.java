import java.util.Scanner;

public class Ex02 {
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float[] vetor = new float[10];
		for(int i = 0; i<10; i++) {
			System.out.print("Informe um número real: ");
			vetor[i]= entrada.nextFloat();
		}
		System.out.println("\n\n\n\n\nAqui está o vetor na ordem inversa: \n");
		for(int i = 10; i>0 ;i--) {
			System.out.print(vetor[i-1]+"  |  ");
		}
		System.out.println("\n\n\n\n");
		
		
		
		
		entrada.close();
	}
}
