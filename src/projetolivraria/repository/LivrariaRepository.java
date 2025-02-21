package projetolivraria.repository;

import projetolivraria.model.Livro;

public interface LivrariaRepository {

	public void adicionarLivro(Livro livro);

	public void listarLivros();

	public Livro buscarLivro(String titulo);

	public void deletar(String titulo);
}
