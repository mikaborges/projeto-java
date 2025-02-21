package projetolivraria.model;

public class LivroDigital extends Livro{
	private int tamanhoDoArquivo;
	private String formato;
	
	public LivroDigital(String titulo, String autor, int anoDePublicacao, int tamanhoDoArquivo, String formato) {
		super(titulo, autor, anoDePublicacao);
		this.tamanhoDoArquivo = tamanhoDoArquivo;
		this.formato = formato;
	}
	
	
	public LivroDigital() {
		
	}


	public int getTamanhoDoArquivo() {
		return tamanhoDoArquivo;
	}

	public void setTamanhoDoArquivo(int tamanhoDoArquivo) {
		this.tamanhoDoArquivo = tamanhoDoArquivo;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}
	
	public void ler() {
		System.out.println("Lendo livro digital");
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Tamanho do livro: " + this.tamanhoDoArquivo);
		System.out.println("Formato do livro: " + this.formato);
		
	}
	
	

}
