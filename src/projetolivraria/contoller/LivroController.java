package projetolivraria.contoller;

import java.util.ArrayList;


import projetolivraria.model.Livro;
import projetolivraria.repository.LivrariaRepository;

public class LivroController implements LivrariaRepository{
	private ArrayList<Livro> listaLivros = new ArrayList<Livro>();
	

	@Override
	public void adicionarLivro(Livro livro) {
		if(livro != null) {
			listaLivros.add(livro);
			System.out.println("\n Livro " + livro.getTitulo() + " adicionado com sucesso");
		}else {
			System.out.println("Livro inválido");
		}
		
	}

	@Override
	public void listarLivros() {
		for (var livro : listaLivros) {
			livro.visualizar();   
		}
		
	}

	@Override
	public Livro buscarLivro(String titulo) {
		Livro livro = null;
		for (var l : listaLivros) {
			if (l.getTitulo().equals(titulo)) {
				livro = l;
			}
			
		}
		
		if (livro == null) {
			System.out.println("Livro não encontrado");
		} else {
			livro.visualizar();
		}
		
		return livro;
		
	}

	@Override
	public void deletar(String titulo) {
		Livro livro = buscarLivro(titulo);
		if(livro != null) {
			listaLivros.remove(livro);
			System.out.println("Livro apagado");
		}
		
		
		
	}

}
