import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		
		int[] n =new int[5];
		int soma =0, mult = 1;
		System.out.println("Digite 5 numeros");
		for(int i = 0; i < 5; i++) {
			System.out.print("-->");
			n[i]=entrada.nextInt();
			soma+=n[i];
			mult = mult*n[i];
		}
		System.out.print("\n\n\n--------------------------------------------------------------------------------------------------------------------------\nOs numeros são: \n| ");
		for(int i =0; i<5; i++) {
			System.out.print(n[i]+" | ");
		}
		System.out.println("\n\nO resultado da soma é: "+ soma);
		System.out.println("\n\nO resultado da multiplicação é: "+ mult);
		
		entrada.close();
	}

}
