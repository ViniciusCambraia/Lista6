import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner (System.in);
		float [] notas=new float[4];
		float media = 0;
		System.out.println("Insira 4 notas: ");
		
		for(int i = 0; i < 4; i++){
			System.out.print("-->");
			notas[i]=entrada.nextFloat();
			media+=notas[i];
		}
		
		System.out.println("\n\nAs 4 notas são: ");
		System.out.print("\n| ");
		
		for(int i =0; i < 4 ;i++) {
			System.out.print(notas[i]+" | ");
		}
		
		
		media=media/4;
		System.out.println("\n\nE a media é: \n\n"+media);
		
		
		entrada.close();

	}

}
