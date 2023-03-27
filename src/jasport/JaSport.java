package jasport;

import java.util.Scanner;

import jasport.util.Cores;

public class JaSport {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int pagamento, cpf;
		String titular, planos, carteira;
		
		while (true) {
			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
					+ "************************************************************************");
			System.out.println("                                                                       ");
			System.out.println(".......##....###.....######..########...#######..# #######..########   ");
            System.out.println(".......##...##.##...##....##.##.....##.##.....##.# #.....##....##...   ");
            System.out.println(".......##..##...##..##.....##.....##.##.....##.# #.....##....##...     ");
            System.out.println(".......##.##.....##..######..########..##.....##.# #######.....##...   ");
			System.out.println(".##....##.#########.....##.##........##.....##.# #...##......##...     ");
			System.out.println(".##....##.##.....##.##....##.##........##.....##.# #....##.....##...   ");
			System.out.println("..######..##.....##..######..##.........#######..# #.....##....##...   ");
            System.out.println("                                                                       ");
			System.out.println("            1 - Contratar plano                                        ");
			System.out.println("            2 - Listar todos os planos                                 ");
			System.out.println("            3 - Minhas assinaturas                                     ");
			System.out.println("            4 - Atualizar planos                                       ");
			System.out.println("            5 - Cancelar plano                                         ");
			System.out.println("            6 - Formas de pagamento                                    ");
			System.out.println("            9 - Sair                                                   ");
			System.out.println("                                                                       ");
			System.out.println("***********************************************************************");
			System.out.println("Entre com a opção desejada:                                            ");
			System.out.println("                                                                       " + Cores.TEXT_RESET);

			leia.close();
			System.exit(0);
	}
	}
}
