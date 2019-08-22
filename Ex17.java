import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		boolean sair = false;
		int cont = 0;
		String[] nome = new String[10];
		String[] tel = new String[10];
		String[] cel = new String[10];
		String[] email = new String[10];
		String[] nasc = new String[10];
		String[] sobrenome = new String[10];
		
		while (sair != true) {
			System.out.println("1 - Criar um novo contato \n2 - Ler todos os contatos \n3 - Consulta de dados \n4 - Sair");
			int val = entrada.nextInt();
			
			switch (val) {
				case 1:	
					System.out.print("\nInforme apenas o primeiro Nome do Contato: ");
					nome[cont] = entrada.nextLine();	
					
					System.out.println("\nInforme o Sobrenome do Contato");
					
					
					System.out.print("\nTelefone do contato: ");
					tel[cont] = entrada.nextLine();
			
					System.out.print("\nCelular do contato: ");
					cel[cont] = entrada.nextLine();
					
					System.out.print("\nEmail do contato: ");
					email[cont] = entrada.nextLine();
			
					System.out.print("\nData de nascimento do contato: ");
					nasc[cont] = entrada.nextLine();
		
					while(nasc[cont].length() != 8) {
						System.out.print("Data de nascimento do contato: ");
						nasc[cont] = entrada.nextLine();
						if(nasc[cont].length() != 8)
							System.out.println("Padrão Invalido\nDD/MM/AAAA (Sem Barras)");
					}
					
					cont++;
				break;
				case 2:
					for(int i = 0; i < cont; i++ ) {
						System.out.println("\n----------------------------------------------------");
						System.out.print("\nContato"+(i + 1)+": ");
						System.out.print("\nNome Completo: "+nome[i]);
						System.out.print("\nTelefone: "+tel[i]);
						System.out.print("\nCelular: "+cel[i]);
						System.out.print("\nE-mail: "+email[i]);
						System.out.print("\nData de Nascimento: "+nasc[i]);
					}
		        break;
				case 3:
					System.out.println("\n1- Consulta por nome ou sobrenome \n2 - Aniversários do mês");
					int menu2 = entrada.nextInt();
					switch(menu2) {
						case 1:
						
						break;
						case 2:
							System.out.print("Informe um mês: ");
							String mes = entrada.nextLine();
							for(int i = 0; i < cont; i++) {
								mes.compareTo(nasc[i].substring(3,5)); 
								if(mes.compareTo.mes.compareToIgnoreCase(nasc[i].substring(3, 5))) {	
								}
							
							}
								
							
							
						break;
					}
						
					
				
				
				break;
				case 4:
					sair = true;
				break;
				
			}
			
		}

		entrada.close();
	}

}
