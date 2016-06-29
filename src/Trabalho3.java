import java.util.Locale;
import java.util.Scanner;

public class Trabalho3 {


	/*Esta fun��o mostra na tela o menu.
	 *
	 */
	public static void mostrarMenu(){
		System.out.println("\n\n \t---------------------------------------------");
		System.out.println("\n1 - Imprimir tabela");
		System.out.println("2 - Pesquisar Produto");
		System.out.println("3 - Mostrar Produto mais caro");
		System.out.println("4 - Mostrar c�digo e descri��o dos produtos cuja quantidade est� abaixo de 10 ");
		System.out.println("5 - Ativo total do estoque");
		System.out.println("6 - Efetuar uma venda");
		System.out.println("7 - Sair");
		
		System.out.println("Digite uma op��o de 1 a 7\n");
	}

	

	/*Esta fun��o mostra na tela, a tabela dos produtos inseridos anteriormente
	 * @param Codigo[] � o C�digo do produto.
	 * @param Descricao[] � a Descri��o do produto.
	 * @param Preco[] � o Pre�o do produto.
	 * @param Estoque[] � a quantidade existente do produto no estoque.
	 * @param N � a quantidade de produtos declarados pelo usuario.
	 * @param i contador.
	 */
	public static void mostrarTabela(String Produto[], int Codigo[], String Descricao[], double Preco[], int Estoque[], int N){
		int i;
			
			System.out.print("\nProduto");
			System.out.print("\t\tC�digo do Produto");
			System.out.print("\tDescri��o ");
			System.out.print("\tPre�o ");
			System.out.print("\t\tQuantidade no Estoque\n ");
			
			for(i=1; i<N+1; i++){
				System.out.print("\n" + Produto[i] + "\t\t\t"  + Codigo[i] + "\t\t\t" + Descricao[i] + "\t\t"
						+ Preco[i] + "\t\t\t" + Estoque[i]);
			}
		
	
	}



	/*Esta fun��o pesquisa um produto diante ao c�digo inserido pelo usando em base aos C�digo dos produtos existentes. 
	 * @param Codigo[] � o C�digo do produto.
	 * @param Descricao[] � a Descri��o do produto.
	 * @param Preco[] � o Pre�o do produto.
	 * @param Estoque[] � a quantidade existente do produto no estoque.
	 * @param N � a quantidade de produtos declarados pelo usu�rio.
	 * @param pesquisa � inserido pelo usu�rio para analisar se existe o c�digo.
	 * @param i contador.
	 * @param pos � a posi��o que o vetor toma
	 * @param totalEstoque Pre�o do total em reais da quantidade do produto existente no estoque.
	 */
	public static void pesquisarProduto(String Produto[], int Codigo[], String Descricao[], double Preco[], int Estoque[], int N, int pesquisa){
		int i, pos;
		double totalEstoque;
		
		pos=0;
		
		for(i=1; i<N+1; i++){
			if(pesquisa == Codigo[i]){
				pos=i;
			}			
		}
		if(pos!=0){
			totalEstoque = 0;
			totalEstoque = (Preco[pos] * Estoque[pos]);
			
			System.out.println("\nProduto");
			System.out.print("\tC�digo do Produto");
			System.out.print("\tDescri��o ");
			System.out.print("\tPre�o ");
			System.out.print("\t\tQuantidade no Estoque ");
			System.out.println("\t\tValor Total no Estoque\n");
			
			System.out.println("\n" + Produto[pos] + "\t\t\t"  + Codigo[pos] + "\t\t\t" + Descricao[pos] + "\t\t"
					+ Preco[pos] + "\t\t\t" + Estoque[pos] + "\t\t\t\t" + totalEstoque);
		}
		else{
			System.out.println("C�digo inexistente");
		}
		
	}



	/*Esta fun��o mostra na tela o produto no qual � o mais caro
	* @param Codigo[] � o C�digo do produto.
	* @param Descricao[] � a Descri��o do produto.
	* @param Preco[] � o Pre�o do produto.
	* @param Estoque[] � a quantidade existente do produto no estoque.
	* @param N � a quantidade de produtos declarados pelo usuario.
	* @param pos � a posi��o que o vetor toma
	* @param i Contador
	*/
	public static void mostrarProdutoMaisCaro(String Produto[], int Codigo[], String Descricao[], double Preco[], int Estoque[], int N){
	int pos, i;
	pos = 1;
				for(i=1; i<N+1; i++){
					
					if (Preco[i] > Preco[pos]) {
						pos = i;
					}
					
				}
			System.out.println("\n" + Produto[pos] + "\t\t\t"  + Codigo[pos] + "\t\t\t" + Descricao[pos] + "\t\t"
					+ Preco[pos] + "\t\t\t" + Estoque[pos]);
	}
	


	/*Esta fun��o mostra os Produtos que est�o com quantidade menor que Dez.
	* @param Codigo[] � o C�digo do produto.
	* @param Descricao[] � a Descri��o do produto.
	* @param Preco[] � o Pre�o do produto.
	* @param Estoque[] � a quantidade existente do produto no estoque.
	* @param N � a quantidade de produtos declarados pelo usuario.
	* @param i Contador
	*/
	public static void mostrarProdutoAbaixoDeDez(String Produto[], int Codigo[], String Descricao[], double Preco[], int Estoque[], int N){
		int i;
		
			for(i=1; i<N+1; i++){
					if(Estoque[i] < 10){
						System.out.println(Codigo[i] + "\t\t\t" + Descricao[i] );
					}
				}
	}
	
	
	
	/*Esta fun��o mostra a soma total de todos os produtos do estoque.
	* @param Codigo[] � o C�digo do produto.
	* @param Descricao[] � a Descri��o do produto.
	* @param Preco[] � o Pre�o do produto.
	* @param Estoque[] � a quantidade existente do produto no estoque.
	* @param N � a quantidade de produtos declarados pelo usuario.
	* @param somaTotalEstoque  � o valor total dos produtos do estoque
	 */
	public static void ativoTotalEstoque(double Preco[], int Estoque[], int N){
	
		double somaTotalEstoque, i;
		
	somaTotalEstoque = 0;
	
			for(i=1; i<N+1; i++){
				somaTotalEstoque = ((Preco[(int) i]*Estoque[(int) i]) + somaTotalEstoque);
		}
			
	        System.out.println ("R$ " + String.format ("%,.2f", somaTotalEstoque));
			
			
		
	}



	/*
	* @param Codigo[] � o C�digo do produto.
	* @param Descricao[] � a Descri��o do produto.
	* @param Preco[] � o Pre�o do produto.
	* @param Estoque[] � a quantidade existente do produto no estoque.
	* @param N � a quantidade de produtos declarados pelo usuario.
	* @param i Contador
	* @param CodigoVenda[] � o c�digo inserido pelo usu�rio para a buscar o produto para assim efetuar a venda.
	* @param QuantidadeVend[] � a quantidade exigida pelo usu�rio para comparar a quantidade existente no estoque.
	* @param pos � a posi��o que o vetor toma
	*/
	public static void efetuarVenda(String Produto[], int Codigo[], String Descricao[], double Preco[], int Estoque[], int N){
		Scanner sc = new Scanner(System.in);
		int i, CodigoVenda, QuantidadeVend, pos;
		
	
		pos = 0;
		QuantidadeVend=0;
		CodigoVenda = 0 ;
		
	
	System.out.println("C�digo do Produto");
	CodigoVenda = sc.nextInt();
	
				for(i=1; i<N+1; i++){
					
					 if(CodigoVenda == Codigo[i]){
						 pos = i;
					 }

				}
				
				if(pos != 0){
					
					System.out.println("Quantidade a ser vendida: ");
					QuantidadeVend = sc.nextInt();
					
						if(QuantidadeVend <= Estoque[pos]){
							Estoque[pos] = Estoque[pos] - QuantidadeVend;
							System.out.println(Produto[pos] + "\t\t\t" + Codigo[pos] + "\t\t\t" + Descricao[pos] + "\t\t"
								+ Preco[pos] + "\t\t\t" + "\n");
							System.out.println("\nVenda Feita com Sucesso! ");
						}
						else{
							System.out.println("Quantidade insuficiente");
						}
			}
				else{
					System.out.println("Produto n�o encontrado! ");
				}
				
	}

	
	
	/*Esta fun��o abandona/finaliza o Programa.
	*/
	public static void exit(){
		Scanner sc = new Scanner(System.in);
		
		sc.close();
	
	}
	
	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		

		
		String Descricao[], Produto[];
		int i, N, Codigo[], acao, pesquisa, Estoque[];
		double Preco [];
		
		
		
		
		System.out.println("Quantos produtos deseja digitar? ");
		N = sc.nextInt();
		
		
		Produto = new String[N+1];
		Codigo = new int[N+1];
		Estoque = new int[N+1];
		Preco = new double[N+1];
		Descricao = new String[N+1];
		
		System.out.println("Digite os elementos da tabela: ");
		
		for(i=1; i<N+1; i++){
			
			System.out.println("\nProduto");
			Produto[i] = sc.next();
			
			System.out.println("\nC�digo do Produto:");
			Codigo[i] = sc.nextInt();
			
			System.out.println("\nDescri��o:");
			Descricao[i] = sc.next();
			
			
			System.out.println("\nPre�o:");
			Preco[i] = sc.nextDouble();
			
			
			System.out.println("\nQuantidade no Estoque:");
			Estoque[i] = sc.nextInt();
		}
	
			
		acao = 0;
		
		
		if(acao<0 || acao>7){
			System.out.println("Por favor, Insira um n�mero entre o 1 e 7");
		}
		
			mostrarMenu();
			acao = sc.nextInt();
			
		while(acao != 7){
			
			
			if(acao == 1){
				mostrarTabela(Produto, Codigo, Descricao, Preco, Estoque, N);
				System.out.println("\n");

				mostrarMenu();
				acao = sc.nextInt();
				}
			if(acao == 2 ){
				System.out.println("Digite o c�digo do produto: ");
				pesquisa = sc.nextInt();
				pesquisarProduto(Produto, Codigo, Descricao, Preco, Estoque, N, pesquisa);
				System.out.println("\n");

				mostrarMenu();
				acao = sc.nextInt();
			}
			
			if(acao == 3){
				mostrarProdutoMaisCaro(Produto, Codigo, Descricao, Preco, Estoque, N);

				mostrarMenu();
				acao = sc.nextInt();
			}
				
			if(acao == 4){

				mostrarProdutoAbaixoDeDez(Produto, Codigo, Descricao, Preco, Estoque, N);

				mostrarMenu();
				acao = sc.nextInt();				
			}

			if(acao == 5){
				ativoTotalEstoque(Preco, Estoque, N);

				mostrarMenu();
				acao = sc.nextInt();				
				
			}
			
			if(acao == 6){

				efetuarVenda(Produto, Codigo, Descricao, Preco, Estoque, N);


				mostrarMenu();
				acao = sc.nextInt();
			}
			if(acao == 7){
				exit();


			}
		}
		sc.close();
	}
}
