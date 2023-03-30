package jasport;

import java.util.Scanner;

import jasport.util.Cores;

public class JaSport {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int pagamento, cpf, celular, opcao, tipo, plano;
		String titular;

		while (true) {
			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
					+ "***********************************************************************");
			System.out.println("                                                                       ");
			System.out.println("       ##    ###    ######   ########   #######  # #######  ########   ");
			System.out.println("       ##   ## ##  ##    ##  ##     ## ##     ## # #     ##    ##      ");
			System.out.println("       ##  ##   ##  ##       ##      # ##     ## # #     ##    ##      ");
			System.out.println("       ## ##     ##  ######  ########  ##     ## # #######     ##      ");
			System.out.println(" ##    ## #########       ## ##        ##     ## # #    ##     ##      ");
			System.out.println(" ##    ## ##     ## ##    ## ##        ##     ## # #     ##    ##      ");
			System.out.println("  ######  ##     ##  ######  ##         #######  # #      ##   ##      ");
			System.out.println("                                                                       ");
			System.out.println("            1 - Listar planos                                          ");
			System.out.println("            2 - Cadastrar                                              ");
			System.out.println("            3 - Atualizar planos                                       ");
			System.out.println("            4 - Cancelar plano                                         ");
			System.out.println("            5 - Sair                                                   ");
			System.out.println("                                                                       ");
			System.out.println("***********************************************************************");
			System.out.println("Entre com a opção desejada:                                            ");
			System.out.println(
					"                                                                       " + Cores.TEXT_RESET);

			opcao = leia.nextInt();

			if (opcao == 5) {
				System.out.println(Cores.TEXT_CYAN_BOLD + "Sporte e bem estar, volte sempre!");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("\nEsportes disponíveis: ");
				System.out.println("Futebol, Vôlei, Basquete e Boxe");
				System.out.println("\tNossos planos: ");
				System.out.println("\n1 - Pacote Mensal Basic Todos os Esportes $60,00");
				System.out.println("\n2 - Pacote Mensal Premium Todos os Esportes + treinador $100,00");
				System.out.println("\n3 - Pacote Anual Basic Todos os Esportes (desconto de 15%) $612,00");
				System.out.println("\n4 - Pacote Anual Premiun Todos os Esportes + treinador (desconto de 20%) $960,00");
				System.out.println("\nVenha fazer parte do nosso clube! Volte ao menu e cadastre-se!");

			case 2:
				do {
					System.out.println("Digite o nome do Titular: ");
					titular = leia.nextLine();
					System.out.println("Digite o CPF: ");
					cpf = leia.nextInt();
					System.out.println("Digite o telefone: ");
					celular = leia.nextInt();
					System.out.println("Digite a forma de pagamento: ");
					pagamento = leia.nextInt();

					pagamento = leia.nextInt();

					switch (pagamento) {
					case 1:

						System.out.println("Cartão de crédito");
						break;
					case 2:
						System.out.println("Cartão de debito");
						break;
					case 3:
						System.out.println("Pix");
						break;
					case 4:
						System.out.println("Boleto");
						break;

					default:
						System.out.println("Opção inválida.");
						break;
					}
				} while (pagamento != 4);
				break;

			case 3:
				System.out.println("Cancelar plano: ");

			case 4:
				System.out.println("Atualizar plano: ");
				break;

			default:
				System.out.println("Obrigada por utilizar nossos serviços: ");
				break;
			}
		}
	}

	public static void sobre() {
		System.out.println("\n**********************************************************");
		System.out.println(" Jaqueline | Ketelyn | Leticia | Queren ");
		System.out.println("************************************************************");

	}
}
