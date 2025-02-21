package projetolivraria.model;

public abstract class Livro {
	private String titulo;
	private String autor;
	private int anoDePublicacao;
	
	public Livro(String titulo, String autor, int anoDePublicacao) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoDePublicacao = anoDePublicacao;
	}
	
	public Livro() {
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnoDePublicacao() {
		return anoDePublicacao;
	}

	public void setAnoDePublicacao(int anoDePublicacao) {
		this.anoDePublicacao = anoDePublicacao;
	}

	public void ler() {
		System.out.println("Lendo livro");
	}
	
	public void visualizar() {
		System.out.println("\n\n***************************************");
		System.out.println("Dados do livro ");
		System.out.println("*******************************************");
		System.out.println("Título do livro " + this.titulo);
		System.out.println("Autor(a) do livro " + this.autor);
		System.out.println("Ano de publicação do livro " + this.anoDePublicacao);
	}
}
