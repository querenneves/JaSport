package jasport;

import java.util.Scanner;

import jasport.util.Cores;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int opcao, planos, escolha;
		String celular, titular, cpf;
		float valor;

		while (true) {
			System.out.println(Cores.TEXT_CYAN + Cores.ANSI_BLACK_BACKGROUND
					+ "°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
			System.out.println("                                                                       ");
			System.out.println("                                                                       ");
			System.out.println("        ##    ###    ######   ########   #######  # #######  ########  ");
			System.out.println("        ##   ## ##  ##    ##  ##     ## ##     ## # #     ##    ##     ");
			System.out.println("        ##  ##   ##  ##       ##      # ##     ## # #     ##    ##     ");
			System.out.println("        ## ##     ##  ######  ########  ##     ## # #######     ##     ");
			System.out.println("  ##    ## #########       ## ##        ##     ## # #    ##     ##     ");
			System.out.println("  ##    ## ##     ## ##    ## ##        ##     ## # #     ##    ##     ");
			System.out.println("   ######  ##     ##  ######  ##         #######  # #      ##   ##     ");
			System.out.println("                                                                       ");
			System.out.println("                                                                       ");
			System.out.println("                        1 - Cadastrar                                  ");
			System.out.println("                        2 - Listar planos                              ");
			System.out.println("                        3 - Contratar plano                            ");
			System.out.println("                        4 - Cancelar plano                             ");
			System.out.println("                        5 - Sair                                       ");
			System.out.println("                                                                       ");
			System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
			System.out.println("                                                                       ");
			System.out.println("Entre com a opção desejada:                                            ");
			System.out.println("                                                                       ");
			System.out.println(
					"                                                                       " + Cores.TEXT_RESET);

			opcao = leia.nextInt();

			if (opcao == 4) {
				System.out.println(Cores.TEXT_CYAN_BOLD + "Unidos pelo esporte, juntos pela vitória!");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:

				System.out.println("Cadastrar Clientes\n");

				System.out.println("Digite do titular: ");
				leia.skip("\\R");
				titular = leia.nextLine();

				System.out.println("Digite o CPF do cliente: ");
				cpf = leia.nextLine();

				System.out.println("Digite o celular: ");
				celular = leia.nextLine();

				break;

			case 2:

				System.out.println("Nossos planos");
				System.out.println("\n\t1- Basic Mensal \tR$  60,00");
				System.out.println("\t2- Premium Mensal \tR$ 100,00");
				System.out.println("\t3- Basic Mensal  \tR$ 612,00  c/ (desconto de 15%)");
				System.out.println("\t4- Premium Anual \tR$ 960,00 c/ (desconto de  20%)");
				System.out.println("\nEscolha um plano: ");
				escolha = leia.nextInt();

				switch (escolha) {

				case 1:
					System.out.println("Pacote Mensal Basic Todos os Esportes $60,00");
					break;
				case 2:
					System.out.println("Pacote Mensal Premium Todos os Esportes + treinador $100,00");
					break;
				case 3:
					System.out.println("Pacote Anual Basic Todos os Esportes (desconto de 15%) $612,00");
					break;
				case 4:
					System.out.println("Pacote Anual Premium Todos os Esportes + treinador (desconto de  20%) $960,00");
					break;

				}

				break;

			case 3:
				System.out.println("Contratar Plano ");

			case 4:
				System.out.println("Cancelar Plano ");

				break;

			default:
				System.out.println("\nOpção Invalida!\n ");

				break;
			}
		}
	}

	public static void sobre() {
		System.out.println(Cores.TEXT_WHITE + "\n   Projeto Criado por:");
		System.out.println(Cores.TEXT_WHITE + "\n   GitHub da equipe:");
		System.out.println("*************************************************");
		System.out.println("                                                 ");
		System.out.println("   Equipe desenvolvedora:                        ");
		System.out.println("                                                 ");
		System.out.println("*************************************************");
		System.out.println("                                                 ");
		System.out.println("   GitHub: Ketelyn Medina                        ");
		System.out.println("   https://github.com/KetelynMM                  ");
		System.out.println("                                                 ");
		System.out.println("*************************************************");
		System.out.println("                                                 ");
		System.out.println("*************************************************");
		System.out.println("                                                 ");
		System.out.println("   GitHub: Leticia Oliveira                      ");
		System.out.println("   https://github.com/intrxnce                   ");
		System.out.println("                                                 ");
		System.out.println("*************************************************");
		System.out.println("                                                 ");
		System.out.println("*************************************************");
		System.out.println("                                                 ");
		System.out.println("   GitHub: Nicolle Sanches                       ");
		System.out.println("   https://github.com/nicollesanches             ");
		System.out.println("                                                 ");
		System.out.println("*************************************************");
		System.out.println("                                                 ");
		System.out.println("*************************************************");
		System.out.println("                                                 ");
		System.out.println("  GitHub: Queren Neves                           ");
		System.out.println("  https://github.com/querenneves                 ");
		System.out.println("                                                 ");
		System.out.println("*************************************************");
		System.out.println("                                                 ");
		System.out.println("*************************************************");
		

	}

}
