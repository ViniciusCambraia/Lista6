import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int n, soma = 0, media, maior=0, menor=0, par=0, impar=0, acima = 0, abaixo = 0;
		System.out.println("Quantos números serão informados? ");
		n=entrada.nextInt();
		int vetor[] = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.print("-->");
			vetor[i]=entrada.nextInt();
			soma+=vetor[i];
			if(vetor[i]> maior) {
				maior=vetor[i];
			}
			else if(i==1 || vetor[i] < menor) {
				menor=vetor[i];
			}
			if(vetor[i]%2==0) {
				par++;
			}
			else{
				impar++;
			}
		}
		
		media=soma/n;
		for(int i = 0; i<n;i++) {
			if(vetor[i] > media) {
				acima++;
			}
			else if(vetor[i]<media) {
				abaixo++;
			}
		}
		
		
		System.out.println("\n\n\n\n\n\nA soma dos numeros é: "+soma);
		System.out.println("A media é: "+media);
		System.out.println("O maior numero é: "+maior);
		System.out.println("O menor número é: "+menor);
		System.out.println("A quantidade de numeros pares é: "+par);
		System.out.println("A quantidade de numeros impares é: "+impar);
		System.out.println("A quantidade de numeros acima da media é: "+acima);
		System.out.println("A quantidade de numeros abaixo da media é: "+abaixo);
		
		
		entrada.close();
	}

}
