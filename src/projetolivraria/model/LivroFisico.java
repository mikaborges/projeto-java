package projetolivraria.model;

public class LivroFisico extends Livro {
	private int numeroDePaginas;
	private String tipoDeCapa;
	
	public LivroFisico(String titulo, String autor, int anoDePublicacao, int numeroDePaginas, String tipoDeCapa) {
		super(titulo, autor, anoDePublicacao);
		this.numeroDePaginas = numeroDePaginas;
		this.tipoDeCapa = tipoDeCapa;
	}
	
	LivroFisico() {
		
	}

	public int getNumeroDePaginas() {
		return numeroDePaginas;
	}

	public void setNumeroDePaginas(int numeroDePaginas) {
		this.numeroDePaginas = numeroDePaginas;
	}

	public String getTipoDeCapa() {
		return tipoDeCapa;
	}

	public void setTipoDeCapa(String tipoDeCapa) {
		this.tipoDeCapa = tipoDeCapa;
	}
	
	public void ler() {
		System.out.println("Lendo livro físico");
	}
	public void visualizar() {
		super.visualizar();
		System.out.println("Número de páginas: " + this.numeroDePaginas);
		System.out.println("Tipo de capa: " + this.tipoDeCapa);
	}
	
	
	
}
