import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class LeituraDeDadosAlfaNumericos27 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String S = "";
		System.out.print("Digite uma cadeia de caracteres: " );
		InputStreamReader ler = new InputStreamReader(System.in);
		BufferedReader Guardas = new BufferedReader(ler);
		S = Guardas.readLine();
		System.out.println("Digitou: " + S);
	}

}
