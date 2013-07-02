import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class LerLogicos29 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		boolean verdadeouNao, Resul;
		String S= "";
		InputStreamReader lerS = new InputStreamReader(System.in);
		BufferedReader GuardaS = new BufferedReader(lerS);
		System.out.print("3*5=18 ?");
		S = GuardaS.readLine();
		Resul=(3*5==18);
		verdadeouNao=Boolean.valueOf(S);
		System.out.println("Respondeu: " + verdadeouNao);
		System.out.println("A resposta correta é " + Resul);
	}

}
