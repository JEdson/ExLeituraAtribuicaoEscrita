
public class AlinhamentoCentroDadosAlfanumericos23 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cabecalho = String.format("%1$8s%2$25s\n", "Nome", "Localidade");
		System.out.print(cabecalho);
		System.out.printf(String.format("%1$-20s%2$-30s\n", "Tereza pinto", "4100-225 Porto"));
		System.out.printf(String.format("%1$-20s%2$-30s\n", "Abel Pereira", "1200-125 Coimbra"));
	}

}
