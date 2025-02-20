package projetolivraria.atocadolivro;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int opcao;

		do {
			System.out.println("**************************************************");
			System.out.println("                                                  ");
			System.out.println("             A Toca do Livro                      ");
			System.out.println("                                                  ");
			System.out.println("**************************************************");
			System.out.println("                                                  ");
			System.out.println("             1 - Crie seu cadastro                ");
			System.out.println("             2 - Adicionar livro no carrinho      ");
			System.out.println("             3 - Listar livros                    ");
			System.out.println("             4 - Buscar livro                     ");
			System.out.println("             5 - Deletar livro                    ");
			System.out.println("             6 - Sair                             ");
			System.out.println("                                                  ");
			System.out.println("**************************************************");
			System.out.println(" Digite uma opção:                                ");

			try {

				opcao = leia.nextInt();

			} catch (InputMismatchException e) {
				System.out.println("\nDigite um número inteiro ");
				leia.nextLine();
				opcao = 0;

			}

			if (opcao == 5) {
				System.out.println("   \n A Toca do Livro    ");
				leia.close();
				System.exit(0);

			}

			switch (opcao) {
			case 1:
				System.out.println("Crie seu cadastro \n\n");
				keyPress();
				break;

			case 2:
				System.out.println("Adicionar livro no carrinho \n\n");
				keyPress();
				break;

			case 3:
				System.out.println("Listar livro \n\n");
				keyPress();
				break;

			case 4:
				System.out.println("Buscar livro \n\n");
				keyPress();
				break;

			case 5:
				System.out.println("Deletar livro \n\n");
				keyPress();
				break;
				
			case 6:
				System.out.println("Sair \n\n");
				keyPress();
				break;

			default:
				System.out.println("\n Opção inválida \n");

			}

		} while (opcao != 6);
	}

	public static void keyPress() {

		try {

			System.out.println("\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}

	}

}
