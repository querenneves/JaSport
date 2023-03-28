package jasport;

import java.util.Scanner;

import jasport.util.Cores;

public class JaSport {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int pagamento, cpf, data_nasc, celular, opcao;
		String nome, email, plano;
		
		while (true) {
			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
					+ "************************************************************************");
			System.out.println("                                                                       ");
			System.out.println(".......##....###.....######..########...#######..# #######..########   ");
            System.out.println(".......##...##.##...##....##.##.....##.##.....##.# #.....##....##...   ");
            System.out.println(".......##..##...##..##.....##.....  ## ##... ### #..... ##.... ##...   ");
            System.out.println(".......##.##.....##..######..########..##.....##.# #######.....##...   ");
			System.out.println(".##....##.#########.....  ##.##........##.....##.# #...##..... ##...   ");
			System.out.println(".##....##.##.....##.##....##.##........##.....##.# #....##.....##...   ");
			System.out.println("..######..##.....##..######..##.........#######..# #.....##....##...   ");
            System.out.println("                                                                       ");
			System.out.println("            1 - Listar planos                                          ");
			System.out.println("            2 - Contratar plano                                        ");
			System.out.println("            3 - Atualizar planos                                       ");
			System.out.println("            4 - Cancelar plano                                         ");
			System.out.println("            5 - Sair                                                   ");
			System.out.println("                                                                       ");
			System.out.println("***********************************************************************");
			System.out.println("Entre com a opção desejada:                                            ");
			System.out.println("                                                                       " + Cores.TEXT_RESET);

			
			
			opcao = leia.nextInt();
			sobre();
			
		switch (opcao) {
		case 1:
			System.out.println("Opções de planos: ");
			
			break;
			
		case 2:
			System.out.println("Digite o seu nome: ");
			
			break;
			
		case 3:
			System.out.println("Atualizar planos: ");
			
			break;
			
		case 4:
			System.out.println("Cancelar plano: ");
			
			break;
			
			default: 
				System.out.println("Obrigada por utilizar nossos serviços: ");
				break;
		}
		}
	}
		public static void sobre() {
			System.out.println("\n**********************************************************");
			System.out.println(" Jaqueline | Ketelyn | Leticia | Leticia | Queren | Raynaldo");
			System.out.println("************************************************************");
		
}
}