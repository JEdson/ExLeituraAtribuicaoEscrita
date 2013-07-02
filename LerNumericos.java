import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class LerNumericos {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String C = "";
		System.out.print("Digite um Digito: " );
		InputStreamReader lerS = new InputStreamReader(System.in);
		BufferedReader GuardaS = new BufferedReader(lerS);
		C = GuardaS.readLine();
		System.out.printf("Digitou: %d ", Integer.valueOf(C));
	}

}
