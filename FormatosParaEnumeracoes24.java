
public class FormatosParaEnumeracoes24 {
	enum Situacao {Aprovado, Oral, Reprovado};
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String Enumeracao = String.format("Geral %10s\nNúmero%9d\n",Situacao.Aprovado, (int)Situacao.Oral.ordinal()+1);
		System.out.printf(Enumeracao);
	}

}
