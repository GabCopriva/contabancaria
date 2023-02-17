package conta;

import java.util.Scanner;

import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
		//Projeto Java - Conta Bancária
		
		//Scanner
		
		Scanner leia = new Scanner (System.in);
		
		//Var
		
		int opcao;
		
		//While
		
		while (true) {
			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
			                  +"*************************************************************");
			System.out.println("                                                             ");
			System.out.println("                  BANCO DO BRAZIL COM Z                      ");
			System.out.println("                                                             ");
			System.out.println("*************************************************************");
			System.out.println("                                                             ");
			System.out.println("              1 - Criar Conta                                ");
			System.out.println("              2 - Listar Todas as Contas                     ");
			System.out.println("              3 - Buscar Conta Por Número                    ");
			System.out.println("              4 - Atualizar Dados da Conta                   ");
			System.out.println("              5 - Apagar Conta                               ");
			System.out.println("              6 - Sacar                                      ");
			System.out.println("              7 - Depositar                                  ");
			System.out.println("              8 - Transferir Valores Entre Contas            ");
			System.out.println("              9 - Sair                                       ");
			System.out.println("                                                             ");
			System.out.println("*************************************************************");
			System.out.println("Entre com a opção desejada:                                  ");
			System.out.println("                                                             "+Cores.TEXT_RESET);
			
			opcao = leia.nextInt();
			
			//IF
			
			if ( opcao == 9 ) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nBanco do Brazil com Z - O seu futuro começa aqui!");
				leia.close();
				System.exit(0);
			}
			//Switch
			
			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE +"Criar conta\n\n");
				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE +"Listar todas as contas\n\n");
				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE +"Consultar dados da conta - por número\n\n");
				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE +"Atualizar dados da conta\n\n");
				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE +"Apagar a conta\n\n");
				break;
			case 6:
				System.out.println(Cores.TEXT_WHITE +"Saque n\n");
				break;
			case 7:
				System.out.println(Cores.TEXT_WHITE +"Depósito\n\n");
				break;
			case 8:
				System.out.println(Cores.TEXT_WHITE +"Transferência entre Contas\n\n");
			break;
			
			default:
				System.out.println(Cores.TEXT_RED_BOLD +"\nOpção inválida!\n");
				break;
			}
		}

	}

}
