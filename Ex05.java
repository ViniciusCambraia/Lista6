import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		char[] n = new char[10];
		char[] c = new char[10];
		int cont = 0;
		System.out.println("Digite uma letra: ");
		
		for(int i=0; i<10;i++) {
			n[i]=entrada.next().charAt(n[i]);
			if(n[i]=='a'||n[i]=='e'||n[i]=='i'||n[i]=='o'||n[i]=='u') {
				cont++;
			}
			else {
				c[i]=n[i];
			}
			
		}
		System.out.println("Foram digitadas "+cont+" consoantes ");
		System.out.println("Essas são as consoantes: \n");
		for(int i =0;i<10;i++) {	
			System.out.println(c[i]+"  ");
		}
		
		
		entrada.close();
	}

}
