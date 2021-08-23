package coiso;
import java.util.*;
public class Bodega {
	public static void main (String[] args){
		Scanner entrada = new Scanner (System.in);
		int opt, lerConta;
		String adm, adm1;

		List<Funcionario> bodegueiros = new ArrayList<>();
		List<Bebida> bebidas = new ArrayList<>();
		List<Clientes> cachaceiros = new ArrayList<>();
		
		int codigoclie = 0;
		String nomeclie;
		double cpf;
		boolean fiado;
		
		
		int codigobebidas = 0;
		String nomebebidas;
		int teor_alcoolico;
		double preco;
		int quantidade; 
		
	
		int codigofunc = 0;
		String nomefunc;
		int idadefunc;
		double salariofunc;
		
		adm = "Boteco do seu joazin";
		System.out.println(adm);
		adm1 = "24.189.321/0001-44\n";
		System.out.println(adm1);
		Empresa e = new Empresa(adm, adm1);
			

	
		
	do{ 
		System.out.println("Digite o que deseja realizar na Bodega\n (1) Cadastrar Funcionarios\n (2) Mostrar Funcionarios\n (3) Cadastrar Bebidas\n (4) Mostrar Bebidas \n (5) Comprar Bebidas\n (6) Vender Bebidas\n (7) Cadastrar Clientes\n (8) Mostrar clientes\n (9)Sair do Sistema  ");
		opt = entrada.nextInt();

		
		if (opt == 1) {
			String lixo = entrada.nextLine();
			
			System.out.println("Digite o nome do Funcionario:");
			nomefunc = entrada.nextLine();
			System.out.println("Digite o Salario:");
			salariofunc = entrada.nextDouble();
			System.out.println("Digite a idade:");
			idadefunc = entrada.nextInt();
			Funcionario fun = new Funcionario(codigofunc, nomefunc, idadefunc, salariofunc);
			codigofunc++;
			bodegueiros.add(fun);
			

		} else if (opt == 2) {
			for (int i = 0; i < codigofunc; i++) {
				Funcionario a = bodegueiros.get(i);
				System.out.println("\nCódigo do funcionario: " + a.codigo);
				System.out.println("\nNome do funcionario(a): " + a.nome);
				System.out.println("\nIdade do funcionario" + a.idade);
				System.out.println("\nSalario do funcionario:" + a.salario);

			}

		} 
		
		else if (opt == 3) {
			String lixo = entrada.nextLine();
			
			System.out.println("Digite o nome da Bebida:");
			nomebebidas = entrada.nextLine();
			System.out.println("Digite o Teor alcoolico:");
			teor_alcoolico = entrada.nextInt();
			System.out.println("Digite o Preço da Bebida:");
			preco = entrada.nextDouble();
			System.out.println("Digite a quantidade:");
			quantidade = entrada.nextInt();
			System.out.println("\n");
			Bebida bebi = new Bebida(codigobebidas, nomebebidas,  teor_alcoolico,  preco, quantidade);
			codigobebidas++;
			bebidas.add(bebi);

		} else if (opt == 4) {
			for (int i = 0; i < codigobebidas; i++) {
				Bebida a = bebidas.get(i);
				System.out.println("\nCódigo da bebida: " + a.codigobebidas);
				System.out.println("\nNome da Bebida(a): " + a.nomebebidas);
				System.out.println("\nTeor Acoolico da Bebida: " + a.teor_alcoolico);
				System.out.println("\nPreço da Bebida: " + a.preco);
				System.out.println("\nQuantidade: " + a.quantidade);

			}

		} else if (opt == 5) {
			System.out.println("\nCódigo da Bebida: ");
			lerConta = entrada.nextInt();//0
			Bebida comprarBebida = bebidas.get(lerConta);
			System.out.println("\nNumero da Conta: " + comprarBebida.codigobebidas);
			System.out.println("Conta do(a): " + comprarBebida.nomebebidas);
			System.out.println("Qual a Quantidade de Compra\n?");//5
			comprarBebida.comprarBebida(entrada.nextInt());
			
		}else if (opt == 6) {
			System.out.println("\nCódigo da Bebida para Venda: ");
			lerConta = entrada.nextInt();
			Bebida venderBebida = bebidas.get(lerConta);
			System.out.println("\nCódigo da Bebida: " + venderBebida.codigobebidas);
			System.out.println("Nome da Bebida(a): " + venderBebida.nomebebidas);
			System.out.println("Qual a Quantidade de venda\n?");
//10
			if (venderBebida.venderBebida(entrada.nextInt())) {
				System.out.println("Venda efetuada!\nQuantidade em Estoque  " + venderBebida.quantidade);

			} else {
				System.out.println("Valor em estoque insuficiente!\n");
			}
			
		}
		else if (opt == 7) {
			String lixo = entrada.nextLine();
			
			System.out.println("Digite o nome do cliente: ");
			nomeclie = entrada.nextLine();
			System.out.println("Digite o Numero do cpf: ");
			cpf = entrada.nextDouble();
			System.out.println("informe se pode ser vendido fiado com true or false: ");
			fiado = entrada.nextBoolean();
			Clientes clie = new Clientes(codigoclie, nomeclie, cpf, fiado);
			codigoclie++;
			cachaceiros.add(clie);

		} else if (opt == 8) {
			for (int i = 0; i < codigoclie; i++) {
				Clientes a = cachaceiros.get(i);
				System.out.println("Código do Cliente:\n " + a.codigoclie);
				System.out.println("Nome do Cliente(a):\n " + a.nomeclie);
				System.out.println("Cpf do Cliente:\n " + a.cpf);
				System.out.println("Pode ser Vendido fiado:\n " + a.fiado);
				

			}

		
			
		
		}
		
	} while(opt != 9);
	
}
}	


