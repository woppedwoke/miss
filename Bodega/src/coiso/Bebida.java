package coiso;

public class Bebida {

	
		int codigobebidas;
		String nomebebidas; 
		int teor_alcoolico;
		double preco;
		int quantidade;

		public Bebida (int codigobebidas, String nomebebidas, int teor_alcoolico, double preco, int quantidade) {
			
			this.codigobebidas = codigobebidas;
			this.nomebebidas = nomebebidas;
			this.teor_alcoolico = teor_alcoolico;
			this.preco = preco;
			this.quantidade = quantidade;		
			
	
}
		void comprarBebida (int valor){
			this.quantidade = this.quantidade + valor;
			System.out.println("\ncompra realizada com sucesso!");
			System.out.printf ("Quantidade Em estoque " + this.quantidade+ "\n");
			System.out.println("\n");
		}
		
		boolean venderBebida(int valor){
			if (valor>this.quantidade){
				return false;	
			}
			this.quantidade -= valor;
			return true;
		}
}
