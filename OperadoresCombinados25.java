
public class OperadoresCombinados25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salario=1000, vendas=100, capital=1000;
		double Aumento=10, Fatorjuro=1.05, iva=20;
		int Resto=10;
		salario +=Aumento;
		System.out.println("s�lario depois do aumento="+salario);
		vendas-=iva;
		System.out.println("Vendas l�quidas="+vendas);
		capital *=Fatorjuro;
		System.out.println("Capital acumulado="+capital);
		Resto%=3;
		System.out.println("Resto da divis�o de 10 por 3="+Resto);
		
	}

}
