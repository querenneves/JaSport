package jasport;

import java.util.Scanner;

import jasport.util.Cores;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int opcao;
		String titular, cpf, celular, plano;
		float valor;

		while (true) {
			System.out.println(Cores.TEXT_BLUE + Cores.ANSI_BLACK_BACKGROUND
					+ "********************************************************************************");
			System.out.println("                                                                       ");
			System.out.println("       ##    ###    ######   ########   #######  # #######  ########   ");
			System.out.println("       ##   ## ##  ##    ##  ##     ## ##     ## # #     ##    ##      ");
			System.out.println("       ##  ##   ##  ##       ##      # ##     ## # #     ##    ##      ");
			System.out.println("       ## ##     ##  ######  ########  ##     ## # #######     ##      ");
			System.out.println(" ##    ## #########       ## ##        ##     ## # #    ##     ##      ");
			System.out.println(" ##    ## ##     ## ##    ## ##        ##     ## # #     ##    ##      ");
			System.out.println("  ######  ##     ##  ######  ##         #######  # #      ##   ##      ");
			System.out.println("                                                                       ");
			System.out.println("            1 - Cadastrar                                              ");
			System.out.println("            2 - Contratar plano                                        ");
			System.out.println("            3 - Tipos de planos                                        ");
			System.out.println("            4 - Listar planos                                          ");
			System.out.println("            5 - Listar clientes                                        ");
			System.out.println("            6 - Cancelar plano                                         ");
			System.out.println("            7 - Sair                                                   ");
			System.out.println("***********************************************************************");
			System.out.println("Entre com a opção desejada:                                            ");
			System.out.println(
					"                                                                       " + Cores.TEXT_RESET);

			opcao = leia.nextInt();

			if (opcao == 7) {
				System.out.println(Cores.TEXT_CYAN_BOLD + "Unidos pelo esporte, juntos pela vitória!");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:

				System.out.println("Cadastrar Titular\n");

				System.out.println("Digite o nome do Titular: ");
				leia.skip("\\R");
				titular = leia.nextLine();

				System.out.println("Digite o CPF do Titular:");
				cpf = leia.nextLine();

				System.out.println("Digite o telefone do Titular:");
				celular = leia.nextLine();

				break;

			case 2:
				System.out.println("Contratar plano\n  ");
				System.out.println("Digite o pedido do cliente: ");
				leia.skip("\\R");
				plano = leia.nextLine();
				
				break;

			case 3:
				System.out.println("Planos de pacotes\n ");
				
				break;

			case 4:
				System.out.println("Listar planos\n");
				
				break;

			case 5:
				System.out.println("Listar titulares\n");
				
				break;

			case 6:
				System.out.println("Cancelar plano\n");
				
				break;

			default:
				System.out.println("\nOpção Invalida!\n ");

				
				break;
			}
		}
	}

	public static void sobre() {
		System.out.println(Cores.TEXT_WHITE+ "\n   Projeto Criado por:");
		System.out.println(Cores.TEXT_WHITE+ "\n   GitHub:");
		System.out.println("*************************************************");                                                                                                                                                                                                
		System.out.println("                                                 ");                                                                                                                                                                                                
		System.out.println("   Equipe desenvolvedora:                        ");                                                                                                                                                                                             
		System.out.println("                                                 ");                                                                                                                                                                                               
		System.out.println("*************************************************");                                                                                                                                                                                              
		System.out.println("   Ketelyn Medina                                ");                                                                                                                                                                                                
		System.out.println("   GitHub: https://github.com/KetelynMM          ");                                                                                                                                                                                                
		System.out.println("                                                 ");                                                                                                                                                                                              
		System.out.println("*************************************************");                                                                                                                                                                                               
		System.out.println("                                                 ");                                                                                                                                                                                               
		System.out.println("*************************************************");                                                                                                                                                                                               
		System.out.println("   Leticia Oliveira                              ");                                                                                                                                                                                               
		System.out.println("  GitHub: https://github.com/intrxnce            ");                                                                                                                                                                                               
		System.out.println("                                                 ");                                                                                                                                                                                                
		System.out.println("*************************************************");                                                                                                                                                                                                
		System.out.println("                                                 ");                                                                                                                                                                                               
		System.out.println("*************************************************");                                                                                                                                                                                                
		System.out.println("   GitHub: Nicolle Sanches                       ");                                                                                                                                                                                               
		System.out.println("   https://github.com/nicollesanches             ");                                                                                                                                                                                               
		System.out.println("                                                 ");                                                                                                                                                                                               
		System.out.println("*************************************************");                                                                                                                                                                                             
		System.out.println("                                                 ");                                                                                                                                                                                               
		System.out.println("*************************************************");                                                                                                                                                                                             
		System.out.println("   GitHub: https://github.com/querenneves        ");                                                                                                                                                                                             
		System.out.println("                                                 ");                                                                                                                                                                                             
		System.out.println("*************************************************");                                                                                                                                                                                           
		System.out.println("                                                 ");                                                                                                                                                                                             
		System.out.println("*************************************************");                                                                                                                                                                                                                               
	}

	}

