import java.util.ArrayList;

public class Videoteca {
	private String nome = "Os meus filmes";
	private ArrayList<Filme> filmes = new ArrayList<>();

	public String getNome() {
		return nome;
	}

	public int totalFilmes() {
		return filmes.size();
	}

	public void listarFilmes() {
		// mostra o nome da videoteca
		System.out.println("=== " + nome + " ===");
		// Testa primeiro se a videoteca tem filmes
		if(!filmes.isEmpty())
		{
			for (int i = 0; i < filmes.size(); i++) {
				System.out.println((i + 1) + ". " + filmes.get(i));
			}
			System.out.println("======");
		}
		else {
			System.out.println("Videoteca vazia");
		}
	}
	
	
	public void adicionarFilme(Filme filme) {
		filmes.add(filme);
		System.out.println("Filme adicionado");
		// Completa o método para adicionar o filme
	}

	public void apagarFilme(int numero) {
		if( numero > 0 && numero <= filmes.size())
		{
				filmes.remove(numero - 1);
				System.out.println("Filme apagado");
		}
		// Completa o método para apagar o filme
		
	}
	
	public void editarFilme(int numero, String novoTitulo, int novoAno) {

	    if(numero > 0 && numero <= filmes.size()) {

	        filmes.get(numero - 1).setFilme(novoTitulo, novoAno);

	    } else {

	        System.out.println("Filme não encontrado");

	    }
	}
	public boolean temFilmes() {
	    return !filmes.isEmpty();
	}
}