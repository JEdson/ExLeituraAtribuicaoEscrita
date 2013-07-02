
public class PrefixosEPosfixos26 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valor1, valor2;
		int variacao=10;
		valor1 = variacao++;
		valor2 = variacao++;
		System.out.println("Incremmentador posfixo: primeiro atribui o valor e depois incrementa");
		System.out.printf("valor1=%d e variacao=%d\n", valor1, variacao);
		variacao=10;
		valor1=++variacao;
		System.out.println("Incrementador prefixo: primeiro incrementa e depois atribui o valor ");
		System.out.printf("Variação=%d e valor1=%d \n", variacao, valor1);
		System.out.println("Incrementador posfixo: primeiro atribui o valor e depois incrementa");
		System.out.printf("Valor2=%d e variacao=%d \n", valor2 , variacao);
		variacao=10;
		valor2=--variacao;
		System.out.println("Incrementador prefixo: primeiro incrementa e depois atribui o valor ");
		System.out.printf("Variação=%d e valor2=%d \n", variacao, valor2);
	}

}
