import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Videoteca v = new Videoteca();
		int opcao;

		do {
			System.out.println();
			System.out.println("1. Apresentar biblioteca");
			System.out.println("2. Adicionar filme");
			System.out.println("3. Apagar filme");
			System.out.println("4. Editar filme");
			System.out.println("0. Sair");
			System.out.print("Opcao: ");
			opcao = sc.nextInt();
			sc.nextLine();

			if (opcao == 1) {
				v.listarFilmes();

			} else if (opcao == 2) {
    			System.out.println("Título: ");
    			String titulo = sc.nextLine();
    			System.out.println("Ano: ");
    			int ano = sc.nextInt();
    			// TODO: Pede o ano ao utilizador (lê com sc.nextInt())
    			// int ano = sc.nextInt();
    
    			// NOTA: Limpa o buffer depois de leres o ano para evitar loops no menu
    			sc.nextLine(); 
    
    			// TODO: Atualiza o construtor para passar também o ano
    			Filme f = new Filme(titulo, ano); 
    			v.adicionarFilme(f);
			} else if (opcao == 3) {
				// testar primeiro se há filmes para apagar
				if (!v.temFilmes()) { // sustituir
					System.out.println("Não há filmes para apagar.");
				} else {
					System.out.println("Número do filme a apagar: ");
					int num = sc.nextInt();
					sc.nextLine();
					if (num >= 1 && num <= v.totalFilmes()) {
						v.apagarFilme(num);
					} else {
						System.out.println("Numero inválido.");
					}
				}

			} else if (opcao == 4) {
				// testar primeiro se há filmes para editar, depois acrescentar o ano
				if (!v.temFilmes()) { // substituir
					System.out.println("Não há filmes para editar.");
				} else {
					System.out.print("Número do filme a editar: ");
					int num = sc.nextInt();
					sc.nextLine();
					if (num >= 1 && num <= v.totalFilmes()) {
						System.out.println("Novo titulo: ");
						String novoTitulo = sc.nextLine();
						System.out.println("Novo ano: ");
						int novoAno = sc.nextInt();
						sc.nextLine();
						v.editarFilme(num, novoTitulo, novoAno);
					} else {
						System.out.println("Numero inválido.");
					}
				}
			}

		} while (opcao != 0);

		sc.close();
		System.out.println("Ate logo!");
	}
}