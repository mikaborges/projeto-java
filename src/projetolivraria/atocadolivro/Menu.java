package projetolivraria.atocadolivro;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import projetolivraria.contoller.LivroController;
import projetolivraria.model.Livro;
import projetolivraria.model.LivroDigital;
import projetolivraria.model.LivroFisico;

public class Menu {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		LivroController livros = new LivroController(); 
		int opcao;

		do {
			System.out.println("**************************************************");
			System.out.println("                                                  ");
			System.out.println("             A Toca do Livro                      ");
			System.out.println("                                                  ");
			System.out.println("**************************************************");
			System.out.println("                                                  ");
			System.out.println("                                                  ");
			System.out.println("             1 - Adicionar livro                  ");
			System.out.println("             2 - Listar livros                    ");
			System.out.println("             3 - Buscar livro                     ");
			System.out.println("             4 - Deletar livro                    ");
			System.out.println("             5 - Sair                             ");
			System.out.println("                                                  ");
			System.out.println("                                                  ");
			System.out.println("**************************************************");
			System.out.println(" Digite uma opção:                                ");

			try {

				opcao = leia.nextInt();
				leia.skip("\\R?");

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
				String titulo, autor, formato, tipoDeCapa;
				int tipo, anoDePublicacao, tamanhoDoArquivo, numeroDePaginas ;
				System.out.println("Adicionar livro (tipo 1 - Físico ou tipo 2 - Digital): \n\n");
				tipo = leia.nextInt();
				leia.skip("\\R?");
				
				System.out.println("Qual o título do livro?: ");
				titulo = leia.nextLine();
				System.out.println("Qual o(a) autor(a) do livro?: \n\n ");
				autor = leia.nextLine();
				System.out.println("Qual o ano de publicação do livro?: \n\n ");
				anoDePublicacao = leia.nextInt();
				leia.skip("\\R?");
				Livro livro;
				
				if (tipo == 1) {
					System.out.println("Qual o número de páginas?: ");
					numeroDePaginas = leia.nextInt();
					leia.skip("\\R?");
					System.out.println("Qual o tipo de capa? Ex: Capa dura: ");
					tipoDeCapa = leia.nextLine();
					
					livro = new LivroFisico (titulo, autor, anoDePublicacao, numeroDePaginas, tipoDeCapa);
				}else {
					
					System.out.println("Qual o formato do arquivo?: ");
				    formato = leia.nextLine();
					System.out.println("Qual o tamanho do arquivo?: ");
					tamanhoDoArquivo = leia.nextInt();
					leia.skip("\\R?");
					
					livro = new LivroDigital(titulo, autor, anoDePublicacao, tamanhoDoArquivo, formato);
					
				}
				
				livros.adicionarLivro(livro);
				
				keyPress();
				break;

			case 2:
				System.out.println("Listar livro: \n\n");
				livros.listarLivros();
				keyPress();
				break;

			case 3:
				System.out.println("Buscar livro: \n\n");
				
				System.out.println("Qual o título do livro?: ");
				titulo = leia.nextLine();
				livros.buscarLivro(titulo);
				keyPress();
				break;

			case 4:
				System.out.println("Deletar livro: \n\n");
				System.out.println("Qual o título do livro?: ");
				titulo = leia.nextLine();
				livros.deletar(titulo);
				keyPress();
				break;
				
			case 5:
				System.out.println("Sair \n\n");
				keyPress();
				break;

			default:
				System.out.println("\n Opção inválida \n");

			}

		} while (opcao != 5);
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
