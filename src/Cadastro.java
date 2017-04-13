import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cadastro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int option = 0;
		int users = 0;
		List<Cliente> clientes = new ArrayList<Cliente>();
		
		while (option != 4) {
			System.out.println("============================");
			System.out.println("|   SELECIONE UMA OPÇÃO    |");
			System.out.println("============================");
			System.out.println("| 1. CADASTRAR UM CLIENTE  |");
			System.out.println("| 2. PESQUISAR UM CLIENTE  |");
			System.out.println("| 3. LISTAR CLIENTES       |");
			System.out.println("| 4. SAIR                  |");
			System.out.println("============================");
			
			option = input.nextInt();
			
			switch (option) {
		        case 1:
					System.out.println("============================");
					System.out.println("|   CADASTRAR UM CLIENTE   |");
					System.out.println("============================");

				    System.out.println("Informe o nome do cliente:");
				    String nome = input.nextLine();
				    
				    System.out.println("Informe o RG do cliente:");
		            String registroGeral = input.nextLine();
		            
		            System.out.println("Informe o telefone do cliente:");
		            String telefone = input.nextLine();
		            
		            Cliente c = new Cliente(nome, registroGeral, telefone);
		            clientes.add(c);
		        case 2:
		        	System.out.println("Opção " + option);
		            break;
		        case 3:
					System.out.println("============================");
					System.out.println("|    LISTA DE CLIENTES     |");
					System.out.println("============================");
					
					if(clientes.size() <= 0){
						System.out.println("|       Não existem        |");
						System.out.println("|   clientes cadastrados   |");
						System.out.println("============================");
					} else {
						System.out.println(
								String.format("%-20s", "NOME") + "\t" +
			                    String.format("%-10s", "RG") + "\t" +
			                    String.format("%-15s", "TELEFONE"));
						for (int i = 0; i < clientes.size(); i++) {
							System.out.println(
									String.format("%-20s", clientes) + "\t" +
			                        String.format("%-10s", clientes) + "\t" +
			                        String.format("%-15s", clientes));
						}
					}

		            break;
		        case 4:
		            System.out.println("Encerrando o sistema.");
		            break;
		        default:
		            System.out.println("Opção inválida, tente novamente.");
			}
			
		}
		
		input.close();
	}

}
